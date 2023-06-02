package src.colors;

import src.devices.*;
import java.util.Vector;

public class ColorType extends Computer {
    private final Vector<Color> colors;

    public ColorType(Vector<Color> colors) {
        this.colors = colors;
    }

    public boolean colorType() {
        return this.colors
            .stream()
            .anyMatch(c -> c.equals(Color.BLACK));
    }
}