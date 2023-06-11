package src.devices;

public class Console extends Device {
    @Override
    protected String pickType(String type) {
        return type;
    }

    @Override
    protected int findStorage(int storage) {
        return storage;
    }
}
