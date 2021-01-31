package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class UserTitle extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Title: ");
        String title = scanner.nextLine();
        
        stage.setTitle(title);
        stage.show();
        
    }
    
    

}
