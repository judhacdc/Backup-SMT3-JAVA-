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
public class Persegi {

    public int sisi;

    public void dataPersegi() {
        System.out.println("Panjang sisi : "+sisi);
    }

    public int luasPersegi() {
        return sisi * sisi;
    }

    public int kelilingPersegi() {
        return 4 * sisi;

    }

}
