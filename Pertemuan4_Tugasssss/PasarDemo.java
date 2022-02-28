package Pertemuan4_Tugasssss;

import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author Judha Maygustya
 */
public class PasarDemo {

    static int jumlahPembeli = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("█▀▀ █▀▀ █── █▀▀█ █▀▄▀█ █▀▀█ ▀▀█▀▀ 　 █▀▀▄ █▀▀█ ▀▀█▀▀ █▀▀█ █▀▀▄ █▀▀▀ \n"
                + "▀▀█ █▀▀ █── █▄▄█ █─▀─█ █▄▄█ ──█── 　 █──█ █▄▄█ ──█── █▄▄█ █──█ █─▀█ \n"
                + "▀▀▀ ▀▀▀ ▀▀▀ ▀──▀ ▀───▀ ▀──▀ ──▀── 　 ▀▀▀─ ▀──▀ ──▀── ▀──▀ ▀──▀ ▀▀▀▀\n");

        Pembeli[] buyer = new Pembeli[5];

        int pilih = 0;
        boolean loopingMenu = true;
        do {
            System.out.println("+============================================+");
            System.out.println("|          P A S A R - P A N D A A N         |");
            System.out.println("+============================================+");
            System.out.println("|      ≧◉ᴥ◉≦ - - - M E N U - - - ≧◉ᴥ◉≦    |");
            System.out.println("+---------------------------------------------+");
            System.out.println("| 1. Input Data Transaksi");
            System.out.println("| 2. Cek Profil Pembeli");
            System.out.println("| 3. Cek Riwayat Transaksi Pembeli");
            System.out.println("| 4. Cetak Nota");
            System.out.println("| 5. Keluar");
            System.out.println("+---------------------------------------------+");
            System.out.print("| ▶ Pilih : ");
            pilih = sc.nextInt();
            System.out.println("+---------------------------------------------+\n");
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("+============================================+");
                    System.out.println("|                INPUT DATA                  |");
                    System.out.println("+============================================+");
                    System.out.print("▶Masukkan Nama Pembeli            : ");
                    String nama = sc.nextLine();
                    String id = "ID-" + String.valueOf(jumlahPembeli);
                    buyer[jumlahPembeli] = new Pembeli(id, nama);

                    // tambah transaksi baru
                    System.out.println("\n          ===== DATA PEDAGANG ===");
                    System.out.print("▶Masukan no KTP pedagang          : ");
                    String noKtp = sc.nextLine();
                    System.out.print("▶Masukan nama pedagang            : ");
                    String namaPdg = sc.nextLine();
                    // data baru
                    Pedagang utama = new Pedagang(namaPdg, noKtp);

                    System.out.print("▶ Masukan no KTP pegawai pedagang : ");
                    String noKtp2 = sc.nextLine();
                    System.out.print("▶ Masukan nama pegawai pedagang   : ");
                    String namaPdg2 = sc.nextLine();
                    // data baru
                    Pedagang pegawai = new Pedagang(namaPdg2, noKtp2);

                    buyer[jumlahPembeli].tambahTransaksi(LocalDate.of(2021, 9, 18), utama, pegawai);
                    loading();
                    jumlahPembeli++;

                    System.out.println("");
                    break;
                case 2:
                    System.out.println("+============================================+");
                    System.out.println("|              PROFIL DARI USER              |");
                    System.out.println("+============================================+");

                    System.out.print("Masukan id pembeli: ");
                    String idd = sc.nextLine();
                    loading();
                    for (Pembeli pasien : buyer) {
                        if (pasien.getIdTrx().equalsIgnoreCase(idd)) {
                            System.out.println(pasien.getInfo());
                            break;
                        } else {
                            System.out.println("ID TIDAK DI TEMUKAN");
                        }
                        break;
                    }
                    break;

                case 3:
                    System.out.print("Masukan id pembeli: ");
                    String ids = sc.nextLine();
                    loading();
                    for (Pembeli pasien : buyer) {
                        if (pasien.getIdTrx().equalsIgnoreCase(ids)) {
                            System.out.println(pasien.cekRiwayat());
                            break;
                        } else {
                            System.out.println("Data Transaksi Tidak Ditemukan!");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Masukan id pembeli: ");
                    String idForNota = sc.nextLine();
                    loading();
                    for (Pembeli pasien : buyer) {
                        if (pasien.getIdTrx().equalsIgnoreCase(idForNota)) {
                            System.out.println(" +=========================================================+");
                            System.out.println(" |                     PASAR PANDAAAN                      |");
                            System.out.println(" |             Jl.Mawar Kec.Pandaan Kab.Pasuruan           |");
                            System.out.println(" |                Telp (089)679 - 051 - 1179               |");
                            System.out.println(" +=========================================================+");
                            System.out.println(" |★ Nama Peminjam   : " + pasien.getNama());
                            System.out.println(" |★ ID : " + pasien.getIdTrx());
                            System.out.println(" +=========================================================+\n");
                            break;
                        } else {
                            System.out.println("Data Transaksi Tidak Ditemukan"
                                    + "\nnNota Tidak Dapat dicetak !!");
                        }

                    }
                    break;
                case 5:
                    terimakasih();
                    loopingMenu = false;
                    break;

                default:
                    eror();
                    System.out.println("1. Ya"
                            + "\n2.Tidak");
                    System.out.print("Kembali menu awal?");
                    int repeat = sc.nextInt();
                    if (repeat == 1) {
                        loopingMenu = true;
                    } else if (repeat == 2) {
                        loopingMenu = false;
                    } else {
                        System.out.println("ANDA DI BLOKIR!");
                        loopingMenu = false;
                    }

            }

        } while (loopingMenu == true);

    }
//-------------------------------------------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------------------------------------------------// 

    static void terimakasih() {
        System.out.println();
        System.out.println("+--------------------------------------------------------------------------------------------------+");
        System.out.println("|                          （・⊝・）  Terimakasih sudah Berbelanja Di  （・⊝・）                      |");
        System.out.println("|                                       ★ PASAR PANDAAN 2021★                                     |");
        System.out.println("|                                ★ Jl.Mawar Kec.Pandaan Kab.Pasuruan ★                            |");
        System.out.println("|                                     ★ Telp (089)679-051-1179 ★                                  |");
        System.out.println("+--------------------------------------------------------------------------------------------------+");
        System.out.println("|  ▀▀█▀▀ ▒█▀▀▀ ▒█▀▀█ ▀█▀ ▒█▀▄▀█ ░█▀▀█ ▒█░▄▀ ░█▀▀█ ▒█▀▀▀█ ▀█▀ ▒█░▒█   |\n"
                + "|  ░▒█░░ ▒█▀▀▀ ▒█▄▄▀ ▒█░ ▒█▒█▒█ ▒█▄▄█ ▒█▀▄░ ▒█▄▄█ ░▀▀▀▄▄ ▒█░ ▒█▀▀█   |\n"
                + "|  ░▒█░░ ▒█▄▄▄ ▒█░▒█ ▄█▄ ▒█░░▒█ ▒█░▒█ ▒█░▒█ ▒█░▒█ ▒█▄▄▄█ ▄█▄ ▒█░▒█   |");
        System.out.println("+---------------------------------------------------------------------------------------------------+");
    }

    static void loading() {
        System.out.println("Sedang memproses...");
        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());;
        }
    }

    static void eror() {
        System.out.println("+-----------------------+");
        System.out.println("|      ＥＲＯＲ ！！！     |");
        System.out.println("|Mohon masukkan Yes/No  |");
        System.out.println("+-----------------------+\n");
    }
}
