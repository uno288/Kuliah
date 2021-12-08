package com.pertemuanPBO;

public class Main {

    public static void main(String[] args) {

        String namaDepan = "Rudi";
        String namaBelakang = "Hartono";
        int umur = 17;

        BioData biodata = new BioData();
        biodata.setNamaDepan(namaDepan);
        biodata.setNamaBelakang(namaBelakang);
        biodata.setUmur(umur);

        int hasil = biodata.tambahData();

        if (hasil == 1){
            System.out.println("Data Berhasil diinput");
        }else{
            System.out.println("Data tidak berhasil Diinput");
        }

    }
}
