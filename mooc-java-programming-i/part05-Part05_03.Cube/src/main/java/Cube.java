/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class Cube {
    private int edgeLength;
    
    public Cube(int endLength) {
        this.edgeLength = endLength;
    }
    
    public int volume() {
        return this.edgeLength * this.edgeLength * this.edgeLength;
    }
    
    public String toString() {
        return "The length of the edge is " + this.edgeLength + " and the volume " + volume();
    }
}
