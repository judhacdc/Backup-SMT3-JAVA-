/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1.Teori;

/**
 *
 * @author Judha Maygustya
 */
public class DemoPersegi {

    public static void main(String[] args) {

        Persegi sg1 = new Persegi();
        sg1.sisi = 10;
        sg1.dataPersegi();
        System.out.println("Luas persegi sebesar : " + sg1.luasPersegi());
        System.out.println("Keliling persegi sebesar : " + sg1.kelilingPersegi());

        System.out.println("\n");

        Persegi sg2 = new Persegi();
        sg1.sisi = 12340;
        sg1.dataPersegi();
        System.out.println("Luas persegi sebesar : " + sg1.luasPersegi());
        System.out.println("Keliling persegi sebesar : " + sg1.kelilingPersegi());

        System.out.println("\n");

        Persegi sg3 = new Persegi();
        sg1.sisi = 132430;
        sg1.dataPersegi();
        System.out.println("Luas persegi sebesar : " + sg1.luasPersegi());
        System.out.println("Keliling persegi sebesar : " + sg1.kelilingPersegi());

        System.out.println("\n");

        Persegi sg4 = new Persegi();
        sg1.sisi = 103432;
        sg1.dataPersegi();
        System.out.println("Luas persegi sebesar : " + sg1.luasPersegi());
        System.out.println("Keliling persegi sebesar : " + sg1.kelilingPersegi());

    }

}
