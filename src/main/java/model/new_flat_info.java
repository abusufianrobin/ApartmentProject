package model;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class new_flat_info {
    private String imagesrc;
    private String name;
    private String amount;
    @FXML
    Label flat_label;
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public  String getImagesrc() {
        return imagesrc;
    }

    public void setImagesrc(String imagesrc) {
        this.imagesrc = imagesrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
}
