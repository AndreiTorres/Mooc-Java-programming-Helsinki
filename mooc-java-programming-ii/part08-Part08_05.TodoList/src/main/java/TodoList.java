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
public class TodoList {
    private ArrayList <String> todoList;
    
    public TodoList() {
        todoList = new ArrayList <>();
    }
    
    public void add(String task) {
        this.todoList.add(task);
    }
    
    public void print() {
        
        int count = 1;
        for (String task : todoList) {
            System.out.println(count + ": " + task);
            count++;
        }
    }
    
    public void remove(int number) {
        
        this.todoList.remove(number-1);
    }
}
