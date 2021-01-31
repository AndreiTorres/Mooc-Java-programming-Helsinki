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
public class Box implements Packable{
    private ArrayList<Packable> items;
    private double maxCapacity;
    
    public Box(double maxCapacity) {
        items = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }
    
    public void add(Packable packable) {
        
        if (weight() + packable.weight() <= maxCapacity) {
            items.add(packable);
        }
           
    }
    
    public double weight() {
         double weight = 0;
         
        for (Packable packable : items) {
            weight += packable.weight();
        }
        
        return weight;
    }
    
    
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + weight() + " kg";
    }
                
                
}
