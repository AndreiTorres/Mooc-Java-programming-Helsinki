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
public class GradeRegister {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> stars;
    
    public GradeRegister() {
        grades = new ArrayList<>();
        stars = new ArrayList<>();
    }
    
    public void add(int calification){
        grades.add(calification);
        this.stars.add(calificationToGrade(calification));
    }
    
    public double averageOfCalifications() {
        double suma = 0;
        
        for (int calification : grades) {
            suma = suma + calification;
        }
        
        return suma / grades.size(); 
    }
    
    public String averageOfPassingGrade() {
        double suma = 0;
        int count = 0;
        
        for (int calification : grades) {
            if (calification >= 50) {
                suma = suma + calification;
                count++;
            }
        }
        
        if (suma == 0) {
            return "-";
        } 
        
        return (suma / count) + "";
    }
    
    public double passingPercentage() {
        int count = 0;
        
        for (int calification : grades) {
            if (calification >= 50) {
                count++;
            }
        }
        
        return 1.0 * 100 * count / grades.size();
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.stars) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }
    
    
    public static int calificationToGrade(int calification) {

        int grade = 0;
        if (calification < 50) {
            grade = 0;
        } else if (calification < 60) {
            grade = 1;
        } else if (calification < 70) {
            grade = 2;
        } else if (calification < 80) {
            grade = 3;
        } else if (calification < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
