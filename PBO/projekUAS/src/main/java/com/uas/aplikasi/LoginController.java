package com.uas.aplikasi;

import java.sql.ResultSet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginController {

    public Button loginButton;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passField;
    @FXML
    private Button cancelButton;
    public Label pesanLogin;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) {

        String name = usernameField.getText();
        String pass = passField.getText();

        Connect connectNow = new Connect();
        String verifyLogin = "SELECT * FROM data WHERE username='" + name + "' AND pass='" + pass + "'";
        ResultSet rs = connectNow.getResultSet(verifyLogin);

        try{
            if(rs.next()){
                if(name.equals(rs.getString("username")) && pass.equals(rs.getString("pass"))) {

                    FXMLLoader secondScene = new FXMLLoader(getClass().getResource("Main 2.fxml"));
                    root = secondScene.load();
                    SecondController scene2 = secondScene.getController();
                    scene2.displayName(name);
                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setTitle("RumahKu");
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
            }else{
                pesanLogin.setText("Input Gagal!!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void cancelLogin(ActionEvent event) {
        try{
            stage = (Stage) cancelButton.getScene().getWindow();
            stage.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}