package hurraa;


import javafx.scene.media.AudioClip;
import java.net.URL;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        Button button = new Button("Hurraa!");
        
            final URL resource = getClass().getResource("Applause-Yannick_Lemieux.wav");
                         
            AudioClip audioClip = new AudioClip(resource.toExternalForm());
        pane.setCenter(button);
        String musicFile = "Applause-Yannick_Lemieux.wav";    

        button.setOnAction((event) -> {
            audioClip.play();
       
        }); 

        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
