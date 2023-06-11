package src.devices;

public class Computer extends Device {
    @Override
    protected String pickType(String type) {
        return type;
    }

    @Override
    protected int findStorage(int storage) {
        return storage;
    }

    @Override
    protected String chooseProtection(String chooseProtection) {
        return chooseProtection;
    }

    @Override
    protected boolean getSticker(boolean getSticker) {
        return getSticker;
    }
}
