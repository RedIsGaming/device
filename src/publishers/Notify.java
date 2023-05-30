package src.publishers;

@FunctionalInterface
public interface Notify {
    String notifySubscribers(String message);
}