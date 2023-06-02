package src.publishers;

@FunctionalInterface
public interface Increase<T> {
    T addSubscriber(T subscriber);
}