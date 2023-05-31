package src.publishers;

@FunctionalInterface
public interface Increase<T, R> {
    R addSubscriber(T subscriber);
}