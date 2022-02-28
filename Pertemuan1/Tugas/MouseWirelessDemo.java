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
public class MouseWirelessDemo {

    public static void main(String[] args) {

        MouseWireless mw1 = new MouseWireless();
        mw1.setJarak(82);
        mw1.setKoneksi("Bluetooth 9.1");
        mw1.setWarna("Putih");
        mw1.cetakInfo();
        System.out.println("");

        MouseWireless mw2 = new MouseWireless();
        mw2.setJarak(15);
        mw2.setKoneksi("Bluetooth 3.1");
        mw2.setWarna("Abu - Abu");
        mw2.cetakInfo();
        System.out.println("");
    }

}
