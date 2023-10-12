package filters;

import flower.Flower;
import flower.FlowerType;
import flower.FlowerColor;
import flower.Item;

public class FlowerFilter implements Filter {
    private FlowerColor colorToFilter;
    private FlowerType typeToFilter;
    // private double sepalLengthToFilter;
    private double minPrice = 0;
    private double maxPrice = 0;

    // (double sepalLengthToFilter, double minPrice, double maxPrice)
    public FlowerFilter(FlowerColor colorToFilter,
            FlowerType typeToFilter,
            double minPrice,
            double maxPrice) {
        this.colorToFilter = colorToFilter;
        this.typeToFilter = typeToFilter;
        // this.sepalLengthToFilter = sepalLengthToFilter;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    public FlowerFilter() {
        this.colorToFilter = FlowerColor.randomColor();
        this.typeToFilter = FlowerType.randomType();
        // this.sepalLengthToFilter = sepalLengthToFilter;
        this.minPrice = 0;
        this.maxPrice = 0;
    }

    @Override
    public boolean match(Item item) {
        if (item instanceof Flower) {
            Flower flower = (Flower) item;

            boolean colorMatch = flower.getColor()
                                .equals(colorToFilter.getStringRepresentation());
            boolean typeMatch = flower.getFlowerType().equals(typeToFilter);
            boolean priceMatch = (flower.getPrice() >= minPrice
                    && flower.getPrice() <= maxPrice);
            return (colorMatch && typeMatch && priceMatch);
        }
        return false; // Return false for items that are not flowers
    }
}
