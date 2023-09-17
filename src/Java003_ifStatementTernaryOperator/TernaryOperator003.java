package Java003_ifStatementTernaryOperator;

import java.util.Scanner;

public class TernaryOperator003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı girin");
        int number1 = scanner.nextInt();
        System.out.println("İkinci sayıyı girin");
        int number2 = scanner.nextInt();
        String result = (number1 < 0 && number2 > 0) || (number2 < 0 && number1 > 0) ?
                "Girilen iki sayının toplamı " + (number1 + number2) : "Sayıların toplamı olmaz devamkee";
        System.out.println(result);
    }
}
