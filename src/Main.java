package src;

import src.colors.*;
import src.publishers.*;
import java.util.Vector;
import java.util.stream.IntStream;
import src.devices.Device;

public class Main {
    public static void main(String[] args) {
        Publisher<String> publisher = new Publisher<>(new Vector<>(), "Hi");
        Vector<Color> colors = new Vector<>();

        Vector<String> subscribers = IntStream
            .range(0, 1000)
            .filter(i -> i % 100 == 0)
            .mapToObj(s -> "RedIsGaming" + s)
            .collect(Vector::new, Vector::add, Vector::addAll);

        System.out.println(subscribers);

        publisher.addSubscriber("RedIsGaming");
        publisher.addSubscriber("RedIsGaming2");
        publisher.addSubscriber("RedIsGaming");
        publisher.addSubscriber("RedIsGaming3");
        publisher.removeSubscriber("RedIsGaming");
        publisher.removeSubscriber("RedIsGaming");
        
        System.out.println(publisher.subscribers());
        colors.add(Color.BLACK);
        System.out.println();
        System.out.println(colors.contains(Color.BLACK));

        Device device = new Computer();
        device.pickType();
        device.findStorage();
        device.retrieveOrigin();
    }
}