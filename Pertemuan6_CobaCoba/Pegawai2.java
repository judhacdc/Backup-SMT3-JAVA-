/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6_CobaCoba;

/**
 *
 * @author Judha Maygustya
 */
public class Pegawai2 {

    public String nip;
    public String nama;
    public double gaji;

    public Pegawai2() {

        System.out.println("Object dari class pegawai di buat ...");
    }

    public String getInfo() {

        String info = "";
        info += "NIP : " + nip + "\n";
        info += "Nama : " + nama + "\n";
        info += "Gaji : " + gaji + "\n";
        return info;

    }
}
