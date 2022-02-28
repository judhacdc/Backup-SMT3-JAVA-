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
public class RoronoaZoro extends MonsterDarat implements IPergerakan, IPenyerangan, IPerubahan {

    public int maxTaunting = 4; // untuk mebatasi banyak emoticon yang dapat di bawa ke pertempuran
    public int maxMenyerah = 8; // menyerah disini bertujuan supaya monster dapat menyerah saat terdesak , dan tetap bisa menjaga ke-rahasiaan informasi 
    public int maxJumlahBunshin = 7; // jumlah bunshin/clone di batasi supaya tidak terlalu membingungkan lawan

    public RoronoaZoro(int jumlahKaki, int jumlahJari, float jumlahHP, String kekuatan, String ketahanan, float agresivitas, String senjata) {
        super(jumlahKaki, jumlahJari, jumlahHP, kekuatan, ketahanan, agresivitas, senjata);
        
    }

    @Override
    public void merayakanKemenangan() {
        System.out.println("▶ Roronoa Zoro Merayakan Kemengangan Dengan Memakan Daging Panggang");
    }

    @Override
    public void berjalanMaju() {
        System.out.println("▶ Roronoa Berjalan Maju Dengan Santai!");
    }

    @Override
    public void berjalanMundur() {
        System.out.println("▶ Roronoa Berjalan Mundur Dengan Santai!");
    }

    @Override
    public void melompat() {
        System.out.println("▶ Roronoa melompat rendah ! ");
    }

    @Override
    public void menghilang() {
        System.out.println("▶ Roronoa menghilang selama 5 menit . . .");
    }

    @Override
    public void menyelamKedalamTanah() {
        System.out.println("▶ Roronoa Menyelam ke dalam tanah sejauh 12 km ! ");
    }

    @Override
    public void mencakar() {
        System.out.println("✔ Roronoa Mencakar dengan cakar kaca yang sangat tajam ! ");
    }

    @Override
    public void menggigit() {
        System.out.println("✔ Roronoa menggigit dengan gigi taring atas ! ");
    }

    @Override
    public void menyemburApi() {
        System.out.println("✔ Roronoa menyembur api pink yang sangat panas ! ");
    }

    @Override
    public void menembakLaserDariMata() {
        System.out.println("✔ Roronoa menembakkan laser amaterasu dari mata ! ");
    }

    @Override
    public void menendang() {
        System.out.println("✔ Roronoa menendang dengan 2 kaki memakai equip sepatu skypeaa 2.0 ! ");
    }

    @Override
    public void ubahKostum() {
        System.out.println("☀ Roronoa berganti kostume ke set Arcanist ! ");
    }

    @Override
    public void ubahWarnaSkin() {
        System.out.println("☀ Roronoa berganti skin ke warna silver ! ");
    }

    @Override
    public void ubahSenjata() {
        System.out.println("☀ Roronoa berganti senjata kapak garuda ! ");
    }

    public void menyerah() {
        System.out.println("☁ Roronoa Menyerah ! ");
        this.maxMenyerah -= 1;
        System.out.println("☁ Sisa menyerah tinggal : " + this.maxMenyerah);

    }

    public void taunting() {
        System.out.println("☁ Roronoa melakukan taunting !");
        this.maxTaunting -= 1;
        System.out.println("☁ Sisa Taunting yang dapat di lakukan : " + this.maxTaunting);
    }

    public void mengeluarkanBunshin() {
        System.out.println("☁ Roronoa Mengeluarkan Bunshin ! ");
        this.maxJumlahBunshin -= 1;
        System.out.println("☁ Sisa Bunshin Roronoa : " + this.maxJumlahBunshin);
    }

    public void cetakInfo() {
        System.out.println("+=====================================+");
        System.out.println("|       R O R O N O A - Z O R O       |");
        System.out.println("+=====================================+");
        super.cetakInfo();
        System.out.println("# Jumlah Emoticon Taunting   : " + this.maxTaunting + " Kali perMatch");
        System.out.println("# Max Jumlah Bunshin Roronoa : " + this.maxJumlahBunshin + " PerMatch");
        System.out.println("# Max Roronoa Menyerah       : " + this.maxMenyerah + " PerMatch");
    }

}
