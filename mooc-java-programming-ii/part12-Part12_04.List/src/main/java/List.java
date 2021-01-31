

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class List <Type> {
    
    private Type[] list;
    private int firstFreeIndex;
    
    public List() {
        this.list = (Type[]) new Object[10];
    }
    
    public void add(Type value) {
        if (this.firstFreeIndex == this.list.length) {
            grow();
        }
        
        this.list[firstFreeIndex] = value;
        this.firstFreeIndex++;
    }
    
    public void grow() {
        int newSize = this.list.length + this.list.length / 2;
        Type[] newList = (Type[]) new Object[newSize];
        
        for (int i = 0; i < this.list.length; i++) {
            newList[i] = this.list[i];
        }
        
        this.list = newList;
    }
    
    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }
    
    public int indexOfValue(Type value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if(this.list[i].equals(value)) {
                return i;
            }
        }
        
        return -1;
    }
    
    private void moveToTheLeft(int fromIndex){
        for (int i = fromIndex; i < this.firstFreeIndex; i++) {
            this.list[i] = this.list[i+1];
        }
    }
    
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0 ) {
            return;
        }
        
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }
    
    public Type value(int index) {
        if (index < 0 || index >= this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }
        
        return this.list[index];
    }
    
    public int size() {
        return this.firstFreeIndex;
    }
}
