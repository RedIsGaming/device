package src.publishers;

import src.subscribers.Subscriber;

@FunctionalInterface
public interface Decrease {
    Publisher removeSubscriber(Subscriber subscriber);
}