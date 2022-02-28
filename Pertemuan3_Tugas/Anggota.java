package Pertemuan3_Tugas;

/**
 *
 * @author Judha Maygustya
 */
public class Anggota {

    private String nama;
    private String noKTP;
    private int LimitPinjaman;
    private int JumlahPinjaman;
    private int pinjam;
    private int angsur;

    public Anggota(String noKTP, String nama, int LimitPinjaman) {
        this.nama = nama;
        this.LimitPinjaman = LimitPinjaman;
        this.noKTP = noKTP;
    }

    public int getJumlahPinjaman() {
        pinjam += JumlahPinjaman;
        return JumlahPinjaman;
    }

    public int getLimitPinjaman() {
        return LimitPinjaman;
    }

    public String getNama() {
        return nama;
    }

    public void pinjam(int pinjam) {
        if (pinjam < LimitPinjaman) {
            LimitPinjaman -= pinjam;
            JumlahPinjaman += pinjam;
        } else {
            System.out.println("Maaf,Pinjaman Melebihi Limit!");
        }
        this.pinjam = pinjam;
    }

    public void angsur(int angsur) {
        if (angsur >= (JumlahPinjaman * 10 / 100)) {
            JumlahPinjaman -= angsur;
            LimitPinjaman += angsur;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }

        this.angsur = angsur;
    }
}
