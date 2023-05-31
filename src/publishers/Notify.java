package src.publishers;

@FunctionalInterface
public interface Notify<T, R> {
    R notifySubscribers(T message);
}