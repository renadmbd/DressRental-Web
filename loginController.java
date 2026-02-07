
package DressRental;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


public class loginController {
    
    
    
    @FXML
    private Button BackBtn;

    @FXML
    private Button LoginBtn;

    @FXML
    private Label emailLabel;

    @FXML
    private TextField emailTF;

    @FXML
    private ImageView logo;

    @FXML
    private Label newLabel;

    @FXML
    private Label passwordLabel;

    @FXML
    private TextField passwordTF;

    @FXML
    private AnchorPane signupWindow;

    
     @FXML
   
    void loginBtnClick(ActionEvent event) throws IOException{
         try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainwindowafterlogging.fxml"));
            Parent root =fxmlLoader.load();
            Stage stage = (Stage) LoginBtn.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle("DressRental APP");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
}
    
    
      @FXML
    void backBtn(ActionEvent event) throws IOException{
         try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
            Parent root =fxmlLoader.load();
            Stage stage = (Stage) BackBtn.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle("DressRental APP");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
    }
    
    
    
  
