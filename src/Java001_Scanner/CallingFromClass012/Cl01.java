package Java001_Scanner.CallingFromClass012;

import java.util.Scanner;

public class Cl01 {
    double distance, speed;
    public void calculatingHours(double distance, double speed){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gideceğiniz yolun uzunluğu kaç km");
        distance = scanner.nextDouble();
        System.out.println("Kullandığınız aracın süratini km/h olarak girin");
        speed = scanner.nextDouble();
        System.out.println("Gideceğiniz yere "+distance/speed+" saatte gideceksiniz");
        calculatingHours(distance, speed);
    }
}
