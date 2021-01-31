package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application{


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Button");
        TextField textField = new TextField("Texto");
        
        FlowPane componenteGroup = new FlowPane();
        
        componenteGroup.getChildren().add(button);
        componenteGroup.getChildren().add(textField);
        
        Scene view = new Scene(componenteGroup);
        
        stage.setScene(view);
        stage.show();
        
    }

}
