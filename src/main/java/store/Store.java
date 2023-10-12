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
    public List<Item> search(Filter filter){
        List<Item> foundItems = new ArrayList<>();
        for (Item item : items){
            if (filter.match(item)){
                foundItems.add(item);
            }
        }
        return foundItems;
    }

    public static void main(String args[]){
        Store store = new Store();
        FlowerFilter filter = new FlowerFilter(FlowerColor.RED, FlowerType.ROSE, 25, 70);
        // Populate the items list with some items (you should create items accordingly)
        store.items = new ArrayList<>();
        store.items.add(new Flower(25.0, 15.0, FlowerColor.PINK, FlowerType.TULIP));
        store.items.add(new Flower(50.0, 20.0, FlowerColor.PINK, FlowerType.ROSE));
        store.items.add(new Flower(65.0, 25.0, FlowerColor.RED, FlowerType.ROSE));
        // Use the search method to find items that match the filter
        List<Item> foundItems = store.search(filter);

        // Now, you can do something with the found items, such as printing them
        for (Item item : foundItems) {
            System.out.println("Found item: " + item);
        }
    }
}
