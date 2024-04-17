module com.example.home_management {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.home_management to javafx.fxml;
    exports com.example.home_management;
    exports model;
    opens model to javafx.fxml;
}