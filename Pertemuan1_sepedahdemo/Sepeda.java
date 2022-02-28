/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1_sepedahdemo;

/**
 *
 * @author Judha Maygustya
 */
public class Sepeda {

    public String merek;
    public int kecepatan;
    public int gear;

    public void gantiGear(int newValue) {
        gear = newValue;
    }

    public void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
    }

    public void rem(int decrement) {
        kecepatan = kecepatan - decrement;
    }
    
    public void cetakStatus(){
        System.out.println("Merk       : "+merek);
        System.out.println("Kecepatan  : "+kecepatan);
        System.out.println("Gear       : "+gear);
    }

}
