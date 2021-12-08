package com.pertemuanPBO;

import com.sun.rmi.rmid.ExecPermission;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Koneksi {

    private Connection conn;
    private Statement st;

    public Koneksi(){
        try{
            String user = "root";
            String password = "";
            String urldb = "jdbc:mysql://localhost:3306/pbo-reg-21";
            conn = DriverManager.getConnection(urldb, user, password);
            System.out.println("Koneksi berhasil");
        }catch (SQLException e){
            System.out.println("Koneksi Gagal: " + e);

        }catch(Exception e){
            System.out.println("Terjadi Error yang tidak diketahui");
        }
    }

    // Method untuk insert, update, Delete
    public int manipulasiData(String query){
        try{
            st = conn.createStatement();
            return st.executeUpdate(query);
        }catch (SQLException e){
            System.out.println("SQL Error : " + e);
        }catch (Exception e){
            System.out.println();
        }
        return 0;
    }

    public void tutup(){
        try{
            conn.close();
        }catch(SQLException e){
            System.out.println("Koneksi tidak Berhasil ditutup : " + e);
        }catch(Exception e){
            System.out.println("Terjadi Error yang tidak diketahuui : " + e);
        }
    }
}
