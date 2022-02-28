package Pertemuan4_Tugas;

/**
 *
 * @author Judha Maygustya
 */
public class Admin {
    private String nama;
    private String IDAdmin;

    public Admin(String namaAdmin,String IDAdmin){
        this.nama = namaAdmin;
        this.IDAdmin = IDAdmin;
    
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIDAdmin() {
        return IDAdmin;
    }

    public void setIDAdmin(String IDAdmin) {
        this.IDAdmin = IDAdmin;
    }
    
    public String getInfo(){
        return nama + "\nID Admin  : " + IDAdmin;
    }
}
