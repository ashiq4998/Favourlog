/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favourlog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Page2Controller implements Initializable {

    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
    private TextField email;
    @FXML
    private Button submit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handle(ActionEvent event) {
    }

    @FXML
    private void submit(ActionEvent event)throws IOException {

                
     
        
       try{
            
        String s;
        
       submit.setText("Successful");
    
      
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("favourlog/FXMLDocument.fxml"));  
        Parent root=(Parent)loader.load();
         Page1Controller second= loader.getController();
         
        //second.myFunction(textfield.getText());
        
     Stage stage= new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
    
        
        
       
    

