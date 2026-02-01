# Скрипт для деобфускации декомпилированных .class файлов

$mappings = @{
    "_6" = "KeyBindingWrapper"
    "yS" = "KeyBindingManager"
    "yP" = "EventBus"
    "z1" = "EventListener"
    "JV" = "RotationManager"
    "vD" = "HotbarManager"
    "ym" = "MinecraftHelper"
    "vV" = "RenderHelper"
    "yj" = "RotationHelper"
    "zk" = "AimHelper"
    "yL" = "ModuleManager"
    "zy" = "EvonClient"
    "vJ" = "ModuleBase"
    "B" = "Property"
    "vt" = "Event"
    "vq" = "MovementEvent"
    "vE" = "StepEvent"
    "vg" = "ItemUseCooldownEvent"
    "z0" = "VelocityUpdateEvent"
    "yr" = "MoveEvent"
    "vS" = "PostMovementEvent"
    "y3" = "GameLoopEvent"
    "_E" = "DisconnectedEvent"
    "J0" = "BlockPlaceEvent"
    "vf" = "ChatMessageEvent"
    "v3" = "PacketReceiveEvent"
    "v2" = "PacketSendEvent"
    "v1" = "PreMovementEvent"
    "e" = "RenderEvent"
    "g_" = "ResolutionChangeEvent"
    "yf" = "RenderEvent"
    "_d" = "ClientPlayerInteractionManagerAccessor"
    "JL" = "EventMarker"
    "_G" = "PacketWrapper"
    "z3" = "FrustumManager"
    "__" = "PathFinder"
    "_0" = "RotationMathHelper"
    "z5" = "PathNode"
    "J4" = "PathNodeComparator"
    "_1" = "Side"
    "yJ" = "IntWrapper"
    "z_" = "StringList"
    "yB" = "RaycastResult"
    "vU" = "RaycastHelper"
    "_v" = "MathUtil"
    "Jd" = "StringArrayHelper"
    "ds" = "ObfuscationHelper"
    "gQ" = "Module"
    "C" = "StaticEventBus"
    "_S" = "EventListenerAnnotation"
    "h" = "EventDispatcher"
    "vK" = "JoinWorldEvent"
    "_c" = "AimHelperUtil"
    "JD" = "MovementHelper"
    "J_" = "PositionHelper"
    "gY" = "PacketHelper"
    "vA" = "ModuleHelper"
    "vz" = "ConfigHelper"
    "yQ" = "RenderUtil"
    "ya" = "ColorHelper"
    "zP" = "BlockHelper"
}

Write-Host "Starting deobfuscation of decompiled .class files..."
$decompiledFiles = Get-ChildItem -Path "decompiled\club\evon" -Filter "*.java" -Recurse
$total = $decompiledFiles.Count
$current = 0

foreach ($file in $decompiledFiles) {
    $current++
    $className = $file.BaseName
    Write-Progress -Activity "Deobfuscating files" -Status "Processing $className" -PercentComplete (($current / $total) * 100)
    
    if ($mappings.ContainsKey($className)) {
        $newName = $mappings[$className]
        Write-Host "  Mapping: $className -> $newName"
        
        $content = Get-Content -Path $file.FullName -Raw -Encoding UTF8
        
        # Заменяем имя класса
        $content = $content -replace "public (final |abstract )?class $className", "public `$1class $newName"
        $content = $content -replace "class $className", "class $newName"
        
        # Заменяем ссылки на класс в коде
        foreach ($oldName in $mappings.Keys) {
            $newClassName = $mappings[$oldName]
            if ($oldName -ne $className) {
                $content = $content -replace "\b$oldName\b", $newClassName
            }
        }
        
        # Сохраняем деобфусцированный файл
        $newPath = $file.FullName -replace $className, $newName
        $newPath | Split-Path -Parent | ForEach-Object { New-Item -ItemType Directory -Force -Path $_ | Out-Null }
        Set-Content -Path $newPath -Value $content -Encoding UTF8 -NoNewline
    }
}

Write-Host "Deobfuscation complete! Processed $total files."

