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
public class Lingkaran extends BangunDatar {

    public double r;

    @Override
    public double getLuas() {
        return 3.14 * (r * r);
    }

    @Override
    public double getKeliling() {
        return 2 * 3.14 * r;
    }

    @Override
    public void cetakInfo() {
        System.out.println("+===================================+");
        System.out.println("|        L I N G K A R A N          |");
        System.out.println("+===================================+");
        System.out.println("Jari jari Liangkaran sebesar : " + this.r);
        System.out.println("Keliling Lingkaran sebesar   : " + this.getKeliling());
        System.out.println("Luas Lingkaran sebesar       : " + this.getLuas());
    }

}
