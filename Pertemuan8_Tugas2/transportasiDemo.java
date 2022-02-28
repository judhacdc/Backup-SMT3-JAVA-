/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan8_Tugas2;


public class transportasiDemo {

    public static void main(String[] args) {

        System.out.println("+=========================+");
        System.out.println("|          T A N K        |");
        System.out.println("+=========================+");
        Tank tank1 = new Tank("Transportasi Darat", "Fuso", 4, "hijau army", "Super Force", 2, 60, 100, 2000, 9000);
        tank1.aktifkanModeAmfibi();
        tank1.bukaPintuAtas();
        tank1.cetakInfo();
        tank1.putarLarasSenjata();
        tank1.isiBahanBakar();
        tank1.nyalakanMesin();
        tank1.tambahKecepatan();
        tank1.kurangiKecepatan();
        
        System.out.println("+===========================+");
        System.out.println("|        KAPAL SELAM        |");
        System.out.println("+===========================+");
        KapalSelamTNI kapal1 = new KapalSelamTNI ("Transportasi Air", "Fujitora", 0, "Hitam", "Super Jet Sky",8,900, "Tpe AZ8139", 9999, "Rudal A823");
        kapal1.tambahKecepatan();
        kapal1.kurangiKecepatan();
        kapal1.menyelamKedasarLaut();
        kapal1.tembakMusuh();
        kapal1.isiBahanBakar();
        kapal1.nyalakanMesin();

        System.out.println("+============================+");
        System.out.println("|         MOBIL TRUCK        |");
        System.out.println("+============================+");
        MobilTruck mobil1 = new MobilTruck("Transportasi Darat", "Mitsubisi", 8, "Biru Navy", "Jet Buster", 888, 2, 500, "900 Kg");
        mobil1.tambahKecepatan();
        mobil1.kurangiKecepatan();
        mobil1.jungkirBak();
        mobil1.jalanMundur();
        mobil1.isiBahanBakar();
        mobil1.nyalakanMesin();
        
        System.out.println("+=========================+");
        System.out.println("|           PESAWAT       |");
        System.out.println("+=========================+");
        Pesawat pesawat1 = new Pesawat ("Transportasi Udara","Sukoi", 6, "Hijau", "Sukoi Engine 9009", 108, 799, 6);
        pesawat1.tambahKecepatan();
        pesawat1.kurangiKecepatan();
        pesawat1.takeOff();
        pesawat1.landing();
        pesawat1.cekNavigasi();
        pesawat1.isiBahanBakar();
        pesawat1.nyalakanMesin();
        
        System.out.println("+============================+");
        System.out.println("|          MOTOR SUPRA       |");
        System.out.println("+============================+");
        MotorSupra motor1 = new MotorSupra ("Transportasi Darat", "Honda", 2, "Hitam dan Hijau", "Honda Engine 189", 2, 120, 2, 2001, 56453, 4576);
        motor1.tambahKecepatan();
        motor1.kurangiKecepatan();
        motor1.bukaJok();
        motor1.tambahGigi();
        motor1.isiBahanBakar();
        motor1.nyalakanMesin();
    }
}
