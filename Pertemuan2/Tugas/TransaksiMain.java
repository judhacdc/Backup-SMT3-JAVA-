package Pertemuan2.Tugas;

/**
 *
 * @author Judha Maygustya
 */
import java.util.Scanner;

public class TransaksiMain {

    public static int pilih, lama, id;
    public static String nama;

    public static void main(String[] args) {
        boolean loop;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("+--------------------------------------------------+");
            System.out.println("|               DETAIL HARGA GAME                  |");
            System.out.println("+---------------+-----------------+----------------+");
            System.out.println("|   NAMA GAME   |    HARGA SEWA   |     DURASI     |");
            System.out.println("+---------------+-----------------+----------------+");
            System.out.println("|1. GOR OF WAR  |   Rp.9000,-     |     1 jam      |");
            System.out.println("|2. PUBG        |   Rp.8000,-     |     1 jam      |");
            System.out.println("|3. Lost Saga   |   Rp.7000,-     |     1 jam      |");
            System.out.println("|4. Point Blank |   Rp.6000,-     |     1 jam      |");
            System.out.println("|5. DN Asasin   |   Rp.5000,-     |     1 jam      |");
            System.out.println("|6. Mobel Lejen |   Rp.4000,-     |     1 jam      |");
            System.out.println("|7. Animal Kids |   Rp.3000,-     |     1 jam      |");
            System.out.println("|8. 8 Ball poll |   Rp.2000,-     |     1 jam      |");
            System.out.println("|9. Domnino hig |   Rp.1000,-     |     1 jam      |");
            System.out.println("+---------------+-----------------+----------------+\n");

            System.out.println("+==============================================+");
            System.out.println("|              FORMULIR PERSEWAAN              |");
            System.out.println("+==============================================+");
            System.out.print("| ✔ Masukkan pilihan anda : ");
            pilih = sc.nextInt();
            System.out.print("| ✔ Masukkan lama pinjam  : ");
            lama = sc.nextInt();
            System.out.print("| ✔ Masukkan nama anda    : ");
            nama = sc.nextLine();
            nama = sc.nextLine();
            System.out.print("| ✔ Masukkan ID           : ");
            id = sc.nextInt();
            System.out.println("==============================================");

            Game gameJud = new Game();

            if (pilih == 1) {
                gameJud.namaGame = "God Of War";
                gameJud.hargaSewa = 9000;
            } else if (pilih == 2) {
                gameJud.namaGame = "Call Of Dutty";
                gameJud.hargaSewa = 8000;
            } else if (pilih == 3) {
                gameJud.namaGame = "Lost Saga";
                gameJud.hargaSewa = 7000;
            } else if (pilih == 4) {
                gameJud.namaGame = "Point Blank";
                gameJud.hargaSewa = 6000;
            } else if (pilih == 5) {
                gameJud.namaGame = "DN Asasin";
                gameJud.hargaSewa = 5000;
            } else if (pilih == 6) {
                gameJud.namaGame = "Mobel Lejen";
                gameJud.hargaSewa = 4000;
            } else if (pilih == 7) {
                gameJud.namaGame = "Animal Kids";
                gameJud.hargaSewa = 3000;
            } else if (pilih == 8) {
                gameJud.namaGame = "8 Ball poll";
                gameJud.hargaSewa = 2000;
            } else if (pilih == 9) {
                gameJud.namaGame = "Domnino hig";
                gameJud.hargaSewa = 1000;
            } else {
                System.out.println("PILIHAN ANDA TIDAK TERSEDIA");
            }

            Transaksi t1 = new Transaksi();
            t1.namaMember = nama;
            t1.idTransaksi = id;
            t1.lamaSewa = lama;
            t1.gameSk = gameJud;
            t1.cetakDetailTrx();

            System.out.println("1. ya");
            System.out.println("2 tidak");
            System.out.println("Apakah ingin mengulang?");
            int ppp = sc.nextInt();
            loading();
            if (ppp == 1) {
                loop = true;
            } else {
                break;
            }

        } while (true);
    }

    static void loading() {
        System.out.println("Sedang memproses...");
        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());;
        }
    }

}
