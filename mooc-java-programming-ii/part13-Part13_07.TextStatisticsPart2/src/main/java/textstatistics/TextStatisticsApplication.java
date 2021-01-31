package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        TextArea txtArea = new TextArea();
        
        HBox hbox = new HBox();
        hbox.setSpacing(15);
        
        Label labelChar = new Label("Letters: 0");
        Label labelWords = new Label("Words: 0");
        Label labelLongestWord = new Label("The longest word is: ");
        
        hbox.getChildren().add(labelChar);
        hbox.getChildren().add(labelWords);
        hbox.getChildren().add(labelLongestWord);
        
        BorderPane layout = new BorderPane();
        
        layout.setCenter(txtArea);
        layout.setBottom(hbox);
        
        txtArea.textProperty().addListener((change, oldValue, newValue) -> {
        int characters = newValue.length();
        String[] parts = newValue.split(" ");
        int words = parts.length;
        String longest = Arrays.stream(parts)
            .sorted((s1, s2) -> s2.length() - s1.length())
            .findFirst()
            .get();

        // set values of text elements
        labelChar.setText("Letters: " + characters);
        labelWords.setText("Words: " + words);
        labelLongestWord.setText("The longest word is: " + longest);
        });
        
        Scene view = new Scene(layout);
        
        stage.setScene(view);
        stage.show();
        
    }

}
