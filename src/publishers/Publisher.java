package src.publishers;

import java.util.Vector;
import src.subscribers.Subscriber;

public record Publisher(Vector<Subscriber> subscribers) implements Increase, Decrease, Notify {
    public Subscriber publisher(Vector<Subscriber> subscribers) {
        return subscribers
            .iterator()
            .next();
    }

    @Override
    public Publisher addSubscriber(Subscriber subscriber) {
        Vector<Subscriber> newSubscribers = new Vector<>(subscribers);
        newSubscribers.add(subscriber);
        return new Publisher(newSubscribers);
    }

    @Override
    public Publisher removeSubscriber(Subscriber subscriber) {
        Vector<Subscriber> leavedSubscribers = new Vector<>(subscribers);
        leavedSubscribers.remove(subscriber);
        return new Publisher(leavedSubscribers);
    }

    @Override
    public String notifySubscribers(String message) {
        var newMessage = message.startsWith("Hello");
        return String.valueOf(newMessage);
    }
}