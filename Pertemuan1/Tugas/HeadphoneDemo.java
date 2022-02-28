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
public class HeadphoneDemo {

    public static void main(String[] args) {

        Headphone hd1 = new Headphone();
        hd1.setMerek("Razer");
        hd1.setWarna("Biru");
        hd1.tambahVolume(20);
        hd1.kurangiVolume(2);
        hd1.cetakInfo();
        System.out.println("");

        Headphone hd2 = new Headphone();
        hd2.setMerek("Lofitech");
        hd2.setWarna("Hijau");
        hd2.tambahVolume(23);
        hd2.kurangiVolume(8);
        hd2.cetakInfo();
        System.out.println("");

    }
}
