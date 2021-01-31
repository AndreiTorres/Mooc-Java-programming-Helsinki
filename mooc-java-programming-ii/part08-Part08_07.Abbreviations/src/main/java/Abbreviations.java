/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author Jesus Torres
 */
public class Abbreviations {
    private HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        
        abbreviations.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        
        boolean match = false;
        
        if (abbreviations.containsKey(abbreviation)) {
            match = true;
        }
        
        return match;
    }
    
    public String findExplanationFor(String abbreviation) {
        String explanation = null;
        
        if (!this.hasAbbreviation(abbreviation)) {
            return explanation;
        }
        
        return abbreviations.get(abbreviation);
    }
}
