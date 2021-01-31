
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        
        this.storage.putIfAbsent(unit, new ArrayList<>());
        
        ArrayList<String> items = this.storage.get(unit);
        items.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        
        ArrayList<String> emptyList = new ArrayList<>();
        
        return this.storage.getOrDefault(storageUnit, emptyList);
    }
    
    public void remove(String storageUnit, String item) {
        
        for (String items : this.storage.get(storageUnit)) {
            if (items.equals(item)) {
                this.storage.get(storageUnit).remove(item);
                break;
            }
        }
    }
    
    public ArrayList<String> storageUnits() {
        
        
        ArrayList<String> names = new ArrayList<>();
        
        for (String name : this.storage.keySet()) {
            if (!(this.storage.get(name).isEmpty())) {
                names.add(name);
            }
        }
        
        return names;
    }
    
}
