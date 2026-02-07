
package DressRental;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainPageController {

    @FXML
    private Button SignupBtn;

    @FXML
    private MenuItem closeMenueItem;

    @FXML
    private Menu fileMenu;

    @FXML
    private MenuItem loginMenuItem;

    @FXML
    private ImageView logo;

    @FXML
    private AnchorPane mainWindow;

    @FXML
    private MenuBar menu;

    @FXML
    private MenuItem signUpMenuItem;

    @FXML
    private Menu useerMenu;

    @FXML
    private Label welcomeLabel;

    

    @FXML
    private Button makeOrderBtn;

    @FXML
    private Label welcomeLabel1;


    @FXML
    void SignUp(ActionEvent event) throws IOException{
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup.fxml"));
            // Call the load() function on the file
            Parent root = fxmlLoader.load();
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
    

    @FXML
    void login(ActionEvent event) throws IOException{

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
    
    @FXML
   
    void close(ActionEvent event) throws IOException{
        System.exit(0);
    }
    

  @FXML
    void makeOrder(ActionEvent event) throws IOException{

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("choosewindow.fxml"));
            Parent root =fxmlLoader.load();
            Stage stage = (Stage) makeOrderBtn.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setTitle("Login");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    
    }
    





}




