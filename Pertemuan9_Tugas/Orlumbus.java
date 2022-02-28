/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9_Tugas;

/**
 *
 * @author Judha Maygustya
 */
public class Orlumbus extends MonsterDarat implements IPergerakan, IPenyerangan, IPerubahan {

    public int jarakMinSergap; // memeberikan jarak minimal untuk melakukan penyergapan
    public int limitMataSharinggan = 3; // memberikan jeda waktu pada orlumbus untuk mengaktifkan mata sharinggan
    public int maxDuplicateBentukMusuh = 3; // untuk memberikan maximal melakukan dupicate bentuk tubuh dari musuh
// cooldown to limit

    public Orlumbus(int jarakMinSergap, int jumlahKaki, int jumlahJari, float jumlahHP, String kekuatan, String ketahanan, float agresivitas, String senjata) {
        super(jumlahKaki, jumlahJari, jumlahHP, kekuatan, ketahanan, agresivitas, senjata);
        this.jarakMinSergap = jarakMinSergap;
    }

    @Override
    public void merayakanKemenangan() {
        System.out.println("▶ Orlumbus Merayakan Kemengangan Dengan cara Tidur");
    }

    @Override
    public void berjalanMaju() {
        System.out.println("▶ Orlumbus Berjalan Maju dengan cepat !");
    }

    @Override
    public void berjalanMundur() {
        System.out.println("▶ Orlumbus Berjalan Mundur dengan cepat !");
    }

    @Override
    public void melompat() {
        System.out.println("▶ Orlumbus melompat sangat rendah ! ");
    }

    @Override
    public void menghilang() {
        System.out.println("▶ Orlumbus menghilang selama 4 menit . . .");
    }

    @Override
    public void menyelamKedalamTanah() {
        System.out.println("▶ Orlumbus Menyelam ke dalam tanah sejauh 6 km ! ");
    }

    @Override
    public void mencakar() {
        System.out.println("✔ Orlumbus Mencakar dengan cakar crystal yang sangat tajam ! ");
    }

    @Override
    public void menggigit() {
        System.out.println("✔ Orlumbus menggigit dengan gigi Kacip ! ");
    }

    @Override
    public void menyemburApi() {
        System.out.println("✔ Orlumbus menyembur api biru yang sangat panas ! ");
    }

    @Override
    public void menembakLaserDariMata() {
        System.out.println("✔ Orlumbus menembakkan laser iponzeo dari mata ! ");
    }

    @Override
    public void menendang() {
        System.out.println("✔ Orlumbus menendang dengan 2 kaki memakai equip sepatu impledown 2.0 ! ");
    }

    @Override
    public void ubahKostum() {
        System.out.println("☀ Orlumbus berganti kostume ke set Demon Slayer 2.0 ! ");
    }

    @Override
    public void ubahWarnaSkin() {
        System.out.println("☀ Orlumbus berganti skin ke warna gold ! ");
    }

    @Override
    public void ubahSenjata() {
        System.out.println("☀ Orlumbus berganti senjata Pedang tanjiro 2.0 ! ");
    }

    public void menDuplicateBentukMusuh() {
        System.out.println("☁ Orlumbus menDuplicate Bentuk Musuh ! ");
        this.maxDuplicateBentukMusuh -= 1;
        System.out.println("☁ Sisa Kesempatan duplicate : " + this.maxDuplicateBentukMusuh + " Kali perMatch");
    }

    public void mengaktifkanMataSharinggan() {
        System.out.println("☁ Orlumbus Mengaktifkan Mata Sharinggan ! ");
        this.limitMataSharinggan -= 1;
        System.out.println("☁ Sisa Kesempatan Menggunakan Mata Sharinggan : " + this.limitMataSharinggan);

    }

    public void menyergap() {
        System.out.println("☁ Orlumbus bersiap menyergap lawan dengan jarak minimal : " + this.jarakMinSergap);
    }

    public void cetakInfo() {
        System.out.println("+=====================================+");
        System.out.println("|           O R L U M B U S           |");
        System.out.println("+=====================================+");
        super.cetakInfo();
        System.out.println("# Limit Orlumbus Memakai Mata Sharinggan : " + this.limitMataSharinggan + " PerMatch");
        System.out.println("# Max Orlumbus menDuplicate Bentuk Musuh : " + this.maxDuplicateBentukMusuh + " Kali PerMatch ");
        System.out.println("# Jarak Minimal Melakukan Penyergapan    : " + this.jarakMinSergap + " Meter");
    }
}
