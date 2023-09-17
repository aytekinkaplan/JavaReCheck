package Java003_ifStatementTernaryOperator;

import java.util.Scanner;

public class TernaryOperator002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Sayıyı girin");
        int number1 = scanner.nextInt();
        System.out.println("İkinci Sayıyı girin");
        int number2 = scanner.nextInt();
        String result = number1>number2?(number1+" sayısı daha büyük"):(number2+" sayısısı daha büyük");
        System.out.println(result);
    }
}
