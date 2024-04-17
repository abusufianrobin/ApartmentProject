package com.example.home_management;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));



        Scene scene = new Scene(fxmlLoader.load());
        stage.setMaximized(true);
        scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());

        //Image icon =new Image("E:\\Home_management\\src\\main\\resources\\images\\home.png");

       // stage.getIcons().add(icon);
        stage.setTitle("HOME MANAGEMENT");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}