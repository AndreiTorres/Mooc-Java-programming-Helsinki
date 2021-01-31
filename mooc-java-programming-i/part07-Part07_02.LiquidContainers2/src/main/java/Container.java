/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class Container {
    private int amountOfLiquid;
    
    public Container() {
        amountOfLiquid = 0;
    }
    
    public int contains() {
        return amountOfLiquid;
    }
    
    public void add(int amount) {
        
        if (amount >= 0) {
            int suma = amountOfLiquid;
            suma = suma + amount;
            if (suma > 100) {
                amountOfLiquid = 100;
            } else {
                amountOfLiquid = amountOfLiquid + amount;
            }
        } 
    }
    
    public void remove(int amount) {
        
        if (amount >= 0) {
            if (amount > amountOfLiquid) {
                    amountOfLiquid = 0;
                } else {
                    amountOfLiquid = amountOfLiquid - amount;
                }
        }
    }
    
    public String toString() {
        return amountOfLiquid + "/100"; 
    }
    
}
