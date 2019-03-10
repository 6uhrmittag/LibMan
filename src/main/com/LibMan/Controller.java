package com.LibMan;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCenter;

    @FXML
    void initialize() {
        assert btnCenter != null : "fx:id=\"btnCenter\" was not injected: check your FXML file 'GUI.fxml'.";

    }
}
