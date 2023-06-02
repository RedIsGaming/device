package src.devices;

import java.util.Vector;

public abstract class Device {
    public void deviceOption() {
        pickType();
        findStorage();
        retrieveOrigin();
    }

    abstract protected String pickType();
    abstract protected Vector<Integer> findStorage();
    abstract protected String retrieveOrigin();

    protected Vector<String> chooseProtection() {
        return new Vector<>();
    }

    protected boolean getSticker() {
        return true;
    }
}