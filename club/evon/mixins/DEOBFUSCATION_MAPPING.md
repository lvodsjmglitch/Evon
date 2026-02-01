# Маппинг деобфусцированных имен

## Основные классы

### Event System
- `C` - EventBus (статический класс для диспетчеризации событий)
  - `C.Z(event)` - dispatch/post event
  - `C.P(listener)` - register event listener
  - `C.h(listener)` - unregister event listener
- `yP` - EventBus (реализация)
  - `F(event)` - dispatch event
  - `u(listener)` - register listener
  - `X(listener)` - unregister listener
- `vt` - Event (базовый класс событий)
  - `e()` - isCancelled()
  - `K()` - cancel()
- `_S` - EventListener annotation

### Events
- `vq` - MovementEvent
  - `l()` - getX()
  - `u()` - getY()
  - `v()` - getZ()
  - `w()` - getYaw()
  - `z()` - getPitch()
  - `O()` - isOnGround()
- `vs` - PostMovementEvent
- `vE` - StepEvent
  - `l()` - getMovement()
- `z0` - VelocityUpdateEvent
- `vg` - ItemUseCooldownEvent
  - `m()` - getCooldown()
- `vH` - SwingHandEvent
- `vj` - UseSlowdownEvent
- `yr` - MoveEvent
  - `a()` - getMovement()
- `y3` - GameLoopEvent
- `yN` - TickEvent
- `vK` - JoinWorldEvent
- `_Y` - PostTickEvent
- `_E` - DisconnectedEvent
- `J0` - BlockPlaceEvent
- `_D` - MouseInputEvent
- `vF` - PostInputEvent
- `o` - RenderWorldEvent
- `vL` - ResolutionChangeEvent

### Managers
- `zy` - EvonClient (главный класс мода)
  - `p()` - getInstance()
- `yS` - KeyBindingManager
  - `y()` - getInstance()
  - `J()` - getAttackKey()
  - `e()` - getUseKey()
  - `t(keyBinding)` - getWrapper(keyBinding)
  - `h()` - update()
- `_6` - KeyBindingWrapper
  - `O()` - isPressed()
  - `e()` - wasPressed()
  - `M()` - shouldShowSwings()
- `JV` - RotationManager
  - `M()` - getRotationHelper()
- `yj` - RotationHelper
  - `d(fallback)` - getYaw(fallback)
  - `Q(fallback)` - getPitch(fallback)
  - `U()` - getRotation()
  - `Z()` - update()
- `zk` - AimHelper
- `vD` - HotbarManager
  - `a()` - getInstance()
  - `y(reset, check)` - reset(reset, check)
- `gf` - SprintModule
  - `z()` - isEnabled()

### Helpers
- `ym` - MinecraftHelper
  - `m` - MinecraftClient instance
- `vV` - RenderHelper
  - `B` - projectionMatrix
  - `i` - modelViewMatrix
  - `L` - viewMatrix
- `_g` - ResolutionChangeHelper
  - `H(width, height)` - onResize(width, height)

### Accessors
- `yF` - ClientPlayerEntityAccessor
  - `evon$swingHandClientside(hand)` - swing hand clientside
  - `evon$swingHandServerside(hand)` - swing hand serverside

## Mixins

### MinecraftClientMixin
- Деобфусцированы все импорты и использования классов
- Заменены обфусцированные имена на понятные

### ClientPlayerEntityMixin
- Деобфусцированы все импорты и использования классов
- Заменены обфусцированные имена на понятные

### GameRendererMixin
- Деобфусцированы все импорты и использования классов
- Заменены обфусцированные имена на понятные

### EntityMixin
- Деобфусцированы все импорты и использования классов
- Заменены обфусцированные имена на понятные

### CameraMixin
- Деобфусцированы все импорты и использования классов
- Заменены обфусцированные имена на понятные

## Примечания

- Некоторые классы могут иметь другие имена в реальном коде
- Методы могут иметь другие сигнатуры
- Этот маппинг основан на анализе использования в mixins файлах

