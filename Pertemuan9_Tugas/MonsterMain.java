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
import java.util.Scanner;

public class MonsterMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condition = true;

        System.out.println(" (   ( .  (   ((    (         (( (        (  (  ((    (( (  (   (( (    (   (( \n"
                + " )\\: )\\ . )\\  ))\\   )\\ )\\ )\\ (\\())\\       )\\ )\\ ))\\   ))\\)\\ )\\ (\\())\\   )\\ (\\()\n"
                + "((_)((_) ((_)((_)))((_)(_)(_))(_)(_)     ((_)(_)(_)))((_)(_)(_))(_)(_) ((_))(_)\n"
                + "|  \\/  |/ _ \\| \\| | __|_   _| __| _ \\    | | | | \\| |_ _| \\ / / __| _ \\ __| __|\n"
                + "| |\\/| | (_) | .  |__ \\ | | | _||   /    | |_| | .  || | \\   /| _||   /__ \\ _| \n"
                + "|_|  |_|\\___/|_|\\_|___/ |_| |___|_|_\\     \\___/|_|\\_|___| \\_/ |___|_|_\\___/___|\n");

        do {
            System.out.println("+===============================================+\n"
                    + "|             M    E    N    U                  |\n"
                    + "+===============================================+");

            System.out.println("1. Show Deskripsi \n"
                    + "2. List Monster \n"
                    + "3. Test Static\n"
                    + "4. Exit from Program");
            System.out.print("▶ Pilih : ");
            int pilih = sc.nextInt();

            if (pilih == 1) {
                System.out.println("   _______________________\n"
                        + " / \\                       \\\n"
                        + "|   | - MONSTER UNIVERSE -  |\n"
                        + " \\_ | game ini adalah game  |\n"
                        + "    | online yang dapat di  |\n"
                        + "    | mainkan secara gratis |\n"
                        + "    | melalui komputer,game |\n"
                        + "    | ini merupakan game 3D |\n"
                        + "    |    Casual Fighting    |\n"
                        + "    |                       |\n"
                        + "    |       - 2021 -        |\n"
                        + "    |   Malang - Indonesia  |\n"
                        + "    |   ___________________ |__\n"
                        + "    |  /                     /\n"
                        + "    \\_/_____________________/\n");
                System.out.println("Copy Right © Judha Maygustya 2021\n");
            } else if (pilih == 2) {
                boolean cd = true;
                do {
                    System.out.println("\n+======================================+");
                    System.out.println("|      L I S T - M O N S T E R         |");
                    System.out.println("+======================================+");
                    System.out.println("1. Bartolomeo\n"
                            + "2. Cavendish\n"
                            + "3. Ideo\n"
                            + "4. Orlumbus\n"
                            + "5. Roronoa Zoro\n"
                            + "6. Exit");
                    System.out.print("▶ Pilih Monster : ");
                    int pilihMonster = sc.nextInt();

                    if (pilihMonster == 1) {
                        // Bartolomeo
                        System.out.println("   _______________________\n"
                                + " / \\                      \\\n"
                                + "|   | -    BARTOLOMEO    - |\n"
                                + " \\_ |                      |\n"
                                + "    | tinggi badan nya 160 |\n"
                                + "    | berasal dari Ethiopia|\n"
                                + "    |sangat suka mengembara|\n"
                                + "    | -------------------- |\n"
                                + "    |    ---------------   |\n"
                                + "    |   ___________________|__\n"
                                + "    |  /                     /\n"
                                + "    \\_/_____________________/\n");
                        Bartolomeo bart1 = new Bartolomeo(90, 2, 10, 1000, "200 % ", "190 %", 3000, "Kapak & Cakar");
                        bart1.cetakInfo();
                        bart1.merayakanKemenangan();
                        bart1.berjalanMaju();
                        bart1.berjalanMundur();
                        bart1.melompat();
                        bart1.menghilang();
                        bart1.menyelamKedalamTanah();
                        System.out.println("+======================================+");
                        bart1.mencakar();
                        bart1.menggigit();
                        bart1.menyemburApi();
                        bart1.menembakLaserDariMata();
                        bart1.menendang();
                        System.out.println("+======================================+");
                        bart1.keluarkanAsap();
                        bart1.mengaktifkanMataByakugan();
                        bart1.mengCopySkillLawan();

                    } else if (pilihMonster == 2) {
                        // Cavendish
                        System.out.println("   _______________________\n"
                                + " / \\                      \\\n"
                                + "|   | -     CAVENDISH    - |\n"
                                + " \\_ |                      |\n"
                                + "    | tinggi badan nya 160 |\n"
                                + "    | berasal dari Artixxs |\n"
                                + "    |sangat suka memancing |\n"
                                + "    | -------------------- |\n"
                                + "    |    ---------------   |\n"
                                + "    |   ___________________|__\n"
                                + "    |  /                     /\n"
                                + "    \\_/_____________________/\n");
                        Cavendish cav1 = new Cavendish(110, 2, 10, 100, "80%", "330%", 90, "Arit dan Gear");
                        cav1.cetakInfo();
                        cav1.merayakanKemenangan();
                        cav1.berjalanMaju();
                        cav1.berjalanMundur();
                        cav1.melompat();
                        cav1.menghilang();
                        cav1.menyelamKedalamTanah();
                        System.out.println("+======================================+");
                        cav1.mencakar();
                        cav1.menggigit();
                        cav1.menyemburApi();
                        cav1.menembakLaserDariMata();
                        cav1.menendang();
                        System.out.println("+======================================+");
                        cav1.mengintai();
                        cav1.mengScanKelemahaMusuh();
                    } else if (pilihMonster == 3) {
                        // Ideo
                        System.out.println("   _______________________\n"
                                + " / \\                      \\\n"
                                + "|   | -        IDEO      - |\n"
                                + " \\_ |                      |\n"
                                + "    | tinggi badan nya 160 |\n"
                                + "    |berasal dari jawakarta|\n"
                                + "    |sangat suka menggambar|\n"
                                + "    | -------------------- |\n"
                                + "    |    ---------------   |\n"
                                + "    |   ___________________|__\n"
                                + "    |  /                     /\n"
                                + "    \\_/_____________________/\n");
                        Ideo ideo1 = new Ideo(2, 10, 120, "80 %", "60 %", 78, "Bumerang Emas");
                        ideo1.cetakInfo();
                        ideo1.merayakanKemenangan();
                        ideo1.berjalanMaju();
                        ideo1.berjalanMundur();
                        ideo1.melompat();
                        ideo1.menghilang();
                        ideo1.menyelamKedalamTanah();
                        System.out.println("+======================================+");
                        ideo1.mencakar();
                        ideo1.menggigit();
                        ideo1.menyemburApi();
                        ideo1.menembakLaserDariMata();
                        ideo1.menendang();
                        System.out.println("+======================================+");
                        ideo1.merubahBentukTubuh();
                        ideo1.menyemburRacun();
                        ideo1.merubahSuara();

                    } else if (pilihMonster == 4) {
                        // Orlumbus
                        System.out.println("   _______________________\n"
                                + " / \\                      \\\n"
                                + "|   | -      ORLUMBUS    - |\n"
                                + " \\_ |                      |\n"
                                + "    | tinggi badan nya 160 |\n"
                                + "    |berasal dari Uni Eropa|\n"
                                + "    |  sangat suka memasak |\n"
                                + "    | -------------------- |\n"
                                + "    |    ---------------   |\n"
                                + "    |   ___________________|__\n"
                                + "    |  /                     /\n"
                                + "    \\_/_____________________/\n");
                        Orlumbus orlum1 = new Orlumbus(5, 2, 10, 89, "70 %", "50 %", 60, "Kunai");
                        orlum1.cetakInfo();
                        orlum1.merayakanKemenangan();
                        orlum1.berjalanMaju();
                        orlum1.berjalanMundur();
                        orlum1.melompat();
                        orlum1.menghilang();
                        orlum1.menyelamKedalamTanah();
                        System.out.println("+======================================+");
                        orlum1.mencakar();
                        orlum1.menggigit();
                        orlum1.menyemburApi();
                        orlum1.menembakLaserDariMata();
                        orlum1.menendang();
                        System.out.println("+======================================+");
                        orlum1.ubahKostum();
                        orlum1.ubahSenjata();
                        orlum1.ubahWarnaSkin();
                        System.out.println("+======================================+");
                        orlum1.menDuplicateBentukMusuh();
                        orlum1.mengaktifkanMataSharinggan();
                        orlum1.menyergap();
                    } else if (pilihMonster == 5) {
                        // Roronoa
                        System.out.println("   _______________________\n"
                                + " / \\                      \\\n"
                                + "|   | -      RORONOA     - |\n"
                                + " \\_ |                      |\n"
                                + "    | tinggi badan nya 160 |\n"
                                + "    |  berasal dari Soviet |\n"
                                + "    |  sangat suka membaca |\n"
                                + "    | -------------------- |\n"
                                + "    |    ---------------   |\n"
                                + "    |   ___________________|__\n"
                                + "    |  /                     /\n"
                                + "    \\_/_____________________/\n");
                        RoronoaZoro roronoa1 = new RoronoaZoro(2, 13, 160, "70 %", "80 %", 75, "Suriken 5.0");

                        roronoa1.cetakInfo();
                        roronoa1.merayakanKemenangan();
                        roronoa1.berjalanMaju();
                        roronoa1.berjalanMundur();
                        roronoa1.melompat();
                        roronoa1.menghilang();
                        roronoa1.menyelamKedalamTanah();
                        System.out.println("+======================================+");
                        roronoa1.mencakar();
                        roronoa1.menggigit();
                        roronoa1.menyemburApi();
                        roronoa1.menembakLaserDariMata();
                        roronoa1.menendang();
                        System.out.println("+======================================+");
                        roronoa1.ubahKostum();
                        roronoa1.ubahSenjata();
                        roronoa1.ubahWarnaSkin();
                        System.out.println("+======================================+");
                        roronoa1.menyerah();
                        roronoa1.taunting();
                        roronoa1.mengeluarkanBunshin();
                    } else if (pilihMonster == 6) {
                        cd = false;
                    } else {
                        System.out.println("Hanya Ada 5 Pilihan Monster !");
                    }
                } while (cd == true);

            } else if (pilih == 3) {

                System.out.println("\n"+MonsterDarat.imortality + "\n");

            } else if (pilih == 4) {

                System.out.println("========================================");
                System.out.println("   .    _  .     _____________\n"
                        + "   |\\_|/__/|    /             \\\n"
                        + "  / / \\/ \\  \\  /    Thamks!    \\\n"
                        + " /__|O||O|__ \\ \\   see you :D  /\n"
                        + "|/_ \\_/\\_/ _\\ | \\  ___________/\n"
                        + "| | (____) | ||  |/\n"
                        + "\\/\\___/\\__/  // _/\n"
                        + "(_/         ||\n"
                        + " |          ||\\\n"
                        + "  \\        //_/ \n"
                        + "   \\______//\n"
                        + "  __|| __||\n"
                        + " (____(____)");
                condition = false;
            } else {
                System.out.println("Hanya ada 4 pilihan menu !");
            }
        } while (condition == true);
    }
}
