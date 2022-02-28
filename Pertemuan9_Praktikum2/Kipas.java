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
public class Kipas extends AlatElektronik {
private String jenis;

    public Kipas(String jenis, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

   public void cetakInfo (){
       System.out.println("Jenis Kipas : "+this.jenis);
       super.cetakInfo();
   
   }
    
}
