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
public class MisplacingBox extends Box {
    private ArrayList<Item> items;
    
    public MisplacingBox() {
        items = new ArrayList<>();
    }
    
    public void add(Item item) {
        items.add(item);
    }
    
    public boolean isInBox(Item item) {
        return false;
    }
}
