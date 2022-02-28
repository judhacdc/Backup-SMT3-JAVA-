package Pertemuan4_Tugasssss;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Judha Maygustya
 */
public class Pembeli {

    private String idTrx;
    private String nama;
    public ArrayList<Transaksi> riwayatTrx;

    public Pembeli(String idTrx, String nama) {
        this.idTrx = idTrx;
        this.nama = nama;
        this.riwayatTrx = new ArrayList<>();
    }

    public void tambahTransaksi(LocalDate tanggal, Pedagang pedagang, Pedagang anakbuahPedagang) {
        Transaksi transaksi = new Transaksi();
        transaksi.setTanggalTrx(tanggal);
        transaksi.setPedagang(pedagang);
        transaksi.setanakbuahPedagang(anakbuahPedagang);

        riwayatTrx.add(transaksi);
    }

    public String getIdTrx() {
        return idTrx;
    }

    public void setIdTrx(String idTrx) {
        this.idTrx = idTrx;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Transaksi> getRiwayatTrx() {
        return riwayatTrx;
    }

    public void setRiwayatTrx(ArrayList<Transaksi> riwayatTrx) {
        this.riwayatTrx = riwayatTrx;
    }

    public String getInfo() {
        String info = "";
        info += "ID Transaksi anda    : " + this.idTrx + "\n";
        info += "Nama                 : " + this.nama + "\n";
        info += "---------------------------------------\n";
        return info;
    }

    public String cekRiwayat() {
        String info = "";
        if (!riwayatTrx.isEmpty()) {
            System.out.println("Data ditemukan ");
            info += "Riwayat Transaksi :\n";
            for (Transaksi item : riwayatTrx) {
                info += item.getInfo();
            }
        } else {
            info += "Belum ada riwayat Transaksi";
        }
        return info;
    }
}