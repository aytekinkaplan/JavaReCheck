package Java003_ifStatementTernaryOperator;

import java.util.Scanner;

public class TernaryOperator001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayı girin");
        int sayi1 = scanner.nextInt();
        if (sayi1 > 0) {
            System.out.println("agam sayi POZİTİF :) ");
        } else System.out.println("agam sayi pozitif DEĞİL :( ");


        System.out.println("Sayı girin");
        int sayi2 = scanner.nextInt();


        String result = sayi2 > 0 ? "Sayı pozitif" : "Sayı pozitif değildir";
        System.out.println(result);

        System.out.println("Tekrar sayı girin");
        String result2 = scanner.nextInt() > 0 ? "Girilen sayı pozitif" : "Girilen sayı pozitif değil";
        System.out.println(result2);
    }
}
