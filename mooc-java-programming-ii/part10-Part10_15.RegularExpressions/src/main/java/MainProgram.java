

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        
        String string = "17:23:05";
        
        Checker checker = new Checker();
        if (checker.timeOfDay(string)) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
        
    }
}
