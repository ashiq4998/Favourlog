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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ImageView favourlog;
    @FXML
    private Button signin;
    @FXML
    private Button createaccount;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(MouseEvent event) {
    }

    @FXML
    private void signIn (ActionEvent event)  throws IOException {
       
        
        
       try{
            
        String a,b;
        a=password.getText();
        b=username.getText();
        if(a.equals("123") && b.equals("ahn"))
        {
            
            
        
        Parent root =  FXMLLoader.load(getClass().getClassLoader().getResource("favourlog/page1.fxml"));  
        //Parent root=(Parent)loader.load();
         //Page1Controller second= loader.getController();
         
        Scene homepageScene= new Scene(root);
        
    // Stage stage= new Stage();
        //stage.setScene(new Scene(root));
        Stage appStage=(Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(homepageScene);
        appStage.show();
        
            label.setText("Login Success");

        }

        else
        {

            label.setText("Login Failed");

        }

        

       }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       
       }
        
        
    

    @FXML
    private void createAccount(ActionEvent event) throws IOException {
        
       try{
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("favourlog/page2.fxml"));  
        Parent root=(Parent)loader.load();
         Page2Controller second= loader.getController();
         
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
