package textstatistics;


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
        BorderPane borderPane = new BorderPane();
        
        HBox labels = new HBox();
        labels.setSpacing(15);
        
        labels.getChildren().add(new Label("Letters: 0"));
        labels.getChildren().add(new Label("Words: 0"));
        labels.getChildren().add(new Label("The longest word is: "));
        
        borderPane.setBottom(labels);
        borderPane.setCenter(new TextArea(""));
        
        Scene view = new Scene(borderPane);
        
        stage.setScene(view);
        stage.show();
        
        
    }

}
