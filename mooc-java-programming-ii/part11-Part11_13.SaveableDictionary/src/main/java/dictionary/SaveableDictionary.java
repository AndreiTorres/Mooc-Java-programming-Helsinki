/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author Jesus Torres
 */
public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.file = file;
        this.dictionary = new HashMap<>();
        
    }
    
    public void add(String words, String translation) {
        
        if (!dictionary.containsKey(words)) {
            dictionary.put(words, translation);
            dictionary.put(translation, words);

        }
    }
    
    public String translate(String word) {
        return this.dictionary.get(word);
    }
    
    public void delete(String word) {
        
        if (dictionary.containsKey(word)) {
            String translate = translate(word);
            dictionary.remove(word);
            dictionary.remove(translate);
        }
    }
    
    public boolean load() {     
        
     try {
        Files.lines(Paths.get(this.file))
             .map(l -> l.split(":"))
                 .forEach(parts -> {
                     this.dictionary.put(parts[0], parts[1]);
                     this.dictionary.put(parts[1], parts[0]);
                 });

            return true;
        } catch (IOException ex) {
            return false;
        }
        
        
    }
    
    public boolean save() {
            
            try {
            PrintWriter writer = new PrintWriter(new File(file));
            saveWords(writer);
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    
    private void saveWords(PrintWriter writer) throws IOException {

        List<String> allreadySaved = new ArrayList<>();
        
        this.dictionary.keySet().stream().forEach(word -> {
            if (allreadySaved.contains(word)) {
                return;
            }

            String pari = word + ":" + this.dictionary.get(word);
            writer.println(pari);

            allreadySaved.add(word);
            allreadySaved.add(this.dictionary.get(word));
        });

    }
}
