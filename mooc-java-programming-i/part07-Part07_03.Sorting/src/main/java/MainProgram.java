import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array) {
        
        int smallest = 999;
        
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        
        int indexOfSmallest = 0;
        int smallest = 999;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallestFrom = 0;
        int smallest = 999;
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                indexOfSmallestFrom = i;
            }
        }
        return indexOfSmallestFrom;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void toString(int[] table) {
        
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i]);
        }
    }
    
    public static void sort(int[] table) {
       
        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table));
            int smallest = indexOfSmallestFrom(table, i);
            swap(table, i, smallest);
        }
        
    }

}
