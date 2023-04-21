/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenetest;

import java.io.*;
import java.net.URL;
import java.sql.Time;
import javafx.scene.control.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.stage.*;
import org.hibernate.*;
import java.lang.*;
import javafx.animation.AnimationTimer;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author
 */


  
        
public class FXMLDocumentController implements Initializable {

    public FXMLDocumentController() {
    }

    
     Media media=new Media(new File("src\\Pics\\Button-Click-Sound.mp3").toURI().toString());
     MediaPlayer mediaPlayer= new MediaPlayer(media);
    ObservableList<String> Pray_time = FXCollections.observableArrayList();
    
   ObservableList<String> times = FXCollections.observableArrayList();
    
   
    private Stage stage;
    private Scene scene;
    private Parent root;

    protected static int CurrtenUser;
    @FXML
    private ImageView bg;

    @FXML
    private TextField txtrate;
    @FXML
    private Label labelrate;

    @FXML
    private TextField txtname = new TextField();
    @FXML
    private TextField txtid = new TextField();
    @FXML
    private TextField txtphone = new TextField();
    @FXML
    private TextField txtage = new TextField();
    @FXML
    private TextField txtpass;
    @FXML
    private Label vali;
    @FXML
    private Label vali1;
    @FXML
    private Label vali2;
    @FXML
    private Label vali3;
    @FXML
    private Label vali4;

    @FXML
    private TextField txt_id = new TextField();
    @FXML
    private PasswordField txt_pass;
    @FXML
    private Label a;
    @FXML
    private Label a1;

    @FXML
    private DatePicker date = new DatePicker();
    @FXML
    private RadioButton Hajj = new RadioButton("Hajj");
    @FXML
    private RadioButton Omra = new RadioButton("Omra");
    @FXML
    private RadioButton Pray = new RadioButton("Pray");
    @FXML
    private ComboBox<String> time = new ComboBox();
    @FXML
    private Label warnin0;
    @FXML
    private Label warnin1;
    @FXML
    private Label warnin2;
    @FXML
    private ToggleGroup selectWorship;
  
    @FXML
    private void pplay(MouseEvent event)throws IOException {
        
        mediaPlayer.play();
    }
    
    @FXML
       private void rot(MouseEvent event)throws IOException {
           AnimationTimer t=new AnimationTimer() {
               @Override
               public void handle(long now) { 
                   bg.setFitHeight(bg.getFitHeight()+2);
                   bg.setFitWidth(bg.getFitWidth()+2);
                  // bg.setRotate(bg.getRotate()+2);
               }
           };
           t.start();  
       }
    
    @FXML
    private void To_welcome(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("welcome.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Transfer to (Welcome page)");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Al-Haram Application");
        stage.getIcons().add(new Image("Pics/makkah.png"));
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void To_SignIn(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sign-in.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Transfer to (Sign in page)");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Al-Haram Application");
        stage.getIcons().add(new Image("Pics/makkah.png"));
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void MouseTo_SignIn(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sign-in.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Transfer to (Sign in page)");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Al-Haram Application");
        stage.getIcons().add(new Image("Pics/makkah.png"));
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void To_SignUp(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sign-up.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Transfer to (Sign up page)");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Al-Haram Application");
        stage.getIcons().add(new Image("Pics/makkah.png"));
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    private void MouseTo_SignUp(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("sign-up.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Transfer to (Sign up page)");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Al-Haram Application");
        stage.getIcons().add(new Image("Pics/makkah.png"));
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void To_Menu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Transfer to (Menu page)");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Al-Haram Application");
        stage.getIcons().add(new Image("Pics/makkah.png"));
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void Mouse_Menu(MouseEvent event) throws IOException, InterruptedException {
        root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Transfer to (Menu page)");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Al-Haram Application");
        stage.getIcons().add(new Image("Pics/makkah.png"));
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void To_Booking(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("booking.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Transfer to (Booking page)");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Al-Haram Application");
        stage.getIcons().add(new Image("Pics/makkah.png"));
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void To_Summry(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("summry.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Transfer to (Summry page)");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Al-Haram Application");
        stage.getIcons().add(new Image("Pics/makkah.png"));
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void Mouse_Summry(MouseEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("summry.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        System.out.println("Transfer to (Summry page)");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Al-Haram Application");
        stage.getIcons().add(new Image("Pics/makkah.png"));
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void Add(ActionEvent event) throws IOException {


        try {
            
            visitors v1 = new visitors();
            Session session1 = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session1.beginTransaction();
            v1.setTxtname(txtname.getText());
            v1.setTxtid(Integer.parseInt(txtid.getText()));
            v1.setTxtage(txtage.getText());
            v1.setTxtphone(Integer.parseInt(txtphone.getText()));
            v1.setTxtpassword(txtpass.getText());
            CurrtenUser = v1.getTxtid();

            session1.save(v1);
            session1.getTransaction().commit();
            session1.close();

            root = FXMLLoader.load(getClass().getResource("menu.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            System.out.println("Transfer to (Menu page)");
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Al-Haram Application");
            stage.getIcons().add(new Image("Pics/makkah.png"));
            stage.setResizable(false);
            stage.show();

            } catch (Exception e) {
                
            System.out.println(e.toString());
            e.printStackTrace();
            if (txtname.getText().equals("")) {
                vali.setText("Yuo must fill all text feiled!!");
            }
            if (txtid.getText().equals("")) {
                vali1.setText("Yuo must fill all text feiled!!");
            }
            if (txtage.getText().equals("")) {
                vali2.setText("Yuo must fill all text feiled!!");
            }
            if (txtphone.getText().equals("")) {
                vali3.setText("Yuo must fill all text feiled!!");
            }
            if (txtpass.getText().equals("")) {
                vali4.setText("Yuo must fill all text feiled!!");
            }
        }

    }



    @FXML
    private void book(ActionEvent event) throws IOException {

        FXMLDocumentController A = new FXMLDocumentController();
        booking b1 = new booking();
        boolean duplicate = false;
        int num = (int) (Math.random() * 10000);
        boolean time_chk = false;
        boolean date_chk = false;

        List<booking> List = null;
        Session session = HibernateUtil2.getSessionFactory().openSession();
        Query query = session.createQuery("from booking");
        List = query.list();
        session.close();

        try {
            for (booking look : List) {
                if (look.getTikt() == num) {
                    duplicate = true;
                    b1.setTikt(A.random(10001, 20000));
                }
            }

            if (!duplicate) {
                b1.setTikt(num);
            }

            if (Hajj.isSelected()) {
                b1.setWorship(Hajj.getText());
            } else if (Omra.isSelected()) {
                b1.setWorship(Omra.getText());
            } else if (Pray.isSelected()) {
                b1.setWorship(Pray.getText());
            } else {
                warnin0.setText("Please choose one.");
            }

            for (String s : times) {
                if (time.getValue().equals(s.toString())) {
                    warnin1.setText("");
                    b1.setTime(time.getValue());
                    time_chk = true;
                }
            }

            for (String s : Pray_time) {
                if (Pray.isSelected() && time.getValue().equals(s.toString())) {
                    warnin1.setText("");
                    b1.setTime(time.getValue());
                    time_chk = true;
                }
            }

            b1.setDate(date.getValue().format(DateTimeFormatter.ofPattern("dd MMM yyyy", new Locale("en"))));

            if (b1.getDate().equals(date.getValue().format(DateTimeFormatter.ofPattern("dd MMM yyyy", new Locale("en"))))) {
                date_chk = true;
                warnin2.setText("");
            }
            
            if ((Hajj.isSelected() || Omra.isSelected() || Pray.isSelected()) && time_chk && date_chk) {

                Session session2 = HibernateUtil2.getSessionFactory().openSession();
                Transaction tx = session2.beginTransaction();
                b1.setId(CurrtenUser);
                session2.save(b1);
                session2.getTransaction().commit();
                session2.close();

                root = FXMLLoader.load(getClass().getResource("summry.fxml"));
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                System.out.println("Transfer to (Summry page)");
                scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Al-Haram Application");
                stage.getIcons().add(new Image("Pics/makkah.png"));
                stage.setResizable(false);
                stage.show();
            }
       
        } catch (Exception e) {
           System.out.println(e.toString());
           e.printStackTrace();
            if (!(Hajj.isSelected() || Omra.isSelected() || Pray.isSelected())) 
                warnin0.setText("Please choose one.");
                  
           if(!time_chk)
               warnin1.setText("Please choose one.");
            
            if(!date_chk)
                warnin2.setText("Please choose one.");
            
           
        }
    }

    @FXML
    private void Pray(MouseEvent event) throws IOException {
        if (Pray.isSelected()) {
            warnin0.setText("");
            time.setItems(Pray_time);
        }
    }

    @FXML
    private void OmHajj(MouseEvent event) throws IOException {
        if (Omra.isSelected() || Hajj.isSelected()) {
            warnin0.setText("");
            time.setItems(times);
        }
    }

    public static int random(int max, int min) {
        return ((int) (Math.random() * (max - min))) + min;
    }
    
    
         
    @FXML
    private void Add_signin(ActionEvent event) throws IOException {
        boolean chk = false;
        List<visitors> idList = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from visitors");
        idList = query.list();
        session.close();

        try {
            Integer x = Integer.parseInt(txt_id.getText());
            for (int i = 0; i < idList.size(); i++) {

                if (x.equals(idList.get(i).getTxtid()) && txt_pass.getText().equals(idList.get(i).getTxtpassword())) {
                    chk = true;
                    CurrtenUser = x;

                    root = FXMLLoader.load(getClass().getResource("menu.fxml"));
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    System.out.println("Transfer to (Menu page)");
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.setTitle("Al-Haram Application");
                    stage.getIcons().add(new Image("Pics/makkah.png"));
                    stage.setResizable(false);
                    stage.show();
                    break;
                }
            }

            if (!chk) {
                a.setText("Not found");
                a1.setText("Not found");
            }

        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            if (txt_id.getText().equals("")) {
                a.setText("You need to enter an id to precced");
            }
            if (txt_pass.getText().equals("")) {
                a1.setText("You need to enter an password to precced");
            }
        }
    }

    @FXML
    private void binding(ActionEvent event) throws IOException {
        labelrate.textProperty().bind(txtrate.textProperty());
    }

    @FXML
    private void ratesub(ActionEvent event) throws IOException {
        Alert subm = new Alert(Alert.AlertType.CONFIRMATION);
        subm.setTitle("Alert!");
        subm.setContentText("Thank you, we have received your review");
        subm.showAndWait();
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        

        times.addAll(FXCollections.observableArrayList("12:00 AM", "12:30 AM", "01:00 AM", "01:30 AM", "02:00 AM",
                "02:30 AM", "03:00 AM", "03:30 AM", "04:00 AM", "04:30 AM", "05:00 AM", "05:30 AM", "06:00 AM", "06:30 AM",
                "07:00 AM", "07:30 AM", "08:00 AM", "08:30 AM", "09:00 AM", "09:30 AM", "10:00 AM", "10:30 AM", "11:00 AM",
                "11:30 AM", "12:00 PM", "12:30 PM", "01:00 PM", "01:30 PM", "02:00 PM", "02:30 PM", "03:00 PM", "03:30 PM",
                "04:00 PM", "04:30 PM", "05:00 PM", "05:30 PM", "06:00 PM", "06:30 PM", "07:00 PM", "07:30 PM", "08:00 PM",
                "08:30 PM", "09:00 PM", "09:30 PM", "10:00 PM", "10:30 PM", "11:00 PM", "11:30 PM"));

        Pray_time.addAll(FXCollections.observableArrayList("Fajr 05:00AM", "Duhr 12:00PM", "Asor 03:30PM",
                "Maghrib 06:00PM", "Esha 07:30PM"));
        
        time.setItems(times);

        txtname.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if(newValue.matches("\"[a-zA-Z]\"") || newValue.matches(" ")) {

                    txtname.setText(newValue);
                   
                } else {
                    if(! newValue.matches(" "))
                    txtname.setText(newValue.replaceAll(newValue, ""));
                }
            }
        });

        txtid.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    txtid.setText(newValue.replaceAll("[^\\d]", ""));
                    vali1.setText("The ID number must contain only digit!!");
                } else {
                    vali1.setText("");
                }
            }
        });

        txtphone.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    txtphone.setText(newValue.replaceAll("[^\\d]", ""));
                    vali3.setText("The ID number must contain only digit!!");
                } else {
                    vali3.setText("");
                }
            }
        });

        txtage.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    txtage.setText(newValue.replaceAll("[^\\d]", ""));
                    vali2.setText("The ID number must contain only digit!!");
                } else {
                    vali2.setText("");
                }
            }
        });

        txt_id.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (!newValue.matches("\\d*")) {
                    txt_id.setText(newValue.replaceAll("[^\\d]", ""));
                    a.setText("The id must be a digit only");
                } else {
                    a.setText("");
                }
            }
        });

    }



}
