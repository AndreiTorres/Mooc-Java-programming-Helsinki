
import java.util.ArrayList;
import java.util.Collections;



public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        
        students.add(second);
        students.add(first);
        
        System.out.println(students);
        
        Collections.sort(students);
        System.out.println(students);
    }
}
