package com.example.home_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.new_flat_info;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Apartment_Controller {
    @FXML
    public GridPane post_grid;
    Stage stage;
    public void gotoemployee(ActionEvent event)throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Employee.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        //appartment_button.setStyle("-fx-background-color: #ff0000;");
    }
    public void gotoRental_list(ActionEvent event)throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Rental_list.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        //appartment_button.setStyle("-fx-background-color: #ff0000;");
    }
    public void gotoRent_collection(ActionEvent event)throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Rent_collection.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        //appartment_button.setStyle("-fx-background-color: #ff0000;");
    }
    public void gotodashboard(ActionEvent event)throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
    public void addunit(ActionEvent event)throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("add_unit1.fxml"));
        Parent root1 = (Parent)fxmlLoader.load();
        Stage st = new Stage();
        st.setTitle("Unit Information ");
        st.setScene(new Scene(root1));
        st.show();
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("add_unit1.fxml"));
//        Scene scene = new Scene(fxmlLoader.load());
//        Stage st = new Stage();
//        st.setTitle("Unit infromation");
//        st = (Stage)((Node)event.getSource()).getScene().getWindow();
//        st.setScene(new Scene(scene));
//        st.show();
    }
    List<new_flat_info> ls = new ArrayList<>();
    int colomn = 0;
    int row = 1;
    public void makepane(){
        System.out.println("initilize fuction");

        //postlist = new ArrayList<>(data());

        try {
            //  for (int i = 0; i < postlist.size(); i++) {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("new_flat.fxml"));
            // add_unit_controller auc = new add_unit_controller();
            // System.out.println(auc.getName());
            // System.out.println(auc.amount);
            new_flat_info nfi = new new_flat_info();
            nfi.setImagesrc("/images/home.png");
            nfi.setName("Flat 101");
            nfi.setAmount("100000");
            ls.add(nfi);
            VBox vBox = fxmlLoader.load();
            new_appartment_controller nac = fxmlLoader.getController();
            nac.setdata(nfi);
            if (colomn == 6) {
                colomn = 0;
                ++row;
            }
            post_grid.add(vBox, colomn++, row);
            GridPane.setMargin(vBox, new Insets(10));
            // }
        } catch (Exception e) {

        }

    }
}
