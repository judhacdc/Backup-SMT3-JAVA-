package Pertemuan3_Tugas;

/**
 *
 * @author Judha Maygustya
 */
public class TestKoperasi {

    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("+=======================================+");
        System.out.println("| Nama Anggota   : " + donny.getNama() + "                |");
        System.out.println("+=======================================+");
        System.out.println("| Limit Pinjaman : Rp." + donny.getLimitPinjaman() + ",-\t        |");
        System.out.println("+=======================================+\n");

        System.out.println("+=======================================+");
        System.out.println("|     ☀ T  R  A  N  S  A  K  S  I ☀    |");
        System.out.println("+===================+===================+");
        System.out.println("| Jenis Transaksi   |       Nominal     |");
        System.out.println("+-------------------+-------------------+");
        System.out.println("|   Meminjam uang   |  Rp.10.000.000,-  |");
        System.out.println("+-------------------+-------------------+");
        System.out.print("▶ HASIL : ");
        donny.pinjam(10000000);
        System.out.println("Pinjaman Saat Ini : " + donny.getJumlahPinjaman());
        System.out.println("Sisa Limit Saat ini   : " + donny.getLimitPinjaman());
        System.out.println("\n");
//----------------------------------------------------------------------------------//
        System.out.println("+=======================================+");
        System.out.println("|     ☀ T  R  A  N  S  A  K  S  I ☀    |");
        System.out.println("+===================+===================+");
        System.out.println("| Jenis Transaksi   |       Nominal     |");
        System.out.println("+-------------------+-------------------+");
        System.out.println("|   Meminjam uang   |  Rp.4.000.000,-   |");
        System.out.println("+-------------------+-------------------+");
        System.out.print("▶ HASIL : ");
        donny.pinjam(4000000);
        System.out.println("Pinjaman Saat Ini : " + donny.getJumlahPinjaman());
        System.out.println("▶ Sisa Limit Saat ini   : " + donny.getLimitPinjaman());
        System.out.println("\n");
//-------------------------------------------------------------------------------------//
        System.out.println("+=======================================+");
        System.out.println("|     ☀ T  R  A  N  S  A  K  S  I ☀    |");
        System.out.println("+===================+===================+");
        System.out.println("| Jenis Transaksi   |       Nominal     |");
        System.out.println("+-------------------+-------------------+");
        System.out.println("| Membayar Angsuran |  Rp.1.000.000,-   |");
        System.out.println("+-------------------+-------------------+");
        System.out.print("▶ HASIL : ");
        donny.angsur(1000000);
        System.out.println("Pinjaman Saat Ini: " + donny.getJumlahPinjaman());
        System.out.println("▶ Sisa Limit Saat ini   : " + donny.getLimitPinjaman());
        System.out.println("\n");
//--------------------------------------------------------------------------------------//
        System.out.println(" T E S T - B A Y A R - K U R A N G - D A R I - 10% ");
        System.out.println("+=======================================+");
        System.out.println("|     ☀ T  R  A  N  S  A  K  S  I ☀    |");
        System.out.println("+===================+===================+");
        System.out.println("| Jenis Transaksi   |       Nominal     |");
        System.out.println("+-------------------+-------------------+");
        System.out.println("| Membayar Angsuran |  Rp.10.000,-      |");
        System.out.println("+-------------------+-------------------+");
        System.out.print("▶ HASIL : ");
        donny.angsur(10000);
        System.out.println("Pinjaman Saat Ini: " + donny.getJumlahPinjaman());
        System.out.println("▶ Sisa Limit Saat ini   : " + donny.getLimitPinjaman());
        System.out.println("\n");
//--------------------------------------------------------------------------------------//
    }
}
