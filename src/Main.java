package src;

import src.devices.*;
import src.publishers.Publisher;
import java.util.Vector;
import src.subscribers.*;

public class Main {
    public static void main(String[] args) {
        Option.deviceOptions();

        Publisher<String> publisher = new Publisher<>(new Vector<>(), "A new device has been announced!");
        publisher.addSubscriber("RedIsGaming");
        publisher.addSubscriber("Akinator");
        publisher.addSubscriber("God");
        System.out.printf("\u001B[31mSubscribers: %s\n", publisher.subscribers());

        Subscriber<String> appSubscribers = new App<>();
        Subscriber<String> mailSubscribers = new Mail<>();

        System.out.println(publisher.notifySubscribers());
        System.out.println(appSubscribers.update("Check out this cool new devices: "));
        System.out.println(mailSubscribers.update("Check out this cool new devices: \n"));
        Option.consoleOption();

        publisher.removeSubscriber("God");
        publisher.removeSubscriber("Akinator");
        System.out.printf("\u001B[31mSubscribers: %s\n", publisher.subscribers());

        System.out.println(publisher.notifySubscribers());
        System.out.println(appSubscribers.update("This special device is only available for a limited time!"));
        System.out.println(mailSubscribers.update("This special device is only available for a limited time!"));
        Option.smartDeviceOption();
    }
}
