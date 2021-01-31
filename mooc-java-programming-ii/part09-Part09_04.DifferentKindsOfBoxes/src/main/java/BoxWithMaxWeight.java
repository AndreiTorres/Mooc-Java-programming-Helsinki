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
public class BoxWithMaxWeight extends Box {
    private int maxCapacity;
    private ArrayList <Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        maxCapacity = capacity;
        items = new ArrayList<>();
    }
    
    public void add(Item item) {
        
        int suma = 0;
        
        for (Item itm : items) {
            suma += itm.getWeight();
        }
        
        if ((suma + item.getWeight()) <= maxCapacity) {
            items.add(item);
        }
    }
    
    public boolean isInBox(Item item) {
        
        for (Item itm : items) {
            if (itm.equals(item)) {
                return true;
            }
        }
        
        return false;
    }
    
    
}
