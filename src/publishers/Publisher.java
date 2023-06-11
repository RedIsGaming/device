package src.publishers;

import java.util.Vector;

public record Publisher<T>(Vector<T> subscribers, T messages) implements Increase<T>, Decrease<T>, Notify<T> {
    public Publisher(Vector<T> subscribers) {
        this(subscribers, null);
    }

    @Override
    public T addSubscriber(T subscriber) {
        boolean add = subscribers.add(subscriber);
        return add ? subscriber : null;
    }

    @Override
    public T removeSubscriber(T subscriber) {
        boolean remove = subscribers.remove(subscriber);
        return remove ? subscriber : null;
    }

    @Override
    public T notifySubscribers() {
        return messages;
    }
}
