/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class Gift {
    private String name;
    private int weight;
    
    public Gift(String name, int weigth) {
        this.name = name;
        this.weight = weigth;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public String toString() {
        return this.getName() + " (" + this.getWeight() + " kg)";
    }
}
