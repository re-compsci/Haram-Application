/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenetest;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * FXML Controller class
 *
 * @author
 */
public class summryFXMLController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
     private TableColumn<booking, Integer> visitorid;
    @FXML
     private TableColumn<booking, Integer> ticketno;
    @FXML
     private TableColumn<booking, String> time;
    @FXML
     private TableColumn<booking, String> date;
      //observablelist to store data and show it in the table
    ObservableList<booking> data= FXCollections.observableArrayList();
  
    
    @FXML
    private TableView table;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
        //setthe cells property to show data in it
        visitorid.setCellValueFactory(new PropertyValueFactory<>("id"));
	ticketno.setCellValueFactory(new PropertyValueFactory<>("tikt"));
	time.setCellValueFactory(new PropertyValueFactory<>("time"));
	date.setCellValueFactory(new PropertyValueFactory<>("date"));
        
        //booking session created
        Session session = HibernateUtil2.getSessionFactory().openSession();
        List<booking> sList = null;
        //query to get all data from booking table
        String queryStr = "from booking";
        Query query = session.createQuery(queryStr);
        sList = query.list();
        //session closed
        session.close();
        //for loop to add data in data observable list
        for(booking s: sList){
            data.add(new booking(s.getId(),s.getTikt(),s.getTime(),s.getDate()));
	//set observable list on table  	 
            table.setItems(data); 

        }

    }    

      
    int num,ticket;
    
    @FXML
    private void delete(KeyEvent event) throws IOException {
     
       Session session = HibernateUtil2.getSessionFactory().openSession();
        Transaction tx2 = session.beginTransaction();
       if(event.getCode() == KeyCode.DELETE){

            String hqlDel = "delete from booking where tickt_no="+ticket+"";
            Query queryDel = session.createQuery(hqlDel);
            int resultD = queryDel.executeUpdate();
            System.out.println("Rows affected: " + resultD);
            tx2.commit();
        }
        session.close();
        
 
        root = FXMLLoader.load(getClass().getResource("summry.fxml"));
        stage = (Stage) ((Node)event. getSource ()). getScene().getWindow();
        System.out.println("Transfer to (Summry page)");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    
    }


    @FXML
    private void onclicked(MouseEvent event) {
        num = table.getSelectionModel().getSelectedIndex();
	ticket = ticketno.getCellData(num);
    }

    @FXML
    private void previous(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        stage = (Stage) ((Node)event. getSource ()). getScene().getWindow();
       
        System.out.println("Transfer to (Summry page)");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Al-Haram Application");
        stage.getIcons().add(new Image("Pics/makkah.png"));
        stage.setResizable(false);
        stage.show();
    }
        
    @FXML
    private void File(ActionEvent event) throws IOException{    

        List<booking> BList = null;       
        Session session2 = HibernateUtil2.getSessionFactory().openSession();
        Query query2 = session2.createQuery("from booking");
        BList = query2.list();
        session2.close();       
        
        ObservableList<booking> B = FXCollections.observableArrayList(BList);        
        File file = new File("AL_HaramApp.txt");
        PrintWriter output = new java.io.PrintWriter(file);  
        output.println("      Al-Haram Appliction      ");
   
        for(booking s: B)
            output.println(s.getId()+"   "+s.getTikt()+"   "+s.getTime()+"   "+s.getDate());

        System.out.println("write to file");
        output.close();      
    }
   
    @FXML
    private void To_Rate(MouseEvent event) throws IOException {
   
        root = FXMLLoader.load(getClass().getResource("rate.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Transfer to (rate page)");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Al-Haram Application");
        stage.getIcons().add(new Image("Pics/makkah.png"));
        stage.setResizable(false);
        stage.show();
    }

   
    
}
