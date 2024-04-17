package com.example.home_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.new_flat_info;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HelloController  {
    @FXML
    private Label welcomeText;
    @FXML
    private Circle cr ;
    @FXML
    private ImageView imageView;
    private Button appartment_button = new Button();
  /*  //@FXML
    //protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/
    @FXML
    private Pane pane101;
    @FXML
    public GridPane post_grid;

    private List<new_flat_info> postlist;



    private Stage stage;
    private Scene apartmentscene;
    //private Scene
    public void gotoappartment(ActionEvent event)throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Apartment.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
       // appartment_button.setStyle("-fx-background-color: #ff0000;");
    }
    public void gotodashboard(ActionEvent event)throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        appartment_button.setStyle("-fx-background-color: #ff0000;");
    }
//    public void addunit(ActionEvent event)throws IOException
//    {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("add_unit1.fxml"));
//        Parent root1 = (Parent)fxmlLoader.load();
//        //Scene scene = new Scene(fxmlLoader.load());
//       // stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        Stage st = new Stage();
//        st.setTitle("Unit Information ");
//        st.setScene(new Scene(root1));
//        st.show();
//    }
    public void addrental(ActionEvent event)throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Add_rental.fxml"));
        Parent root1 = (Parent)fxmlLoader.load();
        //Scene scene = new Scene(fxmlLoader.load());
        // stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage st = new Stage();
        st.setTitle("Rental Information ");
        st.setScene(new Scene(root1));
        st.show();
    }

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
    public void gotoaddemployee(ActionEvent event)throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("addemployee.fxml"));
        Parent root1 = (Parent)fxmlLoader.load();
        //Scene scene = new Scene(fxmlLoader.load());
        // stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage st = new Stage();
        st.setTitle("Employee  Information ");
        st.setScene(new Scene(root1));
        st.show();
    }
    public void switchToLogin (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LoginHome.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToSignup (ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void rent_collection_confermation(ActionEvent event){
            Stage stage1 = (Stage) pane101.getScene().getWindow();
        Alert.AlertType type = Alert.AlertType.CONFIRMATION;
        Alert alert = new Alert(type," ");
        alert.initModality(Modality.APPLICATION_MODAL);
        alert.initOwner(stage1);
        alert.getDialogPane().setContentText("Do you collected rent from this unit ? ");
        Optional<ButtonType> result = alert.showAndWait();
        if(result.get() == ButtonType.OK){

        }
        else if(result.get() == ButtonType.CANCEL){

        }
    }
   public void callconfermation(){
       pane101.setOnMouseClicked(event -> {
           System.out.println("ImageView clicked!");
           Stage stage1 = (Stage) pane101.getScene().getWindow();
           Alert.AlertType type = Alert.AlertType.CONFIRMATION;
           Alert alert = new Alert(type," ");
           alert.initModality(Modality.APPLICATION_MODAL);
           alert.initOwner(stage1);
           alert.getDialogPane().setHeaderText("Do you collected rent from this unit ?");
           alert.getDialogPane().setContentText("Please click Ýes or NO ");
           Optional<ButtonType> result = alert.showAndWait();
           if(result.get() == ButtonType.OK){

           }
           else if(result.get() == ButtonType.CANCEL){

           }

       });

   }

/*  List<new_flat_info> ls = new ArrayList<>();
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

        }*/


/*       public List<new_flat_info> data () {
           System.out.println("HIii");
           List<new_flat_info> ls = new ArrayList<>();
           model_post mp = new model_post();
           mp.setImagesrc("/images/home.png");
           mp.setName("flat 010");
           ls.add(mp);
           return ls;
       }*/


}
