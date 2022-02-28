package Pertemuan2.Tugas;

/**
 *
 * @author Judha Maygustya
 */
public class Transaksi {

    public int idTransaksi;
    public int lamaSewa;
    public int totalBayar;
    public String namaMember;
    public Game gameSk;

    public int hitungSewa() {
        int totalSewa = gameSk.hargaSewa * lamaSewa;

        return totalSewa;

    }

    public void cetakDetailTrx() {
        System.out.println("\n\n+----------------------------------------+");
        System.out.println("|                NOTA ANDA               |");
        System.out.println("+----------------------------------------+");
        System.out.println("|▶ Nama penyewa : " + namaMember);
        System.out.println("|▶ Lama Sewa    : " + lamaSewa);
        System.out.println("|▶ ID transaksi : " + idTransaksi);
        System.out.println("|▶ Nama Game    : " + gameSk.namaGame);
        System.out.println("|▶ Harga Sewa   : " + gameSk.hargaSewa);
        System.out.println("|▶ TOTAL        : " + hitungSewa());
        System.out.println("+----------------------------------------+");
        System.out.println("|  TERIMAKASIH! SILAHKAN DATANG KEMBALI! |");
        System.out.println("+----------------------------------------+");
    }

}
