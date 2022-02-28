/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9_Praktikum2;

/**
 *
 * @author Judha Maygustya
 */
public class MainElektronik {

    public static void main(String[] args) {
        // kipas
        System.out.println("+=======================================+");
        System.out.println("|              K  I  P  A  S            |");
        System.out.println("+=======================================+");
        Kipas kipas1 = new Kipas("Tempel Dinding", 1000000, "Merah", "Panasonic");
        kipas1.cetakInfo();
        

        // kulkas
        System.out.println("+=======================================+");
        System.out.println("|           K  U  L  K  A  S            |");
        System.out.println("+=======================================+");
        Kulkas kulkas1 = new Kulkas (2,3000000,"Putih","Sharp");
        kulkas1.cetakInfo();
        
        // tv
        System.out.println("+=======================================+");
        System.out.println("|                 T  V                  |");
        System.out.println("+=======================================+");
        TV tv1 = new TV ("Amoled",6,2000000, "Hitam","Samsung");
        tv1.cetakInfo();
        tv1.naikkanVolume();
        tv1.turunkanVolume();
        
        // smart fridge
        System.out.println("+=======================================+");
        System.out.println("|        S M A R T - F R I D G E        |");
        System.out.println("+=======================================+");
        SmartFridge sf1 = new SmartFridge (6, 2, 8000000, "Kuning","Toshiba");
        sf1.cetakInfo();
        sf1.naikkanVolume();
        sf1.turunkanVolume();
    }

}
