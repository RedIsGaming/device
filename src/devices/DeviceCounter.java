package src.devices;

public class DeviceCounter {
    private int counter = 1;

    protected int counter() {
        return counter++;
    }
}
