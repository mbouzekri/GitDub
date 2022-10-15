import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class CheckersInstructionsController {

     private Stage stage;
     private Scene scene;
     private Parent root;

    public void switchBackToCheckers(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("CheckersMainScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

