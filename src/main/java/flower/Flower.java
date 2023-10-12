package flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @AllArgsConstructor @NoArgsConstructor
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Setter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower flower) {

        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.flowerType = flower.flowerType;
        this.color = flower.color;
    }

    public Flower(double price, double sepalLength,
                 FlowerColor color, FlowerType type) {
        this.price = price;
        this.sepalLength = sepalLength;
        this.flowerType = type;
        this.color = color;
    }

    public String getColor() {
        return color.toString();
    }

    public double getPrice() {
        return price;
    }
}
