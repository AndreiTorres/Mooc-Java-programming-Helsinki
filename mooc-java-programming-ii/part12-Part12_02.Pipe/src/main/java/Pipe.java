
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
public class Pipe <T>{
    private List<T> pipes;
    
    public Pipe() {
        this.pipes = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipes.add(value);
    }
    
    public T takeFromPipe() {
        if (this.pipes.isEmpty()) {
            return null;
        }
        
        T t = this.pipes.get(0);
        this.pipes.remove(t);
        
        return t;
    }
    
    public boolean isInPipe() {
        
        if (this.pipes.isEmpty()) {
            return false;
        }
        
        return true;
    }
}
