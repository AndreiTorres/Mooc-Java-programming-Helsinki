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
public class Room {
    ArrayList <Person> persons;
    
    public Room() {
        this.persons = new ArrayList <Person>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        boolean flag = true;
        
        if (persons.size() >= 1) {
            flag = false;
        } else {
            flag = true;
        }
        
        return flag;
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }
    
    public Person shortest() {
        Person shortestPerson = null;
        int shortest = 9999;
        
        if(isEmpty()) {
            shortestPerson = null;
        } else {
            for (Person pers : persons) {
                if (pers.getHeight() < shortest) {
                    shortest = pers.getHeight();
                    shortestPerson = pers;
                }
            }
        }
        
        return shortestPerson;
        
    }
    
    public Person take() {
        Person person = shortest();
        persons.remove(shortest());
        return person;
    }
}
