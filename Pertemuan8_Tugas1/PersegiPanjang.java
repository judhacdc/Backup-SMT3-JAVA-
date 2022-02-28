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
public class PersegiPanjang extends BangunDatar {

    public double panjang;
    public double lebar;

    @Override
    public double getLuas() {
        return panjang * lebar;
    }

    @Override
    public double getKeliling() {
        return 2 * (panjang * lebar);
    }

    @Override
    public void cetakInfo() {
        System.out.println("+===================================+");
        System.out.println("|    P E R S E G I - P A N J A N G  |");
        System.out.println("+===================================+");
        System.out.println("Panjang Persegi Panjang sebesar  : " + this.panjang);
        System.out.println("Lebar Persegi Panjang sebesar    : " + this.lebar);
        System.out.println("Luas Persegi Panjang sebesar     : " + this.getLuas());
        System.out.println("Keliling Persegi Panjang sebesar : " + this.getKeliling());
    }

}
