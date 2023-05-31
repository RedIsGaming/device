package src.publishers;

@FunctionalInterface
public interface Decrease<T, R> {
    R removeSubscriber(T subscriber);
}