package src.devices;

import java.util.Vector;

public class Computer extends Device {
    @Override
    protected String pickType() {
        return null;
    }

    @Override
    protected Vector<Integer> findStorage() {
        return new Vector<>();
    }

    @Override
    protected String retrieveOrigin() {
        return null;
    }

    @Override
    protected Vector<String> chooseProtection() {
        return super.chooseProtection();
    }

    @Override
    protected boolean getSticker() {
        return super.getSticker();
    }
}