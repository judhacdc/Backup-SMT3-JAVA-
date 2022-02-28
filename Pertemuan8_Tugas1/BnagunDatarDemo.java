/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8_Tugas1;

/**
 *
 * @author Judha Maygustya
 */
public class BnagunDatarDemo {
    
    public static void main(String[] args) {
         Persegi perSG1 = new Persegi ();
         perSG1.sisi = 5 ;
         perSG1.cetakInfo();
         
         System.out.println();
         PersegiPanjang perSG_Pjg1 = new PersegiPanjang ();
         perSG_Pjg1.lebar = 5 ;
         perSG_Pjg1.panjang = 5 ;
         perSG_Pjg1.cetakInfo();
         
         System.out.println();
         Lingkaran lingkaran1 = new Lingkaran();
         lingkaran1.r =  5 ;
         lingkaran1.cetakInfo();
    }
}
