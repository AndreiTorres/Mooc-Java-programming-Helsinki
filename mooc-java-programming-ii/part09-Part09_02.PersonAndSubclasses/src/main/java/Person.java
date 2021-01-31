/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class Person {
    private String name;
    private String ageAndAddress;
    
    public Person(String name, String ageAndAddress) {
        this.name = name;
        this.ageAndAddress = ageAndAddress;
    }

    @Override
    public String toString() {
        return this.name + "\n  " + this.ageAndAddress;
    }
    
    
}
