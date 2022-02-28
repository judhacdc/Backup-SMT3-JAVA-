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
public class Satpam extends KaryawanPabrik {

    public String posJaga; //EXMPLE Manager Gudang , Manager Produksi
    public String senjataPendukung;
    public String perlengkapanJaga;

    public Satpam() {
        System.out.println("# Object Satpam");
    }

    public Satpam(String nama, String alamat, String jenisKelamin, String posJaga, String senjataPendukung) {

        super(nama, alamat, jenisKelamin);
        this.posJaga = posJaga;
        this.senjataPendukung = senjataPendukung;
        this.perlengkapanJaga = perlengkapanJaga;

    }

    public String getInfo() {
        String info = "";
        info += "▶ Pos Yang Di Jaga     : " + this.posJaga + "\n";
        info += "▶ Senjata Pendukung    : " + this.senjataPendukung + "\n";
        info += "▶ Perlangkapan Jaga    : " + this.perlengkapanJaga + "\n";
        return info;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;

    }

}
