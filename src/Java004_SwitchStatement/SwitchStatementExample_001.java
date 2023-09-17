package Java004_SwitchStatement;

import java.util.Scanner;

public class SwitchStatementExample_001 {
    public static void main(String[] args) {
        int number = 0;
        myMethod1(number);
    }

    private static void myMethod1(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı girin");
        number = scanner.nextInt();
        switch (number){
            case 0:
                System.out.println("Sıfır");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Başka seçenek kalmadı");
        }
        myMethod1(number);
    }


}