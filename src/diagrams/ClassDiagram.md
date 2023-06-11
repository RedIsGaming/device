```mermaid
classDiagram
    class Device {
        <<Abstract>>
        # deviceOption(type: String, storage: int): void
        # pickType(type: String): String
        # findStorage(storage: int): int
        # chooseProtection(chooseProtection: String): String
        # getSticker(getSticker: boolean): boolean
    }

    class Console {
        # pickType(type: String): String
        # findStorage(storage: int): int
    }

    class Computer {
        # pickType(type: String): String
        # findStorage(storage: int): int
        # chooseProtection(chooseProtection: String): String
        # getSticker(getSticker: boolean): boolean
    }

    class SmartDevice {
        # pickType(type: String): String
        # findStorage(storage: int): int
        # getSticker(getSticker: boolean): boolean
    }

    class Option {
        - printDevice: PrintDevice
        - deviceCounter: DeviceCounter
        + putColor(): ColorType
        + consoleOption(): void
        + computerOption(): void
        + smartDeviceOption(): void
        + deviceOptions(): void
    }

    class PrintDevice {
        # printConsole(counter: int, type: String, storage: int): void
        # printComputer(counter: int, type: String, storage: int, protection: String, sticker: boolean): void
        # printSmartDevice(counter: int, type: String, storage: int, sticker: boolean): void
    }

    class DeviceCounter {
        - counter: int
        # counter(): int
    }

    class Color {
        <<Enumeration>>
        RED
        BLUE
        PURPLE
        BLACK
        WHITE
    }

    class ColorType {
        - colors: Vector~Color~
        + ColorType(colors: Vector~Color~)
        + colorType(): Vector~Color~
    }

    class Increase~T~ {
        <<Interface>>
        + addSubscriber(subscriber: T): T
    }

    class Decrease~T~ {
        <<Interface>>
        + removeSubscriber(subscriber: T): T
    }

    class Notify~T~ {
        <<Interface>>
        + notifySubscribers(): T
    }

    class Publisher~T~ {
        - subscribers: Vector~T~
        - messages: T
        + Publisher(subscribers: Vector~T~)
        + addSubscriber(subscriber: T): T
        + removeSubscriber(subscriber: T): T
        + notifySubscribers(): T
    }

    class Subscriber~T~ {
        <<Interface>>
        + update(message: T): T
    }

    class App~T~ {
        + update(message: T): T
    }

    class Mail~T~ {
        + update(message: T): T
    }

    Device <|-- Console : inheritant from
    Device <|-- Computer : inheritant from
    Device <|-- SmartDevice : inheritant from
    Option <-- PrintDevice : is associated with
    Option <-- DeviceCounter : is associated with
    Computer <.. ColorType : depend on
    ColorType --o Color : aggregation
    Increase <|-- Publisher : inheritant from
    Decrease <|-- Publisher : inheritant from
    Notify <|-- Publisher : inheritant from
    Publisher --> Device : is associated with
    Publisher --> Subscriber : is associated with
    Subscriber <|-- App : inheritant from
    Subscriber <|-- Mail : inheritant from
```