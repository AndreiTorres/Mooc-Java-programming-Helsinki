
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class Hideout <T>{
    private List<T> hideouts;
    
    public Hideout() {
        this.hideouts = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        if (hideouts.isEmpty()) {
            this.hideouts.add(toHide);
        } else {
            this.hideouts.clear();
            this.hideouts.add(toHide);
        }
    }
    
    public T takeFromHideout() {
        T t = this.hideouts.get(0);
        
        this.hideouts.clear();
        
        return t;
    }
    
    public boolean isInHideout() {
        
        if (!this.hideouts.isEmpty()) {
            return true;
        }
        
        return false;
    }
}
