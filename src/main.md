```mermaid
classDiagram
    class Device {
        <<Abstract>>
        - type: string
        - storage: int
        + addType(): string
        + addStorage(): int
        + addProtection(): boolean
        + addSticker(): boolean
    }

    class Origin {
        <<Interface>>
        + retrieveOrigin(): string
    }

    class Console {
        + addType(): string
        + addStorage(): int
        + retrieveOrigin(): string
    }

    class Computer {
        + addType(): string
        + addStorage(): int
        + addProtection(): boolean
        + addSticker(): boolean
        + retrieveOrigin(): string
    }

    class SmartDevice {
        + addType(): string
        + addStorage(): int
        + addProtection(): boolean
        + retrieveOrigin(): string
    }

    class Subject {
        <<Interface>>
        + addSubscriber(person: Subscriber): Subscriber
        + removeSubscriber(person: Subscriber): Subscriber
        + notifySubscribers(): void
    }

    class Publisher {
        - subscribers: Subscriber[]
        + addSubscriber(person: Subscriber): Subscriber
        + removeSubscriber(person: Subscriber): Subscriber
        + notifySubscribers(): void
    }

    class Subscriber {
        <<Interface>>
        + update(message: string): string
    }

    class App {
        + update(message: string): string
    }

    class Mail {
        + update(message: string): string
    }

    Device <|-- Console
    Device <|-- Computer
    Device <|-- SmartDevice
    Publisher --|> Subject
    Publisher --|> Subscriber
    Subscriber <|-- App
    Subscriber <|-- Mail
    Origin <|-- Console
    Origin <|-- Computer
    Origin <|-- SmartDevice
```