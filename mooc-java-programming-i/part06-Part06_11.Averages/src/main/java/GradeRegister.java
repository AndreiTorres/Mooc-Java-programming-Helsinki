
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        
        if (grades.size() < 1) {
            return -1;
        }
        int averageOfGrades = 0;
        
        for (int number : grades) {
            averageOfGrades = averageOfGrades + number;
        }
        
        return (1.0) * averageOfGrades / grades.size();
    }
    
    public double averageOfPoints() {
        
        if (points.size() < 1) {
            return -1;
        }
        int averageOfPoints = 0;
        
        for (int number : points) {
            averageOfPoints = averageOfPoints + number;
        }
        
        return (1.0) * averageOfPoints / points.size();
    }
}
