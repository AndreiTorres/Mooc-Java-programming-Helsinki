
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        GradeRegister gradeRegister = new GradeRegister();
        UserInterface scan = new UserInterface(scanner, gradeRegister);
        
        scan.start();
        System.out.println("Point average (all): " + gradeRegister.averageOfCalifications());
        System.out.println("Point average (passing): " + gradeRegister.averageOfPassingGrade());
        System.out.println("Pass percentage: " + gradeRegister.passingPercentage());
        System.out.println("Grade Distribution: ");
        scan.printGradeDistribution();
    }
}
