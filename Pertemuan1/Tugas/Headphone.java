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
public class Headphone {

    private String merek;
    private String warna;
    private int volume;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void tambahVolume(int increment) {
        volume += increment;
    }

    public void kurangiVolume(int decrement) {
        volume -= decrement ;
    }

    public void cetakInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Volume: " + volume);
    }

}
