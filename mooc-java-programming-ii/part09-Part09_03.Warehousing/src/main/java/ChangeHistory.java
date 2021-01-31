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
public class ChangeHistory {
    private ArrayList<Double> changes;
    
    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }
    
    public void add(double status) {
        this.changes.add(status);
    }
    
    public void clear() {
        this.changes.clear();
    }
    
    public String toString() {
        return this.changes.toString();
    }
    
    public double maxValue() {
        
        if (this.changes.isEmpty()) {
            return 0;
        }
        
        double maxValue = 0;
        
        for (Double value : this.changes){
            if (value > maxValue) {
                maxValue = value;
            }
        }
        
        return maxValue;
    }
    
    public double minValue() {
        
        if (this.changes.isEmpty()) {
            return 0;
        }
        
        double minValue = 9999;
        
        for (Double value : this.changes) {
            if (value < minValue) {
                minValue = value;
            }
        }
        
        return minValue;
    }
    
    public double average() {
        
        if (this.changes.isEmpty()) {
            return 0;
        }
        
        double suma = 0;
        
        for (Double value : this.changes) {
            suma += value;
        }
        
        return suma / this.changes.size();
    }
    
}
