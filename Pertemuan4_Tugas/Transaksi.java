package Pertemuan4_Tugas;

/**
 *
 * @author Judha Maygustya
 */
import java.time.LocalDate;
public class Transaksi {
    private LocalDate tanggal;
    private Admin admin ;
    private int nominalPembayaran;
    

  

    public LocalDate getTanggal() {
        return tanggal;
    }
    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

//    public Admin getNama() {
//        return admin;
//    }
//
//    public void setNama(Admin nama) {
//        this.admin = nama;
//    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    
    
    
    
    public int getNominalPembayaran() {
        return nominalPembayaran;
    }

    public void setNominalPembayaran(int nominalPembayaran) {
        this.nominalPembayaran = nominalPembayaran;
    }
    
    public String getInfo(){
        String info = "";
        info+="Tanggal: " +tanggal;
        info+="\nNama Admin : " +admin.getInfo();
        info+="\nBayar      : "+nominalPembayaran;
        info+="\n";
        info+="\n";
        return info;
    }
}
