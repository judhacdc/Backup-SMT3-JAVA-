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
public class Dosen2 extends Pegawai2 {

    public String nidn;
    public String MengajarMatkul;

    public Dosen2() {
        System.out.println("Obect class Dosen di buat ");

    }

    public String getInfo() {
        String info = "";
        info += "NIDN        : " + this.nidn + "\n";
        info += "Matkul      : " + this.MengajarMatkul + "\n";
        return info;
    }

    public String getAllInfo() {

        String info = super.getInfo();
         info = this.getInfo();
        return info;

    }
}
