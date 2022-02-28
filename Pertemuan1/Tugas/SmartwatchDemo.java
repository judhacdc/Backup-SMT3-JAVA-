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
public class SmartwatchDemo {

    public static void main(String[] args) {

        Smartwatch sw1 = new Smartwatch();
        sw1.setMerek("MI Watch");
        sw1.setWarna("Biru Muda");
        sw1.ubahMode("Realtime blood ocymeter");
        sw1.cetakInfo();
        System.out.println("");

        Smartwatch sw2 = new Smartwatch();
        sw2.setMerek("Samsung Gear");
        sw2.setWarna("Hitam");
        sw2.ubahMode("Runing Stabs");
        sw2.cetakInfo();
        System.out.println("");
    }
}
