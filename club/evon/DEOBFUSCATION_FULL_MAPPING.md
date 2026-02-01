# Полный маппинг деобфусцированных имен

## Базовые классы

### Event System
- `vt` → `Event` (базовый класс событий)
  - `e()` → `isCancelled()`
  - `K()` → `cancel()`
  - `h(boolean)` → `setCancelled(boolean)`
- `JL` → `EventMarker` (интерфейс-маркер для событий)

## События (Events)

### Movement Events
- `vq` → `MovementEvent`
  - `l()` → `getX()`
  - `u()` → `getY()`
  - `v()` → `getZ()`
  - `w()` → `getYaw()`
  - `z()` → `getPitch()`
  - `N()` → `getPrevYaw()`
  - `g()` → `getPrevPitch()`
  - `O()` → `isOnGround()`
- `vs` → `PostMovementEvent`
- `v1` → `PreMovementEvent`
- `yr` → `MoveEvent`
  - `a()` → `getMovement()`
  - `i()` → `getSpeed()`
  - `e(double)` → `setSpeed(double)`
  - `D(double, float)` → `setSpeedAndYaw(double, float)`
- `vE` → `StepEvent`
  - `l()` → `getMovement()`
- `z0` → `VelocityUpdateEvent`
  - `P()` → `getSpeed()`
  - `I()` → `getMovementInput()`

### Input Events
- `vg` → `ItemUseCooldownEvent`
  - `m()` → `getCooldown()`
  - `w(int)` → `setCooldown(int)`
- `_D` → `MouseInputEvent`
- `vF` → `PostInputEvent`

### Game Loop Events
- `y3` → `GameLoopEvent`
  - `A()` → `isTick()`
- `yN` → `TickEvent`
- `_Y` → `PostTickEvent`
- `vK` → `JoinWorldEvent`
- `_E` → `DisconnectedEvent`

### Block Events
- `J0` → `BlockPlaceEvent`
  - `P()` → `getBlockHitResult()`
- `vS` → `PostMovementEvent` (с блоками)

### Packet Events
- `v3` → `PacketReceiveEvent`
  - `d()` → `getPacket()`
- `v2` → `PacketSendEvent`
  - `N()` → `getPacket()`
  - `v(packet)` → `setPacket(packet)`

### Other Events
- `vf` → `ChatMessageEvent`
  - `W()` → `getMessage()`
- `e` → `RenderEvent`
  - `K()` → `getDrawContext()`
  - `e()` → `getTickDelta()`
- `g_` → `ResolutionChangeEvent`

## Менеджеры (Managers)

- `zy` → `EvonClient` (главный класс мода)
  - `p()` → `getInstance()`
- `yS` → `KeyBindingManager`
  - `y()` → `getInstance()`
  - `J()` → `getAttackKey()`
  - `e()` → `getUseKey()`
  - `t(keyBinding)` → `getWrapper(keyBinding)`
  - `h()` → `update()`
- `_6` → `KeyBindingWrapper`
  - `O()` → `isPressed()`
  - `e()` → `wasPressed()`
  - `M()` → `shouldShowSwings()`
  - `L()` → `getKeyBinding()`
- `JV` → `RotationManager`
  - `M()` → `getRotationHelper()`
- `vD` → `HotbarManager`
  - `a()` → `getInstance()`
  - `y(reset, check)` → `reset(reset, check)`
- `yP` → `EventBus`
  - `F(event)` → `dispatch(event)`
  - `u(listener)` → `register(listener)`
  - `X(listener)` → `unregister(listener)`

## Хелперы (Helpers)

- `ym` → `MinecraftHelper`
  - `m` → `MinecraftClient` instance
- `vV` → `RenderHelper`
  - `B` → `projectionMatrix`
  - `i` → `modelViewMatrix`
  - `L` → `viewMatrix`
- `_g` → `ResolutionChangeHelper`
  - `H(width, height)` → `onResize(width, height)`
- `yj` → `RotationHelper`
  - `d(fallback)` → `getYaw(fallback)`
  - `Q(fallback)` → `getPitch(fallback)`
  - `U()` → `getRotation()`
  - `Z()` → `update()`
- `zk` → `AimHelper`

## Accessors

- `yF` → `ClientPlayerEntityAccessor`
  - `evon$swingHandClientside(hand)`
  - `evon$swingHandServerside(hand)`
- `_d` → `ClientPlayerInteractionManagerAccessor`
  - `evon$getCurrentBreakingPos()`
  - `evon$currentBreakingProgress()`

## Модули

- `gf` → `SprintModule`
  - `z()` → `isEnabled()`
- `gQ` → `Module` (базовый класс модулей)
- `vJ` → `ModuleBase` (базовый класс для модулей)
  - `R()` → `getName()`
  - `v()` → `getParent()`
  - `V()` → `getProperties()`
  - `m()` → `register()`
  - `z()` → `unregister()`

## Другие классы

- `C` → `EventBus` (статический класс)
  - `Z(event)` → `dispatch(event)`
  - `P(listener)` → `register(listener)`
  - `h(listener)` → `unregister(listener)`
- `z1` → `EventListener` (Record)
  - `p()` → `getObject()`
  - `M()` → `getMethod()`
  - `k()` → `getPriority()`
- `_S` → `EventListener` (annotation)
- `yL` → `ModuleManager`
  - `R(Class)` → `getModule(Class)`
  - `j()` → `getModules()`
  - `i(String)` → `getModuleByName(String)`
- `yn` → `EasingType` (enum)
- `_y` → `ItemType` (enum)

## Статус деобфускации

### ✅ Деобфусцировано:
- Все основные события (vt, vq, vs, vE, z0, vg, yr, y3, _E, J0, vf, v3, v2, v1, e, g_)
- Основные менеджеры (частично)
- Mixins файлы (MinecraftClientMixin, ClientPlayerEntityMixin, GameRendererMixin, EntityMixin, CameraMixin)

### ⏳ В процессе:
- Менеджеры (yS, JV, vD, zy)
- Хелперы (ym, vV, _g, yj, zk)

### 📋 Осталось:
- Остальные классы (более 200 файлов)
- Переименование файлов

## Примечания

- Некоторые классы могут иметь другие имена в реальном коде
- Методы могут иметь другие сигнатуры
- Этот маппинг основан на анализе использования в mixins файлах и структуре кода
- Все изменения сохраняют функциональность, только улучшают читаемость

