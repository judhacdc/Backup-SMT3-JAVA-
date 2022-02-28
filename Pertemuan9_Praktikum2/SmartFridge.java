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
public class SmartFridge extends Kulkas implements Audible {
    
    private int volume ;

    public SmartFridge(int volume, int jumlahPintu, double harga, String warna, String merk) {
        super(jumlahPintu, harga, warna, merk);
        this.volume = volume;
    }
    public void cetakInfo (){
        System.out.println("Volume : "+this.volume);
        super.cetakInfo();
    
    }
      @Override
    public void naikkanVolume() {
        System.out.println("Tekan Tombol untuk menaikkan Volume ");
    }

    @Override
    public void turunkanVolume() {
       System.out.println("Tekan Tombol untuk menurunkan Volume ");
    }
    
}
