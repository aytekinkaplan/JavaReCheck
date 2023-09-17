package Java003_ifStatementTernaryOperator;

import java.util.Scanner;

public class TernaryOperator005 {
    public static void main(String[] args) {
        int number=0;
         myMethod(number);
    }

    private static void myMethod(int number) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı girin");
        number = scanner.nextInt();
        String result = number%2==0 && number>0 ? "Giridiğiniz sayının yarısı: "+number/2:"Girdiğiniz sayı tek sayıdır";
        System.out.println(result);
        myMethod(number);
    }
}
