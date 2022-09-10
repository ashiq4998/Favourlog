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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class Page1Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    
     @FXML
    private Button movies;

    @FXML
    void movies(ActionEvent event)throws IOException {
        try{
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("favourlog/movies1.fxml"));
        //The java.lang.ClassLoader.getResource() method finds the resource with the given name;
        //The name of a resource is a '/'-separated path name that identifies the resource.
        
         //The getClassLoader() method of java Class class returns the class loader for the class which called this method;
         //Class loaders are responsible for loading Java classes during runtime dynamically
         
         //The java.lang.Object.getClass() method returns the runtime class of an object. 
         
         //Class FXMLLoader. Loads an object hierarchy from an XML document.
        
        Parent root=(Parent)loader.load();//this will return a node which is gonna be typecast in parent
        
        //The Java ClassLoader is a part of the Java Runtime Environment that dynamically loads Java classes into the Java Virtual Machine;
        //The Java run time system does not need to know about files and file systems because of classloaders;
        //Java classes aren't loaded into memory all at once, but when required by an application.
        
        //Parent: The base class for all nodes that have children in the scene graph. represents a node that can have child nodes.
        
        
        //Opening the second controller, so we have to create a new stage
        Stage stage= new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    
    

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
