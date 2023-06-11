package src.devices;

public abstract class Device {
    protected void deviceOption(String type, int storage) {
        pickType(type);
        findStorage(storage);
    }

    abstract protected String pickType(String type);
    abstract protected int findStorage(int storage);

    protected String chooseProtection(String chooseProtection) {
        return null;
    }

    protected boolean getSticker(boolean getSticker) {
        return false;
    }
}
