
import java.util.ArrayList;
import java.util.Iterator;
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
public class Employees {
    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();
        
        while (iterator.hasNext()) {
            employees.add(iterator.next());
        }
    }
    
    public void print() {
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education educacion) {
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()) {
            Person person = iterator.next();
            
            if (person.getEducation() == educacion) {
                System.out.println(person);
            }
        }
    }
    
    public void fire(Education educacion) {
        Iterator<Person> iterator = employees.iterator();
        
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == educacion) {
                iterator.remove();
            }
        }
    }
}
