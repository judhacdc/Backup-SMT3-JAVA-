/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1_sepedahdemo;

/**
 *
 * @author Judha Maygustya
 */
public class SepedaDemo {

    public static void main(String[] args) {
        Sepeda spd1 = new Sepeda();
        spd1.merek = "Polygon";
        spd1.kecepatan = 10;
        spd1.gear = 1;

        spd1.tambahKecepatan(10);
        spd1.gantiGear(1);
        spd1.cetakStatus();

        // ---------------------------- //
        Sepeda spd2 = new Sepeda();
        spd2.merek = "Wim cycle";
        spd2.kecepatan = 10;
        spd2.gear = 1;

        spd2.tambahKecepatan(20);
        spd2.rem(5);
        spd2.gantiGear(2);
        spd2.cetakStatus();
    }
}
