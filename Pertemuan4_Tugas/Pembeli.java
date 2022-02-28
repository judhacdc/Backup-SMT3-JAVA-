package Pertemuan4_Tugas;

/**
 *
 * @author Judha Maygustya
 */
import java.time.LocalDate;
import java.util.ArrayList;

public class Pembeli {

    private String idTrx;
    private String nama;
    private String IDGame;
    private ArrayList<Transaksi> riwayatTransaksi;

    public Pembeli(String idTrx, String nama, String IDGame) {
        this.idTrx = idTrx;
        this.nama = nama;
        this.IDGame = IDGame;
        this.riwayatTransaksi = new ArrayList<>();
    }

    public void tambahTransaksi(LocalDate tanggal, Admin admin, int nominalPembayaran) {

        Transaksi transaksi = new Transaksi();
        transaksi.setTanggal(tanggal);
        transaksi.setAdmin(admin);
        transaksi.setNominalPembayaran(nominalPembayaran);
        riwayatTransaksi.add(transaksi);
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

    public String getInfo() {
        String info = "";
        info += "+============================================+\n";
        info += "|             DATA PELANGGAN                 |\n";
        info += "+============================================+\n";
        info += "ID Transaksi\t\t : " + this.idTrx + "\n";
        info += "Nama\t\t\t : " + this.nama + "\n";
        info += "ID Game\t\t\t :" + this.IDGame + "\n";
        info += "\n";
        if (!riwayatTransaksi.isEmpty()) {
            info += "+============================================+\n";
            info += "|            RIWAYAT TRANSAKSI               |\n";
            info += "+============================================+\n";
            for (Transaksi trs : riwayatTransaksi) {
                info += trs.getInfo();
            }
        } else {
            info += "Tidak Ada Riwayat Transaksi!";
        }
        info += "\n";
        return info;
    }

}
