/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Jesus Torres
 */
public class UserInterface {
    private Scanner scanner;
    private GradeRegister grades;
    
    public UserInterface(Scanner scanner, GradeRegister gradeRegister) {
        this.scanner = scanner;
        this.grades = gradeRegister;
    }
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int calification = Integer.valueOf(scanner.nextLine());
            
            if (calification == -1) {
                break;
            }
            
            if (calification >= 0 && calification <= 100) {
                grades.add(calification);
            }
        }
    }
    
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = grades.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
        
    }

    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
}
