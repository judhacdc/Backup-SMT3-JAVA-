/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4_Tugasssss;

/**
 *
 * @author Judha Maygustya
 */
public class Pedagang {

    private String nama;
    private String noKtp;

    public Pedagang(String nama, String noKtp) {
        this.nama = nama;
        this.noKtp = noKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getInfo() {
        return nama + "(" + noKtp + ")";

    }

}
