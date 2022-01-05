package com.uas.aplikasi;

import java.sql.*;

public class Connect {

    private Connection conn;
    private Statement st;
    private ResultSet rs;

    Connect(){
        try{
            String user = "root";
            String password = "";
            String urldb = "jdbc:mysql://localhost:3306/pbo-reg-21";
            conn = DriverManager.getConnection(urldb, user, password);
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

//     Method untuk insert, update, Delete
    public int manipulasiData(String query) {
        try {
            st = conn.createStatement();
            return st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public ResultSet getResultSet(String query){
        try{
            st = conn.createStatement();
            return st.executeQuery(query);
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void tutup() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
