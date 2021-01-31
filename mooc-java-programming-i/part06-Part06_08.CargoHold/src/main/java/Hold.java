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
public class Hold {
    private int maximumWeight;
    private int totalWeight;
    private int finalWeight;
    private ArrayList <Suitcase> suitcases;
    
    
    public Hold(int maximumWeight) {
        suitcases = new ArrayList <Suitcase>();
        this.maximumWeight = maximumWeight;
        totalWeight = 0;
        finalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        totalWeight = totalWeight + suitcase.totalWeight();
        if (totalWeight <= maximumWeight) {
            suitcases.add(suitcase);
            finalWeight = finalWeight + suitcase.totalWeight();
        }
    }
    
    public String toString() {
        return suitcases.size() + " suitcases " + "(" + finalWeight + " kg)"; 
    }
    
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
