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
public class Cavendish extends MonsterDarat implements IPergerakan, IPenyerangan {

    public int maxScanKelemahanMusuh = 2; // jika monster dapat melakukan scan kelemahan unlimited, pihak hero akan di rugikan
    public int jarakMaxMengintai; // jika jarak pengintaiian terlalu jauh, monster akan terlalu over power

    public Cavendish(int jarakMaxMengintai, int jumlahKaki, int jumlahJari, float jumlahHP, String kekuatan, String ketahanan, float agresivitas, String senjata) {
        super(jumlahKaki, jumlahJari, jumlahHP, kekuatan, ketahanan, agresivitas, senjata);
        
        this.jarakMaxMengintai = jarakMaxMengintai;
    }

    @Override
    public void merayakanKemenangan() {
        System.out.println("▶ Cavendish Merayakan Kemengangan Dengan Meminum Sake ");
    }

    @Override
    public void berjalanMaju() {
        System.out.println("▶ Cavendish Berjalan Maju Dengan Perlahan !");
    }

    @Override
    public void berjalanMundur() {
        System.out.println("▶ Cavendish Berjalan Mundur Dengan Perlahan !");
    }

    @Override
    public void melompat() {
        System.out.println("▶ Cavendish melompat tinggi ! ");
    }

    @Override
    public void menghilang() {
        System.out.println("▶ Cavendish menghilang selama 2 menit . . .");
    }

    @Override
    public void menyelamKedalamTanah() {
        System.out.println("▶ Cavendish Menyelam ke dalam tanah sejauh 1 km ! ");
    }

    @Override
    public void mencakar() {
        System.out.println("✔ Cavendish Mencakar dengan cakar berlian yang sangat tajam ! ");
    }

    @Override
    public void menggigit() {
        System.out.println("✔ Cavendish menggigit dengan gigi graham ! ");
    }

    @Override
    public void menyemburApi() {
        System.out.println("✔ Cavendish menyembur api merah yang sangat panas ! ");
    }

    @Override
    public void menembakLaserDariMata() {
        System.out.println("✔ Cavendish menembakkan laser arcanist dari mata ! ");
    }

    @Override
    public void menendang() {
        System.out.println("✔ Cavendish menendang dengan 2 kaki memakai equip sepatu axolotl 2.0 ! ");
    }

    public void mengintai() {
        System.out.println("☁ Cavendish sedang mengintai lawan dengan jarak : " + this.jarakMaxMengintai);
    }

    public void mengScanKelemahaMusuh() {
        System.out.println("☁ Cavendish Sedang MengScan Kelemahan Musuh !");
        this.maxScanKelemahanMusuh -= 1;
        System.out.println("☁ Sisa Ksempatan mengScan : " + this.maxScanKelemahanMusuh);
    }

    public void cetakInfo() {
        System.out.println("+=====================================+");
        System.out.println("|          C A V E N D I S H          |");
        System.out.println("+=====================================+");
        super.cetakInfo();
        System.out.println("# Max Cavendish Scan Kelemahan Musuh  : " + this.maxScanKelemahanMusuh + " PerMatch");
        System.out.println("# Jarak Max Cavandish Mengintai Musuh : " + this.jarakMaxMengintai + " Meter");
        System.out.println("+======================================+");

    }
}
