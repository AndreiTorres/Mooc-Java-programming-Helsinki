/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class CD implements Packable{
    private String artist;
    private String CDname;
    private int yearPublication;
    private final double weight = 0.1;
    
    public CD(String artist, String CDname, int yearPublication) {
        this.artist = artist;
        this.CDname = CDname;
        this.yearPublication = yearPublication;
    }
    
    public double weight() {
        return this.weight;
    }
    
    public String toString() {
        return this.artist + ": " + this.CDname + " (" + this.yearPublication + ")";
    }
}
