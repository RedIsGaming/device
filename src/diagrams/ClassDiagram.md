```mermaid
classDiagram
    class Device {
        <<Abstract>>
        + deviceOption(): void
        # pickType(): String
        # findStorage(): Vector~Integer~
        # retrieveOrigin(): String
        # chooseProtection(): Vector~String~
        # getSticker(): boolean
    }

    class Console {
        # pickType(): String
        # findStorage(): Vector~Integer~
        # retrieveOrigin(): String
    }

    class Computer {
        # pickType(): String
        # findStorage(): Vector~Integer~
        # retrieveOrigin(): String
        # chooseProtection(): Vector~String~
        # getSticker(): boolean
    }

    class SmartDevice {
        # pickType(): String
        # findStorage(): Vector~Integer~
        # retrieveOrigin(): String
        # getSticker(): boolean
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
        + colorType(): boolean
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
        - iterSubscriber(): T
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