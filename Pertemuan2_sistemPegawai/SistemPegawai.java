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
public class SistemPegawai {

    public static void main(String[] args) {

        Posisi posisiIB = new Posisi();
        posisiIB.nama = "Icik Bos";
        posisiIB.gajiPokok = 4000000;
        posisiIB.uangMakan = 6000;

        Pegawai pgw1 = new Pegawai();

        pgw1.nama = "judha";
        pgw1.nip = 12345;
        pgw1.alamat = "pandaan";
        pgw1.gaji = 40000000;
        pgw1.posisiPgw = posisiIB;
        pgw1.qtyMasuk = 90;
        pgw1.cetakInfoPegawai();

        //---------------------------//
        Posisi posisiMG = new Posisi();
        posisiMG.nama = "Manager";
        posisiMG.gajiPokok = 1000000;
        posisiMG.uangMakan = 9000;

        Pegawai pgw2 = new Pegawai();
        pgw2.nama = "mahisa";
        pgw2.nip = 423908;
        pgw2.alamat = "mojokerto";
        pgw2.gaji = 100000000;
        pgw2.posisiPgw = posisiMG;
        pgw2.qtyMasuk= 80;
        pgw2.cetakInfoPegawai();
    }

}
