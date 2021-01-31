/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class TripleTacoBox implements TacoBox {
    private int tacos;
    
    public TripleTacoBox() {
        tacos = 3;
    }
    
    public int tacosRemaining() {
        
        if (this.tacos < 0) {
            this.tacos = 0;
        }
        
        return this.tacos;
    }
    
    public void eat() {
        tacos = tacos - 1;
    }
    
}
