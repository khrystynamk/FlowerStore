package flower;

import java.util.Random;

import lombok.Getter;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF"), BLACK("#FFFFFF"), PINK("#FF00A6 ");
    private static final Random RANDOM_GENERATOR = new Random();
    @Getter
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }

    // To randomly generate a FlowerColor
    public static FlowerColor randomColor() {
        FlowerColor[] colours = values();
        return colours[RANDOM_GENERATOR.nextInt(colours.length)];
    }
}
