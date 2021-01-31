/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Jesus Torres
 */
public class DictionaryOfManyTranslations {
    private HashMap <String, ArrayList<String>> wordTranslations;

    public DictionaryOfManyTranslations() {
        this.wordTranslations = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        this.wordTranslations.putIfAbsent(word, new ArrayList<>());
        
        ArrayList<String> translations = this.wordTranslations.get(word);
        translations.add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        ArrayList<String> emptyList = new ArrayList<>();
        return this.wordTranslations.getOrDefault(word, emptyList);
    }
    
    public void remove(String word) {
        this.wordTranslations.remove(word, this.wordTranslations.get(word));
    }
}
