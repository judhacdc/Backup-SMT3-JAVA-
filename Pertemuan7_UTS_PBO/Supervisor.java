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
public class Supervisor extends KaryawanPabrik {

    public String diviYangDiHandle; // Gudang ,  Produksi

    public Supervisor() {
        System.out.println("# Object Supervisor");
    }

    public Supervisor(String nama, String alamat, String jenisKelamin, String diviYangDiHandle) {

        super(nama, alamat, jenisKelamin);
        this.diviYangDiHandle = diviYangDiHandle;

    }

    public String getInfo() {
        String info = "";
        info += "▶ Menangani Divisi     : " + this.diviYangDiHandle + "\n";
        return info;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;

    }

}
