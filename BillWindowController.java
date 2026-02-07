
package DressRental;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;




public class BillWindowController {

    @FXML
    private Button DoneBtn;

    @FXML
    private TextArea billTA;

    @FXML
    private ImageView logo;

    @FXML
    private Label newLabel;

    @FXML
    private AnchorPane signupWindow;

 @FXML 
    private customerSingleton customer = customerSingleton.getInstance();
     
     @FXML
    public void initialize() {
        try{
            File f = new File(customer.getName()+"Bill");
            Scanner scanner = new Scanner(f);
            String bill ="";
            while(scanner.hasNextLine()){
                bill+= scanner.nextLine()+"\n";
            }
            billTA.setText(bill);
        }catch(Exception e){
            System.out.println(e.getMessage());

         }
    }

    @FXML   
    void Done(ActionEvent event) throws IOException{
        System.exit(0);
    }
}
