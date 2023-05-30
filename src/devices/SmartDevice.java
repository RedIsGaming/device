package src.devices;

public class SmartDevice extends Device {
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


    @Override
    protected boolean getSticker() {
        return super.getSticker();
    }
}