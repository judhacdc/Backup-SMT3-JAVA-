/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8_Tugas2;


public abstract class Transportasi {

    public String jenisTransportasi;
    public String merk;
    public int jumlahRoda;
    public String warna;
    public String mesin;
    public int maxPenumpang;
    

    public Transportasi(String jenisTransportasi, String merk, int jumlahRoda, String warna, String mesin, int maxPenumpang, int kecepatan) {
        this.jenisTransportasi = jenisTransportasi;
        this.merk = merk;
        this.jumlahRoda = jumlahRoda;
        this.warna = warna;
        this.mesin = mesin;
        this.maxPenumpang = maxPenumpang;
        
    }

    public void cetakInfo() {
        System.out.println("Jenis Transportasi    : " + this.jenisTransportasi);
        System.out.println("Merk                  : " + this.merk);
        System.out.println("Jumlah Roda           : " + this.jumlahRoda);
        System.out.println("Warna                 : " + this.warna);
        System.out.println("Mesin                 : " + this.mesin);
        System.out.println("Max Penumpang         : " + this.maxPenumpang);
    }

    public void tambahKecepatan() {
        System.out.println("Kecepatan di tambah");
    }

    public void kurangiKecepatan() {
        System.out.println("Kecepatan di kurangi");
    }

    public abstract void isiBahanBakar(); // exmple bensin , solar, bartu bara, avtur

    public abstract void nyalakanMesin(); // emple di kayuh , menekan tombol , menarik disel mesin 

}
