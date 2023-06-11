package src.publishers;

@FunctionalInterface
public interface Notify<T> {
    T notifySubscribers();
}
