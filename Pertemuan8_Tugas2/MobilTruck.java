/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8_Tugas2;

public class MobilTruck extends Transportasi {

    public int maxKapasitasbak;
    public String maxKapasitasBahanBakar;

    public MobilTruck(String jenisTransportasi, String merk, int jumlahRoda, String warna, String mesin, int kecepatan, int maxPenumpang, int maxKapasitasbak, String maxKapasitasBahanBakar) {
        super(jenisTransportasi, merk, jumlahRoda, warna, mesin, maxPenumpang, kecepatan);
        this.maxKapasitasbak = maxKapasitasbak;
        this.maxKapasitasBahanBakar = maxKapasitasBahanBakar;
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Bahan sudah di isi dengan solar");
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin Sudah di nyalakan dengan injak Kopling dan Gas");
    }

    public void jungkirBak() {
        System.out.println("Bak sedang di jungkir . . .");
    }

    public void jalanMundur() {
        System.out.println("Mobil sedang jalan mundur . .  Mohon jaga jarak . .");
    }
    public void cetakInfo(){
     super.cetakInfo();
        System.out.println("Max Kapasitas Bak   : "+this.maxKapasitasbak);
        System.out.println("Max Bahan Bakar     : "+this.maxKapasitasBahanBakar);
    
    }

}
