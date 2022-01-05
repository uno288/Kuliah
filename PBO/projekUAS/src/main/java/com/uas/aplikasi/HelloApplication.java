package com.uas.aplikasi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("login2.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Login");
            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(windowEvent -> {
                windowEvent.consume();
                logout(stage);
            });

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void logout(Stage stage){

        Alert warn = new Alert(Alert.AlertType.CONFIRMATION);
        warn.setTitle("Logout");
        warn.setHeaderText("Anda yakin ingin keluar ?");
        warn.setContentText("Klik OK untuk keluar");

        if(warn.showAndWait().get() == ButtonType.OK){
            System.out.println("Berhasil keluar!!!");
            stage.close();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}



