
package DressRental;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class signupcontrller {

    @FXML
    private Button SignupBtn;

    @FXML
    private Button backBtn;

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
    private Label phonenumberLabel;

    @FXML
    private TextField phonenumberTF;

    @FXML
    private AnchorPane signupWindow;

    @FXML
    private Label usernameLabel;

    @FXML
    private TextField usernameTF;

    @FXML 
    private customerSingleton customer = customerSingleton.getInstance();
    
    @FXML
    void backBtn(ActionEvent event) throws IOException{
         try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
            Parent root =fxmlLoader.load();
            Stage stage = (Stage) backBtn.getScene().getWindow();
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
    void signupBtnClick(ActionEvent event) throws IOException{
        
        String name = (String) usernameTF.getText();
        String filename = name+".txt";
        customer.setName(name);
        customer.setEmail(emailTF.getText());
        customer.setPassword(passwordTF.getText());
        customer.setPhoneNumber(phonenumberTF.getText());
        

        
         try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent root =fxmlLoader.load();
            Stage stage = (Stage) SignupBtn.getScene().getWindow();
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
