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
public class KeyboardWirelessDemo {

    public static void main(String[] args) {

        KeyboardWireless kw1 = new KeyboardWireless();
        kw1.setJarak(90);
        kw1.setKoneksi("Bluetooth 8.0");
        kw1.setWarna("Pink");
        kw1.cetakInfo();
        System.out.println("");

        KeyboardWireless kw2 = new KeyboardWireless();
        kw2.setJarak(90);
        kw2.setKoneksi("Bluetooth 8.0");
        kw2.setWarna("Pink");
        kw2.cetakInfo();
        System.out.println("");
    }
}
