
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class Warehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;
    
    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.productPrices.put(product, price);
        this.productStock.put(product, stock);
    }
    
    public int price(String product) {
        
        for (String productName : productPrices.keySet()) {
            if (productName.equals(product)) {
                return productPrices.get(productName);
            }
        }
        
        return -99;
    }
    
    public int stock(String product) {
        
        for (String productName : productStock.keySet()) {
            if (productName.equals(product)) {
                return productStock.get(product);
            }
        }
        
        return 0;
    }
    
    public boolean take(String product) {
        
       if (!(productStock.containsKey(product))) {
           return false;
       }
       
       if (productStock.get(product) < 1) {
           productStock.replace(product, productStock.get(product), 0);
           return false;
       }
       
       productStock.replace(product, productStock.get(product), productStock.get(product) - 1);
       
       return true;
       
    }
    
    public Set<String> products() {
        Set<String> names = new HashSet<>();
        
        for (String name : productStock.keySet()) {
            names.add(name);
        }
        
        return names;
    }
}
