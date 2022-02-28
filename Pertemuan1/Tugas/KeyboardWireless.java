/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1.Tugas;

/**
 *
 * @author Judha Maygustya
 */
public class KeyboardWireless {

    private String koneksi;
    private String warna;
    private int jarak;

    public void setKoneksi(String newValue) {
        koneksi = newValue;
    }

    public void setJarak(int newValue) {
        jarak = newValue;
    }
     public void setWarna(String newValue) {
        warna = newValue;
    }

    public void cetakInfo() {

        System.out.println("Koneksi       : " + koneksi);
        System.out.println("Jarak maksimal: " + jarak + " m");
        System.out.println("Warna         : " + warna);
    }
}
