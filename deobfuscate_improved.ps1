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

Write-Host "Starting deobfuscation..." -ForegroundColor Green
$decompiledFiles = Get-ChildItem -Path "decompiled\club\evon" -Filter "*.java" -Recurse
$total = $decompiledFiles.Count
$current = 0
$processed = 0

foreach ($file in $decompiledFiles) {
    $current++
    $className = $file.BaseName
    
    if ($mappings.ContainsKey($className)) {
        $newName = $mappings[$className]
        Write-Progress -Activity "Deobfuscating files" -Status "Processing: $className -> $newName" -PercentComplete (($current / $total) * 100)
        Write-Host "  [$current/$total] $className -> $newName" -ForegroundColor Cyan
        
        $content = Get-Content -Path $file.FullName -Raw -Encoding UTF8
        
        $content = $content -replace "public (final |abstract )?class $className\b", "public `$1class $newName"
        $content = $content -replace "final class $className\b", "final class $newName"
        $content = $content -replace "class $className\b", "class $newName"
        $content = $content -replace "enum $className\b", "enum $newName"
        $content = $content -replace "interface $className\b", "interface $newName"
        
        $content = $content -replace "import club\.evon\.$className\b", "import club.evon.$newName"
        
        foreach ($oldName in $mappings.Keys) {
            $newClassName = $mappings[$oldName]
            if ($oldName -ne $className) {
                $pattern = "\b$oldName\b"
                $content = $content -replace $pattern, $newClassName
            }
        }
        
        $newPath = $file.FullName -replace [regex]::Escape($className), $newName
        $newPath | Split-Path -Parent | ForEach-Object { 
            if (-not (Test-Path $_)) {
                New-Item -ItemType Directory -Force -Path $_ | Out-Null
            }
        }
        
        Set-Content -Path $newPath -Value $content -Encoding UTF8 -NoNewline
        $processed++
    }
}

Write-Host ""
Write-Host "Deobfuscation complete!" -ForegroundColor Green
Write-Host "Processed files: $processed of $total" -ForegroundColor Yellow
Write-Host "Files without mapping: $($total - $processed)" -ForegroundColor Yellow

