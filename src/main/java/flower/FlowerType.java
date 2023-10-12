package flower;

import java.util.Random;

public enum FlowerType {
    CHAMOMILE, ROSE, TULIP;
    private static final Random RANDOM_GENERATOR = new Random();


    // To randomly generate a FlowerType
    public static FlowerType randomType(){
        FlowerType[] types = values();
        return types[RANDOM_GENERATOR.nextInt(types.length)];
    }
}
