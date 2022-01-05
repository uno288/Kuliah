package com.uas.aplikasi;

public class Data {

    private String tipeRumah;
    private int lt;
    private int lb;
    private int kamar;
    private int wc;
    private long harga;

    public Data(String tipeRumah, int lt, int lb, int kamar, int wc, long harga) {
        this.wc = wc;
        this.tipeRumah = tipeRumah;
        this.lt = lt;
        this.lb = lb;
        this.kamar = kamar;
        this.harga = harga;
    }

    public int getWc() {
        return wc;
    }

    public String getTipeRumah() {
        return tipeRumah;
    }

    public int getLt() {
        return lt;
    }

    public int getLb() {
        return lb;
    }

    public int getKamar() {
        return kamar;
    }

    public long getHarga() {
        return harga;
    }
}
