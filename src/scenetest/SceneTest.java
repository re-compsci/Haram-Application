/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenetest;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.stage.*;



/**
 *
 * @author 
 * 
 */
public class SceneTest extends Application {
    
    @Override
    public void start(Stage stage) throws java.io.IOException  {
    
     
        try{
     
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Al-Haram Application");
        stage.getIcons().add(new Image("Pics/makkah.png"));
        stage.setResizable(false);
        stage.show();
        
        } catch(Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }   
    }
    
            

        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}