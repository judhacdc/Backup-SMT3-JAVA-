package Pertemuan7_UTS_PBO;

/**
 *
 * @author Judha Maygustya
 */
public class KaryawanPabrik {

 public String nama ;
 public String alamat;
 public String jenisKelamin;
//ovrload
 public KaryawanPabrik(){
 
     System.out.println("# Obect Karyawan");
 }
 
 public KaryawanPabrik (String nama , String alamat,String jenisKelamin){ 
 this.alamat = alamat ;
 this.nama = nama ;
 this.jenisKelamin = jenisKelamin ;
 }
 
     public String getInfo() {

        String info = "";
        info += "▶ Nama                 : " + nama + "\n";
        info += "▶ Alamat               : " + alamat + "\n";
        info += "▶ Jenis Kelamin        : " + jenisKelamin + "\n";
        return info;

    }
 
}
