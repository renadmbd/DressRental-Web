package DressRental;

import java.io.FileWriter;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class chooseWindowController {

  @FXML
    private Button ConfirmBtn;

    @FXML
    private Button backBtn;

    @FXML
    private ChoiceBox<String> DressComboBox;

    @FXML
    private RadioButton cashRB;

    @FXML
    private ChoiceBox<String> colorComboBox;

    @FXML
    private RadioButton installmentsTF;

    @FXML
    private ImageView logo;

    @FXML
    private Label newLabel;

    @FXML
    private Label passwordLabel;

    @FXML
    private Label paymentLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private TextField priceTF;

    @FXML
    private AnchorPane signupWindow;

    @FXML
    private ToggleGroup tg1;

    @FXML
    private Label usernameLabel;

     @FXML 
    private customerSingleton customer = customerSingleton.getInstance();
     
    ObservableList<String> DressType = FXCollections.observableArrayList("Casual","Midi","Wedding","Party", "Summer");
    ObservableList<String> DressColor = FXCollections.observableArrayList("Blue","Red","Gray","White","Black");

   @FXML
    public void initialize() {
        DressComboBox.setItems(DressType);
        colorComboBox.setItems(DressColor);

    }

   @FXML    
    void showPrice(){

        ArrayList<String> prices = new ArrayList<String>();
        prices.add("2000");
        prices.add("1500");
        prices.add("3100");
        prices.add("2700");
        prices.add("1800");
        
        
        if (DressComboBox.getValue().equals("null")){
        }else if (DressComboBox.getValue().equals(DressType.get(0))){
            priceTF.setText(prices.get(0)+" SAR");
            customer.setDressPrice(prices.get(0));

        }else if (DressComboBox.getValue().equals(DressType.get(1))){
            priceTF.setText(prices.get(1)+" SAR");
            customer.setDressPrice(prices.get(1));
        }else if (DressComboBox.getValue().equals(DressType.get(2))){
            priceTF.setText(prices.get(2)+" SAR");
            customer.setDressPrice(prices.get(2));
        } else if (DressComboBox.getValue().equals(DressType.get(3))){
            priceTF.setText(prices.get(3)+" SAR");
            customer.setDressPrice(prices.get(3));
          }else if (DressComboBox.getValue().equals(DressType.get(4))){
            priceTF.setText(prices.get(4)+" SAR");
            customer.setDressPrice(prices.get(4));
        }
    }

   @FXML    
   void confirmBtn(){
       
       
       if(!DressComboBox.getValue().equals("null")){
           customer.setDressType(DressComboBox.getValue());
           customer.setDressColor(colorComboBox.getValue());
           if (cashRB.isSelected())
                customer.setPaymentType("Cash");
           else
                customer.setPaymentType("Installments");
            
           createBill();
           
           try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("billwindow.fxml"));
            // Call the load() function on the file
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ConfirmBtn.getScene().getWindow();
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
   
   @FXML
   void createBill(){
       try{
            
            FileWriter customerBill = new FileWriter(customer.getName()+"Bill");    
            customerBill.write("This is bill for "+customer.getName() + ":\n");
            customerBill.write("Dress Type : "+ customer.getDressType()+". \n");
            customerBill.write("Dress Colour : "+ customer.getDressColor()+". \n");
            customerBill.write("Dress total price : "+ customer.getDressPrice()+" \n");
            if (customer.getPaymentType().equalsIgnoreCase("Cash"))
                customerBill.write("The payment will be Cash for total of "+ customer.getDressPrice()+" that will be paid immidiatly. \n");
            else
                customerBill.write("The payment will be Installments for total of 12 months, total price is "+ customer.getDressPrice()+" and you will pay "+Double.parseDouble(customer.getDressPrice()) / 12.0 + " for each month. \n");

            customerBill.write("Thank you for choosing DressRental app, have a nice day!");

            customerBill.close();
            
        } catch (Exception e){
                                    System.out.println("Line 165");

                        System.out.println(e.getMessage());

        }
   }

   @FXML
   void backBtn(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainwindowafterlogging.fxml"));
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
}
