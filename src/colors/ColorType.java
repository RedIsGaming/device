package src.colors;

import src.devices.*;
import java.util.Vector;

public class ColorType extends Console {
    private final Vector<Color> colors;

    public ColorType(Vector<Color> colors) {
        this.colors = colors;
    }

    public Color colortype() {
        return this.colors
            .iterator()
            .next();
    }
}