package Pertemuan3_CobaCoba;

/**
 *
 * @author Judha Maygustya
 */
public class MotorDemo {

    public static void main(String[] args) {
// motor 1
        Motor motor1 = new Motor();
        motor1.setMerek("honda");
        motor1.setStatusMesin(true);
        motor1.setKecepatan(50);
        motor1.printInfo();
// motor 2
        Motor motor2 = new Motor();
        motor1.setMerek("kawasaki");
        motor1.setStatusMesin(false);
        motor1.setKecepatan(50);

        motor1.printInfo();
    }
}
