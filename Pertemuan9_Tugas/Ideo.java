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
public class Ideo extends MonsterDarat implements IPergerakan, IPenyerangan {

    public int limitMerubahSuara = 5; // memberi limit untuk penggunaan perubahan suara
    public int limitSemburRacun = 4; // memberi limit untuk menyembur racun
    public int limitBerubahBentuk = 3; // memberikan limit untuk berubah bentuk (cair,padat,gas) 
// cooldown to limit

    public Ideo(int jumlahKaki, int jumlahJari, float jumlahHP, String kekuatan, String ketahanan, float agresivitas, String senjata) {
        super(jumlahKaki, jumlahJari, jumlahHP, kekuatan, ketahanan, agresivitas, senjata);
    }

  

    @Override
    public void merayakanKemenangan() {
        System.out.println("▶ Ideo Merayakan Kemengangan Dengan Berpesta");
    }

    @Override
    public void berjalanMaju() {
        System.out.println("▶ Roronoa Berjalan Maju dengan mengendap - endap !");
    }

    @Override
    public void berjalanMundur() {
        System.out.println("▶ Roronoa Berjalan Mundur dengan mengendap - endap !");
    }

    @Override
    public void melompat() {
        System.out.println("▶ Ideo melompat agak tinggi !");
    }

    @Override
    public void menghilang() {
        System.out.println("▶ Ideo menghilang selama 3 menit . . .");
    }

    @Override
    public void menyelamKedalamTanah() {
        System.out.println("▶ Ideo Menyelam ke dalam tanah sejauh 3 km ! ");
    }

    @Override
    public void mencakar() {
        System.out.println("✔ Ideo Mencakar dengan cakar baja yang sangat tajam ! ");
    }

    @Override
    public void menggigit() {
        System.out.println("✔ Ideo menggigit dengan gigi susu ! ");
    }

    @Override
    public void menyemburApi() {
        System.out.println("✔ Ideo menyembur api hitam yang sangat panas ! ");
    }

    @Override
    public void menembakLaserDariMata() {
        System.out.println("✔ Ideo menembakkan laser kamigiri dari mata ! ");
    }

    @Override
    public void menendang() {
        System.out.println("✔ Ideo menendang dengan 4 kaki memakai equip sepatu deresrosa 2.0 ! ");
    }

    public void cetakInfo() {
        System.out.println("+=====================================+");
        System.out.println("|                I D E O              |");
        System.out.println("+=====================================+");
        super.cetakInfo();
        System.out.println("# Limit Ideo Merubah Suara   : " + this.limitMerubahSuara + " PerMatch");
        System.out.println("# Limit Ideo Merubah Bentuk  : " + this.limitBerubahBentuk + " PerMatch");
        System.out.println("# Limit Ideo Menyembur Racun : " + this.limitSemburRacun + " PerMatch");
    }

    public void merubahBentukTubuh() { // hanya bisa berubah 1x

        System.out.println("☁ Ideo Merubah Bentuk Tubuh ! ");
        this.limitBerubahBentuk -= 1;
        System.out.println("☁ Sisa Kesempatan Merubah Bentuk Tubuh : " + this.limitBerubahBentuk);
    }

    public void menyemburRacun() {
        System.out.println("☁ Ideo Menyembur Racun ! ");
        this.limitSemburRacun -= 1;
        System.out.println("☁ Sisa Kesemoatan Menyembur Racun : " + this.limitSemburRacun);
    }

    public void merubahSuara() {
        System.out.println("☁ Ideo Merubah Suara ! ");
        this.limitMerubahSuara -= 1;
        System.out.println("☁ Sisa Ksempatan Ideo Merubah Suara : " + this.limitMerubahSuara);
    }
}
