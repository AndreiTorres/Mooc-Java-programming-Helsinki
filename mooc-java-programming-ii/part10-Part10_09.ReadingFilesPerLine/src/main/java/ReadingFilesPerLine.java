
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test the method here
        String file = "C://Users//Jesus Torres//Documents//NetBeansProjects//mooc-java-programming-ii//part10-Part10_09.ReadingFilesPerLine//src//main//java//prueba.txt";
        List<String> linesInFile = read(file);
        
        linesInFile.stream()
                .forEach(line -> System.out.println(line));
        

    }
    
    public static List<String> read(String file) {
        
        List<String> linesInFile = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file)).forEach(line -> linesInFile.add(line));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        return linesInFile;
    }

}
