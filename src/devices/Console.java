package src.devices;

public class Console extends Device {
    @Override
    protected String pickType() {
        return null;
    }

    @Override
    protected int findStorage() {
        return 0;
    }

    @Override
    protected String retrieveOrigin() {
        return null;
    }
}