package Java002_Operators;

import java.util.Scanner;

public class ArithMeticExample001 {
    public static void main(String[] args) {
        int aNumber = 0;
        arithmetic(aNumber);
    }

    private static void arithmetic(int aNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üç basamaklı bir sayı girin");
        aNumber = scanner.nextInt();
       int result =aNumber%10+aNumber/100;
        System.out.println("Üç basamaklı sayının ilk ve son basamaklarının toplamı: "+result);
    }
}
