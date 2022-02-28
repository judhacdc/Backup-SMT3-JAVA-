package Pertemuan3_CobaCoba;

/**
 *
 * @author Judha Maygustya
 */
public class User {

    public String username;
    public String nama;
    public String email;
    public String alamat;
    public String pekerjaan;

    public User(String username, String nama, String email, String alamat, String pekerjaan) {

        this.username = username;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.pekerjaan = pekerjaan;

    }
    
    

    public void cetakInfo() {

        System.out.println("Username    :" + username);
        System.out.println("nama        : " + nama);
        System.out.println("alamat      : " + alamat);
        System.out.println("pekerjaan   : " + pekerjaan);

    }
}
