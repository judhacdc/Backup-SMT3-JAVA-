/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7_UTS_PBO;

/**
 *
 * @author Judha Maygustya
 */
public class Manager extends KaryawanPabrik {

    public String jabatanKhusus; //EXMPLE Manager Gudang , Manager Produksi
    public String tunjanganManager;

    public Manager() {
        System.out.println("# Object Manager");
    }

    public Manager(String nama, String alamat, String jenisKelamin, String jabatanKhusus, String tunjanganManager) {

        super(nama, alamat, jenisKelamin);
        this.jabatanKhusus = jabatanKhusus;
        this.tunjanganManager = tunjanganManager;

    }

    public String getInfo() {
        String info = "";
        info += "▶ Jabatan Divisi       : " + this.jabatanKhusus + "\n";
        info += "▶ Tunjangan Manager    : " + this.tunjanganManager + "\n";
        
//        info += "▶ test    : " + this.nama + "\n";
        return info;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;

    }

}
