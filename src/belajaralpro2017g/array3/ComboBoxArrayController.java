/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajaralpro2017g.array3;

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
public class ComboBoxArrayController implements Initializable {
    @FXML
    private ComboBox<String> comboBoxNama;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //inisialisasi array
        String[] nama = new String[]{"Nama1", "Nama2", "Nama3", "Nama4"};
        //menambahkan nama ke comboBox
        comboBoxNama.getItems().setAll(nama);
    }    
    
}
