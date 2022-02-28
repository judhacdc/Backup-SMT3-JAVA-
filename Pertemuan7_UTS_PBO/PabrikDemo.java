/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7_UTS_PBO;

/**
 *
 * @author Judha Maygustya
 */
public class PabrikDemo {

    public static void main(String[] args) {
        System.out.println("█▀▀ █▀▀ █── █▀▀█ █▀▄▀█ █▀▀█ ▀▀█▀▀ 　 █▀▀▄ █▀▀█ ▀▀█▀▀ █▀▀█ █▀▀▄ █▀▀▀ \n"
                + "▀▀█ █▀▀ █── █▄▄█ █─▀─█ █▄▄█ ──█── 　 █──█ █▄▄█ ──█── █▄▄█ █──█ █─▀█ \n"
                + "▀▀▀ ▀▀▀ ▀▀▀ ▀──▀ ▀───▀ ▀──▀ ──▀── 　 ▀▀▀─ ▀──▀ ──▀── ▀──▀ ▀──▀ ▀▀▀▀\n");
        System.out.println("+===========================================+");
        System.out.println("|              Data Manager                 |");
        System.out.println("+===========================================+");
        Manager k1 = new Manager();
        k1.alamat = "pandaan";
        k1.jabatanKhusus = "Manager Gudang";
        k1.jenisKelamin = "laki laki";
        k1.nama = "Mahisa";
        k1.tunjanganManager = "Rp.1000.000,-";
        System.out.println(k1.getAllInfo());

        System.out.println("+===========================================+");
        System.out.println("|               Data Satpam                 |");
        System.out.println("+===========================================+");
        Satpam s1 = new Satpam();
        s1.alamat = "mojokerto";
        s1.posJaga = "Pos Depan Gudang";
        s1.jenisKelamin = "perempuan";
        s1.nama = "salwa";
        s1.senjataPendukung = "Pentung & Borgol";
        s1.perlengkapanJaga = "Helm & Sepatu booth";
        System.out.println(s1.getAllInfo());

        System.out.println("+===========================================+");
        System.out.println("|               Data Supervisor             |");
        System.out.println("+===========================================+");
        Supervisor spv1 = new Supervisor("Judha", "Pandaan", "Laki-laki", "Produksi");
        System.out.println(spv1.getAllInfo());
    }
}
