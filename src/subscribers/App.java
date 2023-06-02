package src.subscribers;

public record App<T>() implements Subscriber<T> {
    @Override
    public T update(T message) {
        return message;
    }
}