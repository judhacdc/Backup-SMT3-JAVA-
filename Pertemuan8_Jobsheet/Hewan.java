/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8_Jobsheet;

/**
 *
 * @author Judha Maygustya
 */
public abstract class Hewan {

    public double berat;
    public String makanan, habitat;
    public int umur;

    public Hewan(double berat, String makanan, String habitat, int umur) {

        this.berat = berat;
        this.makanan = makanan;
        this.habitat = habitat;
        this.umur = umur;
    }

    public void cetakInfo() {
        System.out.println("Berat       : " + this.berat);
        System.out.println("Makanan     : " + this.makanan);
        System.out.println("Habitat     : " + this.habitat);
        System.out.println("Umur        : " + this.umur);

    }

    public abstract void bergerak();
    // as abstract method

    public abstract void bernafas();
    // as abstract method

    public void bertambahUmur() {
        this.umur += 1;
    }

}
