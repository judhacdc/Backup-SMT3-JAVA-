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
public class Bartolomeo extends MonsterDarat implements IPergerakan, IPenyerangan {

    public int maxCopyQtySkill = 2; // di pergunakan untuk pembatasan copy skill yang di miliki lawan suapaya tidak terlalu over power
    public int maxDurasiKeluarkanAsap; // asap berguna untuk melakukan escape , dan di batasi supaya asap tidak bertahan terlalu lama di arena
    public int maxDurasiPenggunaanMataByakugan = 6; // untuk membatasi lama penggunaan byakugan supaya tidak terlalu over power

    public Bartolomeo(int maxDurasiKeluarkanAsap, int jumlahKaki, int jumlahJari, float jumlahHP, String kekuatan, String ketahanan, float agresivitas, String senjata) {
        super(jumlahKaki, jumlahJari, jumlahHP, kekuatan, ketahanan, agresivitas, senjata);
        this.maxDurasiKeluarkanAsap = maxDurasiKeluarkanAsap;
       
    }

  

    @Override
    public void merayakanKemenangan() {
        System.out.println("▶ Bartolomeo Merayakan Kemengangan Dengan Menyalakan Kembang Api");
    }

    @Override
    public void berjalanMaju() {
        System.out.println("▶ Bartolomeo Berjalan Maju dengan lincah !");
    }

    @Override
    public void berjalanMundur() {
        System.out.println("▶ Bartolomeo Berjalan Mundur dengan lincah !");
    }

    @Override
    public void melompat() {
        System.out.println("▶ Bartolomeo melompat sangat tinggi ! ");

    }

    @Override
    public void menghilang() {
        System.out.println("▶ Bartolomeo menghilang selama 1 menit . . .");
    }

    @Override
    public void menyelamKedalamTanah() {
        System.out.println("▶ Bartolomeo Menyelam ke dalam tanah sejauh 2 km ! ");
    }

    @Override
    public void mencakar() {
        System.out.println("✔ Bartolomeo Mencakar dengan kuku yang sangat tajam ! ");
    }

    @Override
    public void menggigit() {
        System.out.println("✔ Bartolomeo menggigit dengan gigi taring bawah ! ");
    }

    @Override
    public void menyemburApi() {
        System.out.println("✔ Bartolomeo menyembur api hijau yang sangat panas ! ");
    }

    @Override
    public void menembakLaserDariMata() {
        System.out.println("✔ Bartolomeo menembakkan laser azeltic dari mata ! ");
    }

    @Override
    public void menendang() {
        System.out.println("✔ Bartolomeo menendang dengan 2 kaki memakai equip sepatu imperior 2.0 ! ");
    }

    public void keluarkanAsap() {
        System.out.println("☁ Bartolomeo Mengeluarkan Asap dengan durasi maximal : " + this.maxDurasiKeluarkanAsap + " Detik");
    }

    public void mengaktifkanMataByakugan() {
        System.out.println("☁ Bartolomeo Mengaktifkan Byakugan selama 1 detik !");
        this.maxDurasiPenggunaanMataByakugan -= 1;
        System.out.println("☁ Sisa Kesempatan mengaktifkan Byakugan : " + this.maxDurasiPenggunaanMataByakugan);
    }

    public void mengCopySkillLawan() {
        System.out.println("☁ Bartolomeo MengCopy Skill lawan !");
        this.maxCopyQtySkill -= 1;
        System.out.println("☁ Sisa Kesempatan copy Skill Lawan : " + this.maxCopyQtySkill);
    }

    public void cetakInfo() {
        System.out.println("+=====================================+");
        System.out.println("|       B A R T O L O M E O           |");
        System.out.println("+=====================================+");
        super.cetakInfo();
        System.out.println("# Max Bartolomeo Copy Skill        : " + this.maxCopyQtySkill + " PerMatch");
        System.out.println("# Max Bartolomeo Mengeluarkan Asap : " + this.maxDurasiKeluarkanAsap + " PerMatch");
        System.out.println("# Max Gunakan Mata Byakugan        : " + this.maxDurasiPenggunaanMataByakugan + " Detik");
        System.out.println("+======================================+");
    }
}
