package com.pertemuanPBO;

public class BioData {

    private int id;
    private String namaDepan;
    private String namaBelakang;
    private int umur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int tambahData(){

        Koneksi koneksi = new Koneksi();
        // String Query SQL
//        String query = "INSERT INTO biodata (namadepan, namabelakang, umur)" + "VALUES('Andi','Nugroho','36')";
        String query = "INSERT INTO biodata (namadepan, namabelakang, umur)" +
                "VALUES('" + this.namaDepan + "','" + this.namaBelakang  + "','" + this.umur + "')";
        System.out.println("Query + " + query);

        int hasil = koneksi.manipulasiData(query);
        koneksi.tutup();

        return hasil;
    }
}
