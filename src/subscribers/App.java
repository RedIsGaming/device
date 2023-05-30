package src.subscribers;

public record App() implements Subscriber {
    @Override
    public String update(String message) {
        return message;
    }
}