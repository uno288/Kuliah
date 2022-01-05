module com.uas.aplikasi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;
    requires mysql.connector.java;


    opens com.uas.aplikasi to javafx.fxml;
    exports com.uas.aplikasi;
}