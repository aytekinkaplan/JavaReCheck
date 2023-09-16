package Java001_Scanner.CallingFromClass010;

import java.util.Scanner;

public class Cl {
    String name;
    int age;
    double mass;
    double height;
    double registredTime;

    public void sportCenterPrice(String name, int age, double mass, double height, double registredTime) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Spor Salonumuza hoşgeldiniz");
        System.out.println("İsim ve Soyisminizi girin");
        name = scanner.nextLine();
        System.out.println("Yaşınızı girin");
        age = scanner.nextInt();
        System.out.println("Kilonuzu kg olarak girin");
        mass = scanner.nextDouble();
        System.out.println("Boyunuzu girin");
        height = scanner.nextDouble();
        System.out.println("Kaç ay spor salonuna geleceksiniz");
        registredTime = scanner.nextDouble();
        double price = registredTime * 20;
        System.out.println("Kayıt Girdileri \n" +
                "Ad Ve Soyadınız: " + name + "\n" +
                "Yaşınız: " + age + "\n" +
                "Kilonuz: " + mass + "\n" +
                "Boyunuz: " + height + "\n");
        System.out.println("Spor salonuna: " + registredTime + " ay geleceksiniz \n" +
                "Toplamda: " + price + " dollar ödeyeceksiniz");

    }

}
