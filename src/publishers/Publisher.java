package src.publishers;

import java.util.Vector;

public record Publisher<T>(Vector<T> subscribers, T messages) implements Increase<T>, Decrease<T>, Notify<T> {
    public Publisher(Vector<T> subscribers) {
        this(subscribers, null);
    }

    private T iterSubscriber() {
        return subscribers
            .stream()
            .filter(s -> s.equals("RedIsGaming"))
            .findFirst()
            .orElse(null);
    }

    @Override
    public T addSubscriber(T subscriber) {
        subscribers.add(subscriber);
        return iterSubscriber();
    }

    @Override
    public T removeSubscriber(T subscriber) {
        subscribers.remove(subscriber);
        return iterSubscriber();
    }

    @Override
    public T notifySubscribers() {
        return messages;
    }
}