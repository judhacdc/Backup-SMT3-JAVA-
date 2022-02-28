/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9_Praktikum2;

/**
 *
 * @author Judha Maygustya
 */
public class AlatElektronik {
    protected double harga ;
    protected String warna,merk;

    public AlatElektronik(double harga, String warna, String merk) {
        this.harga = harga;
        this.warna = warna;
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void cetakInfo(){
        System.out.println("Harga : Rp."+this.harga);
        System.out.println("Warna : "+this.warna);
        System.out.println("Merk  : "+this.merk);
    
    }
    
    
}
