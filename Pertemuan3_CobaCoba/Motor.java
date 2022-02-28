package Pertemuan3_CobaCoba;

/**
 *
 * @author Judha Maygustya
 */
public class Motor {

    private String merek;
    private boolean statusMesin; //on off
    private int kecepatan;
    
// setter > modif nilai // write only
    public String getMerek() {
        return merek;
    }
// mengakses / mengenmabilakan nilai // read only
    public void setMerek(String merek) {
        this.merek = merek;
    }

    public boolean isStatusMesin() {
        return statusMesin;
    }

    public void setStatusMesin(boolean statusMesin) {
        this.statusMesin = statusMesin;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {

        if (!statusMesin && kecepatan > 0) {
            System.out.println("Kecepatan tidak bisa lebih dari 0 jika mesin off");
        } else {
            kecepatan = kecepatan;
        }

        this.kecepatan = kecepatan;
    }
// ==========================================================//

    public void printInfo() {
        System.out.println("Merk  :" + merek);

        if (statusMesin) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan  : " + kecepatan);
        System.out.println("===========================");

    }
}
