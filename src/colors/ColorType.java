package src.colors;

import src.devices.*;
import java.util.Vector;

public class ColorType extends Computer {
    private final Vector<Color> colors;

    public ColorType(Vector<Color> colors) {
        this.colors = colors;
    }

    public Vector<Color> colorType() {
        return this.colors;
    }
}
