/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8_Tugas2;


public class Tank extends Transportasi {

    public int luasJangkauanPenyerangan;
    public int panjangRantaiRoda;
    public int jumlhPluru;

    public Tank(String jenisTransportasi, String merk, int jumlahRoda, String warna, String mesin, int maxPenumpang, int kecepatan, int luasJangkauanPenyerangan, int panjangRantaiRoda, int jumlhPluru) {
        super(jenisTransportasi, merk, jumlahRoda, warna, mesin, maxPenumpang, kecepatan);
        this.luasJangkauanPenyerangan = luasJangkauanPenyerangan;
        this.panjangRantaiRoda = panjangRantaiRoda;
        this.jumlhPluru = jumlhPluru;
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Bahan sudah di isi dengan Batu Bara");
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin SUdah di nyalakan dengan Memutar Mesin diesel . .");
    }

    public void aktifkanModeAmfibi() {
        System.out.println("Mode Amfibi telah aktif . .");
    }

    public void bukaPintuAtas() {
        System.out.println("Pintu Atas Dibuka . . .");
    }

    public void putarLarasSenjata() {
        System.out.println("Laras senjata di putar . . .");
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Luas Jangkauan Penyerangan : " + this.luasJangkauanPenyerangan);
        System.out.println("Panjang Rantai Roda        : " + this.panjangRantaiRoda);
        System.out.println("Jumlah Pluru               : " + this.jumlhPluru);
    }

}
