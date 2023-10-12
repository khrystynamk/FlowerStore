package flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {
    // private static final int MAX_QUANTITY = 100;
    private Flower flower;
    @Getter
    private int quantity = 1;

    public FlowerPack(Flower flower, int quantity){
        this.flower = new Flower(flower);
        this.setQuantity(quantity);
    }

    public double getPrice(){
        return flower.getPrice() * ((double) quantity);
    }

    public void setQuantity(int quantity){
        this.quantity = quantity <= 0 ? 1 : quantity;
        // if (quantity < 1){
        //     this.quantity = quantity;
        // }
        // else if (quantity > MAX_QUANTITY){
        //     quantity = MAX_QUANTITY;
        // }
    }
}
