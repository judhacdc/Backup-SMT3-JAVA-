package Pertemuan4_Tugasssss;

import java.time.LocalDate;

/**
 *
 * @author Judha Maygustya
 */
public class Transaksi {

    private LocalDate tanggalTrx;
    private Pedagang pedagang;
    private Pedagang anakbuahPedagang;

    public LocalDate getTanggalTrx() {
        return tanggalTrx;
    }

    public void setTanggalTrx(LocalDate tanggalTrx) {
        this.tanggalTrx = tanggalTrx;
    }

    public Pedagang getPedagang() {
        return pedagang;
    }

    public void setPedagang(Pedagang pedagang) {
        this.pedagang = pedagang;
    }

    public Pedagang getanakbuahPedagang() {
        return anakbuahPedagang;
    }

    public void setanakbuahPedagang(Pedagang anakbuahPedagang) {
        this.anakbuahPedagang = anakbuahPedagang;
    }

    public String getInfo() {
        String info = "";
        info += "\nTanggal        : " + tanggalTrx;
        info += "\nPedagang       : " + pedagang.getInfo();
        info += "\nAnak Buah      : " + anakbuahPedagang.getInfo();
        info += "\n";

        return info;
    }

}
