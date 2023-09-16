package Java001_Scanner.CallingFromClass015;

import java.util.Scanner;

public class A {
    double temp;
    public void convertingTemToFah(double temp){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Celcius Cinsinden Sıcaklığı Girin");
        temp = scanner.nextDouble();
        System.out.println("Bugünün sıcaklığı "+(((9*temp)/5)+32)+" Fahrenayt");
    }
}
