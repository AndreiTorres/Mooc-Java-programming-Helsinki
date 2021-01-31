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
public class ListOfBirds {
    
    private ArrayList <Bird> birds;
    
    public ListOfBirds() {
        birds = new ArrayList<>();
    }
    
    public void addBirds(Bird bird) {
        birds.add(bird);
    }
    
    public void addObservations(String birdname) {
        boolean flag = false;
        if (birds.isEmpty()) {
            System.out.println("Not a bird!");
        } else {
            for (Bird bird : birds) {
                if (bird.getName().equals(birdname)) {
                    bird.addObservation();
                    flag = true;
                }
            }
        }
        
        if (!flag) {
            System.out.println("Not a bird!");
        }
    }
    
    public void printAllBirds() {
        
        if (birds.isEmpty()) {
            System.out.println("Not a bird!");
        } else {
            for (Bird bird : birds) {
                System.out.println(bird);
            }
        }
    }
    
    public void printOneBird(String birdname) {
        
        if (birds.isEmpty()) {
            System.out.println("Not a bird!");
        } else {
            for (Bird bird : birds) {
                if (bird.getName().equals(birdname)) {
                    System.out.println(bird);
                }
            }
        }
    }
}
