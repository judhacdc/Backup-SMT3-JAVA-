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
public class Persegi extends BangunDatar {
    
    public double sisi;

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling(){ 
        return sisi * 4;
    }

    @Override
    public void cetakInfo() {
        System.out.println("+===================================+");
        System.out.println("|            P E R S E G I          |");
        System.out.println("+===================================+");
        System.out.println("Sisi Persegi sebesar     : "+this.sisi);
        System.out.println("Keliling Persegi sebesar : "+this.getKeliling());
        System.out.println("Luas Persegi sebesar     : "+this.getLuas());
    }
    
    
}
