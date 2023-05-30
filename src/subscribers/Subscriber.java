package src.subscribers;

@FunctionalInterface
public interface Subscriber {
    String update(String message);
}