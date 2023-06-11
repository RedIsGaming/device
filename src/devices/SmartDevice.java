package src.devices;

public class SmartDevice extends Device {
    @Override
    protected String pickType(String type) {
        return type;
    }

    @Override
    protected int findStorage(int storage) {
        return storage;
    }

    @Override
    protected boolean getSticker(boolean getSticker) {
        return getSticker;
    }
}
