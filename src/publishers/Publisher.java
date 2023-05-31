package src.publishers;

import java.util.Vector;
import src.subscribers.Subscriber;

public record Publisher<T, R>(Vector<String> subscribers) implements Increase<T, R>, Decrease<T, R>, Notify<T, R> {
    public String publisher() {
        return subscribers
            .iterator()
            .next();
    }

    @Override
    public R addSubscriber(T subscriber) {
        Subscriber newSubs = (String newSub) -> {
            subscribers.add(newSub);
            return publisher();
        };

        newSubs.update(subscriber.toString());
        return (R) newSubs;
    }

    @Override
    public R removeSubscriber(T subscriber) {
        Subscriber leavedSubs = (String leavedSub) -> {
            subscribers.remove(leavedSub);
            return publisher();
        };

        leavedSubs.update(subscriber.toString());
        return (R) leavedSubs;
    }

    @Override
    public R notifySubscribers(T message) {
        Vector<String> notifiedSubs = new Vector<>(message.toString().length());

        notifiedSubs.iterator().next();
        return (R) notifySubs;
    }
}