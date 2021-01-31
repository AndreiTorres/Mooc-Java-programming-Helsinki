
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int start = 1;
        
        while (start <= number) {
            System.out.print("*");
            start++;
        }
        
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int start = 1;
        
        while (start <= number) {
            System.out.print(" ");
            start++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int start = 1;
        int end = size;
        
        while(size >= start) {
            printSpaces(end-1);
            end--;
            printStars(start);
            start++;
            
        }
       
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int start = 1;
        int end = height;
        int stars = 1;
        int i = 0;
        
        while (start <= height) {
            printSpaces(end-1);
            printStars(stars);
            end--;
            stars = stars + 2;
            start++;
            
        }
        
        while (i < 2) {
            printSpaces(height - 2);
            printStars(3);
            i++;
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
