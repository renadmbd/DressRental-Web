
package DressRental;
import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;

public class DressRental extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        try{
            // Create an FXMLLoader Instance
              FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
              // Call the load() function on the file
              Parent root = fxmlLoader.load();
              Scene scene = new Scene(root);
              stage.setTitle("DressRental APP");
              stage.setScene(scene);
              stage.show();} 
        catch(Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }

    }
    public static void main(String[] args) {
          launch();
      }
}
