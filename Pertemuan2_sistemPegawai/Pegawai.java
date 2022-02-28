/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2_sistemPegawai;

/**
 *
 * @author Judha Maygustya
 */
public class Pegawai {

    public int nip;
    public String nama;
    public String alamat;
    public int gaji;
    public Posisi posisiPgw;
    public int qtyMasuk;

    public int hitungGaji() {

        int totalGaji = posisiPgw.gajiPokok + qtyMasuk * posisiPgw.uangMakan;
        return totalGaji;
    }

    public void cetakInfoPegawai() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP :" + nip);
        System.out.println("Alamat : " + alamat);
        System.out.println("Posisi : " + posisiPgw.nama);
        System.out.println("Gaji : " + hitungGaji());
 

    }

}
