package Pertemuan4_Tugas;

/**
 *
 * @author Judha Maygustya
 */
import java.time.LocalDate;

public class CodaShopDemo {

    public static void main(String args[]) {
        // List Pegawai
        Admin pgw1 = new Admin("Gilang", "ID-001");
        Admin pgw2 = new Admin("Arun", "ID-002");
        Admin pgw3 = new Admin("Mahisa", "ID-003");
        Admin pgw4 = new Admin("Riski", "ID-004");
        Admin pgw5 = new Admin("Salwa", "ID-005");
        Admin pgw6 = new Admin("Nazela", "ID-006");
        Admin pgw7 = new Admin("Figo", "ID-007");
        Admin pgw8 = new Admin("Robin", "ID-008");
        Admin pgw9 = new Admin("Handoko", "ID-009");
        Admin pgw10 = new Admin("Sipog", "ID-010"); 

        // Tambah transaksi
        //pembeli 1
        Pembeli pembeli1 = new Pembeli("KP001", "Judha Maygustya", " ID23189073428");
        pembeli1.tambahTransaksi(LocalDate.of(2021, 9, 24), pgw1, 50000);
        pembeli1.tambahTransaksi(LocalDate.of(2021, 9, 30), pgw2, 100000);
        System.out.println(pembeli1.getInfo());
        // Tambah transaksi
        //pembeli 2
        Pembeli pembeli2 = new Pembeli("KP002", "Aurel Marfatul", " ID829323918239");
        pembeli2.tambahTransaksi(LocalDate.of(2021, 9, 24), pgw3, 8000);
        pembeli2.tambahTransaksi(LocalDate.of(2021, 9, 30), pgw4, 11000);
        System.out.println(pembeli2.getInfo());
        // Tambah transaksi
        //pembeli 3
        Pembeli pembeli3 = new Pembeli("KP003", "Alditya Meika", " ID1328791238792");
        pembeli3.tambahTransaksi(LocalDate.of(2021, 9, 24), pgw5, 51000);
        pembeli3.tambahTransaksi(LocalDate.of(2021, 9, 30), pgw6, 900000);
        System.out.println(pembeli3.getInfo());
        // Tambah transaksi
        //pembeli 4
        Pembeli pembeli4 = new Pembeli("KP004", "Nur Anisa", " ID23909238932238");
        pembeli4.tambahTransaksi(LocalDate.of(2021, 9, 24), pgw7, 590000);
        pembeli4.tambahTransaksi(LocalDate.of(2021, 9, 30), pgw8, 290000);
        System.out.println(pembeli4.getInfo());

        
    }
}
