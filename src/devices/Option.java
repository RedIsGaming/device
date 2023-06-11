package src.devices;

import src.colors.ColorType;
import java.util.Vector;
import src.colors.Color;
import java.util.List;
import java.util.ArrayList;

public class Option {
    private static final PrintDevice printDevice = new PrintDevice();
    private static final DeviceCounter deviceCounter = new DeviceCounter();

    public static ColorType putColor() {
        Vector<Color> colors = new Vector<>(List.of(Color.RED, Color.BLUE, Color.PURPLE, Color.BLACK, Color.WHITE));
        return new ColorType(colors);
    }

    public static void consoleOption() {
        List<Integer> consoleStorage = new ArrayList<>(List.of(32, 64, 825));
        printDevice.printConsole(deviceCounter.counter(), "Switch OLED Model", consoleStorage.get(1));
        printDevice.printConsole(deviceCounter.counter(), "Playstation PS5", consoleStorage.get(2));
    }

    public static void computerOption() {
        List<Integer> computerStorage = new ArrayList<>(List.of(256, 512, 1024, 2048));
        List<String> computerProtection = new ArrayList<>(List.of("Avast", "Malwarebytes", "Norton", "McAfee"));

        printDevice.printComputer(deviceCounter.counter(), "MSI Titan GT77 12UHS 034 GeForce RTX™ 3080Ti, DDR6 16GB",
            computerStorage.get(3), computerProtection.get(3), false
        );

        printDevice.printComputer(deviceCounter.counter(), "Asus Vivobook 15,6 inch i7 16GB DDR4 AMD Ryzen 5000 Series",
            computerStorage.get(1), computerProtection.get(0), true
        );

        System.out.printf("Color: %s\n", putColor().colorType().get(2));
    }

    public static void smartDeviceOption() {
        List<Integer> smartDeviceStorage = new ArrayList<>(List.of(128, 256, 512));
        printDevice.printSmartDevice(deviceCounter.counter(), "iPhone 14", smartDeviceStorage.get(0), false);
    }

    public static void deviceOptions() {
        consoleOption();
        computerOption();
        smartDeviceOption();
    }
}
