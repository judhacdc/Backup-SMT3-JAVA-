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
public class Lebah extends Hewan {
    
    public String kasta ;

    public Lebah (double berat, String makanan,String habitat, int umur, String kasta){
    
    super(berat,makanan,habitat,umur);
    this.kasta = kasta ;
    
    }
    
    public void cetakInfo(){
    super.cetakInfo();
        System.out.println("Kasta   : "+this.kasta);
    
    }
    
    @Override
    public void bergerak() {
        System.out.println("Lebah terbang dengan sayap");
    }

    @Override
    public void bernafas() {
        System.out.println("Lebah bernafas dengan trakea");
    }
}
