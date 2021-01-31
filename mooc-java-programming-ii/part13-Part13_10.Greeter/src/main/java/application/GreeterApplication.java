package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application{


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vbox = new VBox();
        vbox.getChildren().add(new Label("Enter your name and start."));
        TextField nameField = new TextField();
        vbox.getChildren().add(nameField);
        Button buttonStart = new Button("Start");
        vbox.getChildren().add(buttonStart);
        vbox.setPrefSize(200, 200);
        
        BorderPane borderPane = new BorderPane();
        Label greetings = new Label();
        borderPane.setCenter(greetings);
        borderPane.setPrefSize(200, 200);
        
        Scene first = new Scene(vbox);
        Scene second = new Scene(borderPane);
        
        buttonStart.setOnAction((event) -> {
            greetings.setText("Welcome " + nameField.getText() + "!");
            stage.setScene(second);
        });
        
        stage.setScene(first);
        stage.show();
        
        
    }
}
