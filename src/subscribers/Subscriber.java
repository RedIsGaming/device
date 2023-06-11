package src.subscribers;

@FunctionalInterface
public interface Subscriber<T> {
    T update(T message);
}
