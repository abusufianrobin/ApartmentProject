package com.example.home_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.new_flat_info;
import com.example.home_management.HelloController.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class add_unit_controller {
    @FXML
    TextField flatname;

   // GridPane post_grid;
    @FXML
    TextField flat_amout;
    @FXML
    Button closebutton;
    @FXML
    Pane add_unit_pane;
    private Stage stage;



    private Scene scene;
    private Parent root;
    public String name;
    public String amount;
/* public void set(ActionEvent event) throws IOException{
     String f_name = flatname.getText();
     System.out.println(f_name);
     FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("new_flat.fxml"));
     new_flat_info nfi = fxmlLoader.getController();
     root = fxmlLoader.load();
     nfi.setName(f_name);

    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();

 }*/

    public String getName() {
        return name;
    }

    public void handleclosebutton(ActionEvent event) throws IOException{
        stage = (Stage) add_unit_pane.getScene().getWindow();
        stage.close();
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Apartment.fxml"));
        Parent root = (Parent)loader.load();
        //stage = (Stage) A
        //stage.setScene(new Scene(root));

        //loader.setLocation(getClass().getResource("Apartment.fxml"));
        //root = loader.load();
        Apartment_Controller ac = loader.getController();
        this.name = flatname.getText();
        this. amount = flat_amout.getText();
        System.out.println(name);
      /*  FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Apartment.fxml"));
        root = fxmlLoader.load()*/;

       // stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        ac.makepane();


    }
}
