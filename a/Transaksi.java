package a;

import java.time.LocalDate;

/**
 *
 * @author Judha Maygustya
 */
public class Transaksi {

    private LocalDate tanggalTrx;
    private Pedagang pedagang;
    private Pedagang istriPedagang;

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

    public Pedagang getIstriPedagang() {
        return istriPedagang;
    }

    public void setIstriPedagang(Pedagang istriPedagang) {
        this.istriPedagang = istriPedagang;
    }

    public String getInfo() {
        String info = "";
        info += "\nTanggal        : " + tanggalTrx;
        info += "\nPedagang       : " + pedagang.getInfo();
        info += "\nIstri Pedagang : " + istriPedagang.getInfo();
        info += "\n";

        return info;
    }

}
