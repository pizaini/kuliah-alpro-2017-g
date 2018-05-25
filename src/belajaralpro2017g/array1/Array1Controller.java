/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajaralpro2017g.array1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Pizaini
 */
public class Array1Controller implements Initializable {
    @FXML
    private ComboBox<String> comboNama;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] nama = {"nama", "nama2", "nama3"};
        comboNama.getItems().addAll(nama);
    }    
    
}
