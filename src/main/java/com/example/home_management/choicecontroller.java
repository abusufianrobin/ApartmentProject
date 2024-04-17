package com.example.home_management;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class choicecontroller implements Initializable {
    @FXML
    private ChoiceBox<String> choiceBox ;

    private String[] catagori ={"Night guard","Cleaner","technician"};
    private ComboBox<String> comboBox;


    @FXML
    private Label choicelabel;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("choice cotroller");
        choiceBox.getItems().addAll(catagori);
        choiceBox.setOnAction(this::getcatagories);
      //  comboBox.setItems(FXCollections.observableArrayList("Night guard","Cleaner","technician"));
    }
    public void getcatagories(ActionEvent event){
        String cata = choiceBox.getValue();
        choicelabel.setText(cata);
    }
}
