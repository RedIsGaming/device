package src.subscribers;

public record Mail<T>() implements Subscriber<T> {
    @Override
    public T update(T message) {
        return message;
    }
}
