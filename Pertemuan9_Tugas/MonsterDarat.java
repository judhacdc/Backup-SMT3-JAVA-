package Pertemuan9_Tugas;

/**
 *
 * @author Judha Maygustya
 */
public abstract class MonsterDarat {

    public int jumlahKaki;
    public int jumlahJari;
    public float jumlahHP;
    public String kekuatan;
    public String ketahanan;
    public float agresivitas;
    public String senjata;
    public final int tinggiBadanMonster = 160;
    public static String imortality = "Monster hanya dapat hidup kembali setelah kematian 1x";

    public MonsterDarat(int jumlahKaki, int jumlahJari, float jumlahHP, String kekuatan, String ketahanan, float agresivitas, String senjata) {
        this.jumlahKaki = jumlahKaki;
        this.jumlahJari = jumlahJari;
        this.jumlahHP = jumlahHP;
        this.kekuatan = kekuatan;
        this.ketahanan = ketahanan;
        this.agresivitas = agresivitas;
        this.senjata = senjata;
    }

    public void menambahKekuatan() {
        this.kekuatan += 1;
    }

    public void menambahKethanan() {
        this.ketahanan += 1;
    }

    public void menambahJumlahHP() {
        this.jumlahHP += 20;
    }

//    contoh memebri nilai pada variable yang sudah final 
    
//    public void testTinggiBadanMonster() {
//        this.tinggiBadanMonster += 20;
//    }

    public void cetakInfo() {
        System.out.println("# Jumlah Kaki Monster              : " + this.jumlahKaki);
        System.out.println("# Jumlah Jari Monster              : " + this.jumlahJari);
        System.out.println("# Jumlah HP Monster                : " + this.jumlahHP);
        System.out.println("# Kekuatan Monster                 : " + this.kekuatan);
        System.out.println("# Ketahanan Monster                : " + this.ketahanan);
        System.out.println("# Tingkat Agresivitasi             : " + this.agresivitas);
        System.out.println("# Senjata yang Digunakan           : " + this.senjata);
        System.out.println("# Imorrality                       : " + MonsterDarat.imortality); // contoh static
        System.out.println("# Tinggi Badan Monster             : " + tinggiBadanMonster); // contoh final

    }

    public abstract void merayakanKemenangan();
}
