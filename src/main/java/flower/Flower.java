package flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @AllArgsConstructor @NoArgsConstructor
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter @Setter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower flower){

        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.flowerType = flower.flowerType;
        this.color = flower.color;
    }

    public String getColor() {
        return color.toString();
    }

    public boolean equals(Flower other) {
        if (this == other) {
            return true;
        }
        return this.flowerType == other.flowerType && this.color == other.color && this.price == other.price && this.sepalLength == other.sepalLength;
    }
}
