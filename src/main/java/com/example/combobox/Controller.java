package com.example.combobox;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

//        @FXML
//        private ResourceBundle resources;

//        @FXML
//        private URL location;

//        @FXML
//        private Button addInputToComboBox;

        @FXML
        private ComboBox<String> comboBox;

//        @FXML
//        private Button getComboBox;

        @FXML
        private TextField textInput;

//        @FXML
//        void initialize() {
//            assert addInputToComboBox != null : "fx:id=\"addInputToComboBox\" was not injected: check your FXML file 'hello-view.fxml'.";
//            assert comboBox != null : "fx:id=\"comboBox\" was not injected: check your FXML file 'hello-view.fxml'.";
//            assert getComboBox != null : "fx:id=\"getComboBox\" was not injected: check your FXML file 'hello-view.fxml'.";
//            assert textInput != null : "fx:id=\"textInput\" was not injected: check your FXML file 'hello-view.fxml'.";

//        }

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            comboBox.setItems(FXCollections.observableArrayList("Dog", "Cat", "Bear"));
        }

        @FXML
        void addInputToComboBox(ActionEvent event) {
            comboBox.getItems().add(textInput.getText());
            textInput.clear();
        }
        @FXML
        void getComboBox(ActionEvent event) {
            System.out.println(comboBox.getValue());
        }

    }
