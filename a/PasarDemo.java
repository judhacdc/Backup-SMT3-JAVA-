/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.time.LocalDate;

/**
 *
 * @author Judha Maygustya
 */
public class PasarDemo {
    public static void main(String[] args) {
        Pedagang ani = new Pedagang("1234", "Ani");
        Pedagang bagus = new Pedagang("5678", "Bagus");
    
        Pedagang desi = new Pedagang("7465", "Desi");
        Pedagang eka = new Pedagang("8907", "Eka");
    
        Pembeli pasien1 = new Pembeli ("1122", "Puspa Widya");
        pasien1.tambahTransaksi(LocalDate.of(2021, 9, 18), ani, eka);
        pasien1.tambahTransaksi(LocalDate.of(2021, 8, 20), bagus, desi);
    
        System.out.println(pasien1.getInfo());
    
        Pembeli pasien2 = new Pembeli ("3344", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
    
}
