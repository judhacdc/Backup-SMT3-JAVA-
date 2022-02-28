/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8_Tugas2;


public class MotorSupra extends Transportasi {

    public int jumlahSpion;
    public int kluaranTahun;
    public int noSTNK;
    public int noPlat;

    public MotorSupra(String jenisTransportasi, String merk, int jumlahRoda, String warna, String mesin, int maxPenumpang, int kecepatan, int jumlahSpion, int kluaranTahun, int noSTNK, int noPlat) {
        super(jenisTransportasi, merk, jumlahRoda, warna, mesin, maxPenumpang, kecepatan);
        this.jumlahSpion = jumlahSpion;
        this.kluaranTahun = kluaranTahun;
        this.noSTNK = noSTNK;
        this.noPlat = noPlat;
    }

    @Override
    public void isiBahanBakar() {
       System.out.println("Bahan sudah di isi dengan bensin");
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin Sudah di nyalakan dengan Kayuh Persneling");
    }

    public void bukaJok() {
        System.out.println("Buka jok sekarang . . ");
    }

    public void tambahGigi() {
        System.out.println("Gigi motor di tambah . .");
    }
public void cetakInfo(){
 super.cetakInfo();
    System.out.println("Jumlah Spion    : "+this.jumlahSpion);
    System.out.println("Kluaran Tahun   : "+this.kluaranTahun);
    System.out.println("Nomer STNK      : "+this.noSTNK);
    System.out.println("Nomer Plat      : "+this.noPlat);
}
}
