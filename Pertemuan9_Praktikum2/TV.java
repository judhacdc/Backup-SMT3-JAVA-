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
public class TV extends AlatElektronik implements Audible{
    private String jenisLayar ;
    private int volume ;

    public TV(String jenisLayar,int volume,double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar ;
        this.volume = volume ;
    }

    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

    @Override
    public void naikkanVolume() {
        System.out.println("Tekan Tombol untuk menaikkan Volume ");
    }

    @Override
    public void turunkanVolume() {
       System.out.println("Tekan Tombol untuk menurunkan Volume ");
    }
    
    public void cetakInfo(){
        System.out.println("Jenis Layar  : "+this.jenisLayar);
        System.out.println("Volume       : "+this.volume);
        super.cetakInfo();
        
    
    }
    
}
