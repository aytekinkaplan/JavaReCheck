package Java004_SwitchStatement;

import java.util.Scanner;

public class SwitchStatementExample_003 {
    public static void main(String[] args) {
        int number = 0;
        seasonMethod(number);
    }

    private static void seasonMethod(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("AYIN HANGİ MEVSİME AİT OLDUĞUNU ÖĞRENMEK İÇİN \n" +
                "1-12 YE KADAR NUMARA GİRİN");
        number = scanner.nextInt();
        switch (number){
            case 12:
            case 1:
            case 2:
                System.out.println("KIŞ MEVSİMİ NE AİT");
                System.out.println("--------------------------------------------");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İLKBAHAR MEVSİMİNE AİT");
                System.out.println("--------------------------------------------");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("YAZ MEVSİMİNE AİT");
                System.out.println("--------------------------------------------");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("SONBAHAR MEVSİMİNE AİT");
                System.out.println("--------------------------------------------");
            default:
                System.out.println("Adam gibi numara gir");
                System.out.println("--------------------------------------------");

        }
        seasonMethod(number);
    }
}
