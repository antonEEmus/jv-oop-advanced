package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public Color getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }
}