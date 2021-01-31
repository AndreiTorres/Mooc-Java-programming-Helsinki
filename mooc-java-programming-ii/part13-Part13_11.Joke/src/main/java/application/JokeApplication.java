package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{


    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane layout = new BorderPane();
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20,20,20,20));
        menu.setSpacing(10);
        
        Button btn1 = new Button("Joke");
        Button btn2 = new Button("Answer");
        Button btn3 = new Button("Explanation");
        
        menu.getChildren().addAll(btn1, btn2, btn3);
        layout.setTop(menu);
        
        StackPane firstLayout = createView("What do you call a bear with no teeth?");
        StackPane secondLayout = createView("A gummy bear.");
        StackPane thirdLayout = createView("xd");
        
        btn1.setOnAction((event)-> { layout.setCenter(firstLayout);});
        btn2.setOnAction((event)-> { layout.setCenter(secondLayout);});
        btn3.setOnAction((event)-> { layout.setCenter(thirdLayout);});
        
        layout.setCenter(firstLayout);
        Scene scene = new Scene(layout);
        
        stage.setScene(scene);
        stage.show();
        
        
    }
    
     private StackPane createView(String text) {

        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
}
