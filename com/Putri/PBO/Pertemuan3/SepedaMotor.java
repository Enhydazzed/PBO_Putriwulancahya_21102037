package com.Putri.PBO.Pertemuan3;

public class SepedaMotor {
    // Atribut
    private String merk;
    private  String tipe;
    private int harga;

    // Constructor
    public SepedaMotor(){}

    // Constructor
    public SepedaMotor(String merk, String tipe, int harga){
        this.merk = merk;
        this.tipe= tipe;
        this.harga = harga;
    }

    // Method getter & setter
    public String getMerk(){
        return merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getTipe(){
        return tipe;
    }

    public void setTipe(String tipe){
        this.tipe = tipe;
    }

    public int getHarga(){
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Method
    public void showInfo(){;
        System.out.println("Merk : "+ merk);
        System.out.println("Tipe :" + tipe);
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}