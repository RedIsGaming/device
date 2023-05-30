package src.subscribers;

public record Mail() implements Subscriber {
    @Override
    public String update(String message) {
        return message;
    }
}