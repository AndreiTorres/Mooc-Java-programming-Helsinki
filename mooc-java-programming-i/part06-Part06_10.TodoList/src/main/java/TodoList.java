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
        todoList = new ArrayList <String>();
    }
    
    public void add(String task) {
        todoList.add(task);
    }
    
    public void print() {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i+1 + ": " + todoList.get(i));
        }
    }
    
    public void remove(int number) {
        todoList.remove(number-1);
    }
    
    
}
