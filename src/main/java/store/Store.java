package store;

import java.util.ArrayList;
import java.util.List;

import flower.Flower;
import flower.FlowerColor;
import flower.FlowerType;
import flower.Item;
import filters.Filter;
import filters.FlowerFilter;

public class Store {
    List<Item> items;
    public List<Item> search(Filter filter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item : items) {
            if (filter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }

    public static void main(String args[]) {
        double minPrice = 25;
        double maxPrice = 70;
        Store store = new Store();
        FlowerFilter filter = new FlowerFilter(FlowerColor.RED,
                                                FlowerType.ROSE,
                                                minPrice,
                                                maxPrice);

        double[] prices = {25.0, 50.0, 65.0};
        double[] lengths = {15.0, 20.0, 25.0};

        store.items = new ArrayList<>();
        store.items.add(new Flower(prices[0], lengths[0],
                        FlowerColor.PINK, FlowerType.TULIP));
        store.items.add(new Flower(prices[1], lengths[1],
                        FlowerColor.PINK, FlowerType.ROSE));
        store.items.add(new Flower(prices[2], lengths[2],
                        FlowerColor.RED, FlowerType.ROSE));

        List<Item> foundItems = store.search(filter);
        for (Item item : foundItems) {
            System.out.println("Found item: " + item);
        }
    }
}
