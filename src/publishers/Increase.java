package src.publishers;

import src.subscribers.Subscriber;

@FunctionalInterface
public interface Increase {
    Publisher addSubscriber(Subscriber subscriber);
}