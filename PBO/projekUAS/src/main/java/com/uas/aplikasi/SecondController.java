package com.uas.aplikasi;

import java.sql.ResultSet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SecondController {

    @FXML
    private AnchorPane mainPane;
    @FXML
    private Label helloName;
    @FXML
    private TextField tipeRumahField;
    @FXML
    private TextField LTField;
    @FXML
    private TextField LBField;
    @FXML
    private TextField kamarField;
    @FXML
    private TextField wcField;
    @FXML
    private TableView<Data> tableView;
    @FXML
    private TableColumn<Data, String> tipeRumah_col;
    @FXML
    private TableColumn<Data, Integer> LT_col;
    @FXML
    private TableColumn<Data, Integer> LB_col;
    @FXML
    private TableColumn<Data, Integer> kamar_col;
    @FXML
    private TableColumn<Data, Integer> wc_col;
    @FXML
    private TableColumn<Data, Long> harga_col;
    @FXML
    private TextField hargaField;

    Connect connectNow = new Connect();

    public void displayName(String username){
        helloName.setText("Hello, "+username);
    }

    public ObservableList<Data> getDataList() {
        ObservableList<Data> dataList = FXCollections.observableArrayList();
        Connect connectNow = new Connect();

        String queryList = "SELECT * FROM rumahku";
        ResultSet rs = connectNow.getResultSet(queryList);
        try{
            while (rs.next()){
                Data data = new Data(rs.getString("tipe_rumah"), rs.getInt("lt"),
                        rs.getInt("lb"), rs.getInt("kamar"),
                        rs.getInt("wc"), rs.getLong("harga"));
                dataList.add(data);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return dataList;
    }

    public void showData(){
        ObservableList<Data> listData = getDataList();
        tipeRumah_col.setCellValueFactory(new PropertyValueFactory<Data, String>("tipeRumah"));
        LT_col.setCellValueFactory(new PropertyValueFactory<Data, Integer>("lt"));
        LB_col.setCellValueFactory(new PropertyValueFactory<Data, Integer>("lb"));
        kamar_col.setCellValueFactory(new PropertyValueFactory<Data, Integer>("kamar"));
        wc_col.setCellValueFactory(new PropertyValueFactory<Data, Integer>("wc"));
        harga_col.setCellValueFactory(new PropertyValueFactory<Data, Long>("harga"));

        tableView.setItems(listData);
    }

    public void addData(ActionEvent event) {
        String addQuery = "INSERT INTO rumahku VALUES('" + tipeRumahField.getText() +
                "'," + LTField.getText() + "," + LBField.getText() +
                "," + kamarField.getText() + "," + wcField.getText() + "," + hargaField.getText() + ")";
        connectNow.manipulasiData(addQuery);
        showData();
    }

    public void updateData(ActionEvent event) {
        String updateQuery = "UPDATE rumahku SET lt = " + LTField.getText() +
                ", lb = " + LBField.getText() + ", kamar = " + kamarField.getText() +
                ", wc = " + wcField.getText() + ", harga = " + hargaField.getText() + " WHERE tipe_rumah = '" + tipeRumahField.getText() + "'";
        connectNow.manipulasiData(updateQuery);
        showData();
    }

    public void deleteData(ActionEvent actionEvent) {
        String deleteQuery = "DELETE FROM rumahku WHERE tipe_rumah = '" + tipeRumahField.getText() + "'";
        connectNow.manipulasiData(deleteQuery);
        showData();
    }

    public void handleMouseAction(MouseEvent event){
        Data data = tableView.getSelectionModel().getSelectedItem();
        tipeRumahField.setText(data.getTipeRumah());
        LTField.setText(" " + data.getLt());
        LBField.setText(" " + data.getLb());
        kamarField.setText(" " + data.getKamar());
        wcField.setText(" " + data.getWc());
        hargaField.setText(" " + data.getHarga());
    }

    public void logout(ActionEvent event){

        try{
            Alert warn = new Alert(Alert.AlertType.CONFIRMATION);
            warn.setTitle("Logout");
            warn.setHeaderText("Anda yakin ingin keluar ?");
            warn.setContentText("Klik OK untuk keluar");

            if(warn.showAndWait().get() == ButtonType.OK){
                Stage stage = (Stage) mainPane.getScene().getWindow();
                System.out.println("Berhasil keluar!!!");
                stage.close();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
