package com.example.home_management;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.new_flat_info;

import java.io.IOException;

public class new_appartment_controller {

    @FXML
    private ImageView flat_image;

    @FXML
    private Label flat_name;
    @FXML
    private Label flat_amount;
    private Parent root;
    private  Scene scene;
    private Stage stage;

    public void setdata(new_flat_info nfi) throws IOException {
        System.out.println("this funciotn is exicutinh");
        Image image = new Image(getClass().getResourceAsStream(nfi.getImagesrc()));
        flat_image.setImage(image);
        flat_name.setText(nfi.getName());
        flat_amount.setText(nfi.getAmount());
 /*       FXMLLoader loader = new FXMLLoader(getClass().getResource("Aparment.fxml"));
        root = loader.load();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();*/
    }
}
