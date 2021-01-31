/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class Bird {
    private String name;
    private String nameInLatin;
    private int observations;
    
    
    
    public Bird(String name, String nameInLatin){
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameInLatin() {
        return nameInLatin;
    }

    public void setNameInLatin(String nameInLatin) {
        this.nameInLatin = nameInLatin;
    }
    
    public void addObservation() {
        this.observations++;
    }
    
    public String toString() {
        return this.getName() + " (" + this.nameInLatin + "): " + this.observations + " observations";
    }
}
