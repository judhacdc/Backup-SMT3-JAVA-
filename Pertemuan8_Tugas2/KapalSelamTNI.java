/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8_Tugas2;


public class KapalSelamTNI extends Transportasi {

    public String tipeKapal;
    public int maxKedalaman;
    public String senjata;

    public KapalSelamTNI(String jenisTransportasi, String merk, int jumlahRoda, String warna, String mesin, int maxPenumpang, int kecepatan, String tipeKapal, int maxKedalaman, String senjata) {
        super(jenisTransportasi, merk, jumlahRoda, warna, mesin, maxPenumpang, kecepatan);
        this.tipeKapal = tipeKapal;
        this.maxKedalaman = maxKedalaman;
        this.senjata = senjata;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tipe Kapal    : " + this.tipeKapal);
        System.out.println("Max Kedalaman : " + this.maxKedalaman);
        System.out.println("Senjata       : " + this.senjata);
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Bahan sudah di isi dengan Batu Bara");
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Mesin SUdah di nyalakan dengan Memutar Katup");
    }
    
    public void menyelamKedasarLaut(){
        System.out.println("Kapal akan menyelam ke dasar laut . . . ");
    }
    public void tembakMusuh (){
        System.out.println("Kapal Menembak Musuh . . . .");
    }
    
   

}
