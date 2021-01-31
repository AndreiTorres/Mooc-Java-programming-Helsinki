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
public class Stack {
    ArrayList <String> stacks = new ArrayList<>();
    
    public boolean isEmpty() {
        if (stacks.size() == 0) {
            return true;
        }
        
        return false;
    }
    
    public void add(String value) {
        stacks.add(value);
    }
    
    public ArrayList<String> values() {
        return stacks;
    }
    
    public String take() {
        String removed = stacks.get(stacks.size() - 1);
        stacks.remove(stacks.size() - 1);
        return removed;
    }
}
