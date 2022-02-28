/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6_CobaCoba;

/**
 *
 * @author Judha Maygustya
 */
public class InheritenceDemo2 {

    public static void main(String[] args) {
        Dosen2 dosen1 = new Dosen2();
        
        dosen1.nip = "342234423";
        dosen1.nama = "mahisa";
        dosen1.gaji = 100000;
        dosen1.nidn = "347829732";
        dosen1.MengajarMatkul = "PBO";
        
        System.out.println(dosen1.getAllInfo());
        
    }
}
