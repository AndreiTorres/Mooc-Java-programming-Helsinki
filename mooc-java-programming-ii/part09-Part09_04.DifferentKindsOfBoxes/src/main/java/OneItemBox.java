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
public class OneItemBox extends Box {
    private ArrayList<Item> oneItem;
    
    public OneItemBox() {
        oneItem = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if (oneItem.isEmpty() || oneItem.size() < 1) {
            oneItem.add(item);
        }
    }
    
    
    @Override
    public boolean isInBox(Item item) {
          for (Item itm : oneItem) {
            if (itm.equals(item)) {
                return true;
            }
        }
        
        return false;
    }
}
