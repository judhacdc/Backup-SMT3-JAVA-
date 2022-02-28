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
public class Kulkas extends AlatElektronik implements Audible {

    private int jumlahPintu;

    public Kulkas(int jumlahPintu, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void naikkanVolume() {
        System.out.println("Tekan Tombol untuk menaikkan Volume ");
    }

    @Override
    public void turunkanVolume() {
        System.out.println("Tekan Tombol untuk menurunkan Volume ");
    }
    public void cetakInfo (){
        System.out.println("Jumlah Pintu : "+this.jumlahPintu);
        super.cetakInfo();
    
    
    }

}
