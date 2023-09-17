package Java003_ifStatementTernaryOperator;

import java.util.Scanner;

public class TernaryOperator004 {
    public static void main(String[] args) {
        int number=0;
         myMethod(number);
    }

    private static void myMethod(int number) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı girin");
        number = scanner.nextInt();
        String result = number<10 && number>0 ? "Giridiğiniz sayı tek basamaklı":"Girdiğiniz sayı iki basamaklıdır";
        System.out.println(result);
        myMethod(number);
    }
}
