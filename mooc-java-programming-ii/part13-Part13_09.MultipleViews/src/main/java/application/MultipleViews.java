package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{
    
    
    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();
        Button buttonFirst = new Button("To the second view!");
        borderPane.setTop(new Label("First View!"));
        borderPane.setCenter(buttonFirst);
        
        VBox vbox = new VBox();
        Button buttonSecond = new Button("To the third view!");
        vbox.getChildren().add(buttonSecond);
        vbox.getChildren().add(new Label("Second view!"));
        
        GridPane layout = new GridPane();
        
        Button buttonThird = new Button("To the first view!");
        layout.add(new Label("Third view!"), 0, 0);
        layout.add(buttonThird, 1, 1);
        
        
        Scene first = new Scene(borderPane);
        Scene second = new Scene(vbox);
        Scene third = new Scene(layout);
        
        buttonFirst.setOnAction((event) -> {
            stage.setScene(second);
        });
        
        buttonSecond.setOnAction((event) -> {
            stage.setScene(third);
        });
        
        buttonThird.setOnAction((event) -> {
            stage.setScene(first);
        });
        
        stage.setScene(first);
        stage.show();
        
    }

}
