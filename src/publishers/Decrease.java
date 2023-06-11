package src.publishers;

@FunctionalInterface
public interface Decrease<T> {
    T removeSubscriber(T subscriber);
}
