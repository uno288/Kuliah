package id.ac.upj.tif.javafx1;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public class Koneksi {

    private Connection conn;
    private Statement st;

    public Koneksi() {
        try{
            String user = "root";
            String password = "";
            String urldb = "jdbc:mysql://localhost:3306/pbo-reg-21";
            conn = DriverManager.getConnection(urldb, user, password);
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    // Method untuk insert, update, Delete
    public int manipulasiData(String query) {
        try {
            st = conn.createStatement();
            return st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public void tutup() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
