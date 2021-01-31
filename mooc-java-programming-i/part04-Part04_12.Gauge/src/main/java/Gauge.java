/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class Gauge {
    private int value;
    
    public Gauge() {
        this.value = 0;
    }
    
    public void increase() {
        if(value < 5) {
            value = value + 1;
        } else {
            value = 5;
        }   
    }
    
    public void decrease() {
        if(value > 0) {
            value = value - 1;
        } else {
            value = 0;
        }
    }
    
    public int value() {
        return value;
    }
    
    public boolean full() {
        boolean isFive;
        if(value == 5) {
            isFive = true;
        } else {
            isFive = false;
        }
        
        return isFive;
    }
}
