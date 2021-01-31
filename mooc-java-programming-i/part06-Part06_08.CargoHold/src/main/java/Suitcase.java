/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Jesus Torres
 */
public class Suitcase {
    
    private int maximumWeight;
    private ArrayList <Item> items;
    private int totalWeight;
    private int finalWeight;
    
    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        items = new ArrayList<Item>();
        totalWeight = 0;
        finalWeight = 0;
    }
    
    public void addItem(Item item) {
        
        totalWeight = totalWeight + item.getWeight();
        if (totalWeight <= maximumWeight) {
            items.add(item);
            finalWeight = finalWeight + item.getWeight();
        }
    }
    
    public String toString() {
        String string = "";
        
        if (items.size() == 1) {
            string = items.size() + " item" + " (" + finalWeight + " kg)";
        } else if (items.size() == 0){
            string = "no items" + " (" + finalWeight + " kg)";
        } else {
            string = items.size() + " items" + " (" + finalWeight + " kg)";
        }
        return string;
    }
    
    public void printItems() {
        
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public int totalWeight() {
        return this.finalWeight;
    }
    
    public Item heaviestItem() {
        
        if (items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = items.get(0);
        
         
         for (Item item : items) {
             if (item.getWeight() > heaviestItem.getWeight()) {
                 heaviestItem = item;
             }
         }
         
         return heaviestItem;
    }
        
   
        
}
    
   
