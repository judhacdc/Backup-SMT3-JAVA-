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
public class AbstractClassDemo {
    
    
    public static void main(String[] args) {
//        Hewan hewan1 = new Hewan();
//        hewan1.bergerak();
//        hewan1.bernafas();
        
        Lebah lebah1 = new Lebah (0.01,"Madu","Hutan",1,"Ratu");
        lebah1.bertambahUmur();
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernafas();
    }
}
