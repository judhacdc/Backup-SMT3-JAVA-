/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8_Tugas2;


public class Pesawat extends Transportasi {

    public int jumlahBalingBaling;

    public Pesawat(String jenisTransportasi, String merk, int jumlahRoda, String warna, String mesin, int maxPenumpang, int kecepatan, int jumlahBalingBaling) {
        super(jenisTransportasi, merk, jumlahRoda, warna, mesin, maxPenumpang, kecepatan);
        this.jumlahBalingBaling = jumlahBalingBaling;
    }

    @Override
    public void isiBahanBakar() {
         System.out.println("Bahan sudah di isi dengan batu bara");
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin Sudah di nyalakan dengan tekan tombol a b dan c");
    }

    public void takeOff() {
        System.out.println("Pesawat akan Take off dalam 5 mnenit . .");
    }

    public void landing() {
        System.out.println("Pesawat akan landing dalam 5 menit . . .");
    }

    public void cekNavigasi() {
        System.out.println("Sedang melakukan checking navigasi . .");
    }
public void cetakInfo(){
 super.cetakInfo();
    System.out.println("Jumlah Baling Baling   : "+this.jumlahBalingBaling);
}
}
