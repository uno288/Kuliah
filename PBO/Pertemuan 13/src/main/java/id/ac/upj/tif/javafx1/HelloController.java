package id.ac.upj.tif.javafx1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    public Label label_pesan;
    public TextField text_pesan;
    private Koneksi koneksi = new Koneksi();

    public void button_simpan_onclick(ActionEvent actionEvent) {
        String teks = text_pesan.getText();
        label_pesan.setText(teks);
        if(!teks.isEmpty()){
            String query = "INSERT INTO pesan (ISI) VALUES('"+teks+"')";
            int hasil = koneksi.manipulasiData(query);
            if(hasil == 1){
                System.out.println("Data berhasil diinput");
            }
        }
    }

    public void button_reset_onclick(ActionEvent actionEvent) {
        text_pesan.setText("");
        label_pesan.setText("");
    }
}