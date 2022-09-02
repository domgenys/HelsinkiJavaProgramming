
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Genys.D
 */
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int weight = 0;
        for (Item i : items) {
            weight += i.getWeight();
        }
        return weight;
    }

    public void addItem(Item item) {

        if ((totalWeight() + item.getWeight()) <= maxWeight) {
            items.add(item);
        } else {
            return;
        }

    }

    public Item heaviestItem() {

        if (items.isEmpty()) {
            return null;
        }

        Item heaviestItem = this.items.get(0);

        for (Item e : items) {

            if (e.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = e;
            }
        }
        return heaviestItem;

    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i);
        }
    }

    public String toString() {
        String itemOutput = "";
        String weightOutput = " (" + totalWeight() + "kg)";

        if (items.isEmpty()) {
            itemOutput = "no items";
        } else if (items.size() == 0) {
            itemOutput = "1 item";
        } else {
            itemOutput = items.size() + " "
                    + "items";
        }

        return itemOutput + weightOutput;
    }

}
