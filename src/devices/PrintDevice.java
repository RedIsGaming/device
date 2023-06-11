package src.devices;

public class PrintDevice {
    protected void printConsole(int counter, String type, int storage) {
        Device console = new Console();
        console.deviceOption(type, storage);

        System.out.printf("\u001B[34mConsole: %d\nType: %s\nStorage: %d\n\n", counter, type, storage);
    }

    protected void printComputer(int counter, String type, int storage, String protection, boolean sticker) {
        Device console = new Computer();
        console.deviceOption(type, storage);

        System.out.printf("\u001B[35mComputer: %d\nType: %s\nStorage: %d\nProtection: %s\nSticker: %b\n",
            counter, type, storage, protection, sticker
        );
    }

    protected void printSmartDevice(int counter, String type, int storage, boolean sticker) {
        Device console = new SmartDevice();
        console.deviceOption(type, storage);

        System.out.printf("\n\u001B[36mSmart Device: %d\nType: %s\nStorage: %d\nSticker: %b\n\n",
            counter, type, storage, sticker
        );
    }
}
