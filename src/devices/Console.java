package src.devices;

public class Console extends Device {
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
}