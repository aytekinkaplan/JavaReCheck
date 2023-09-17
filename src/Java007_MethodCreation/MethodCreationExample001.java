package Java007_MethodCreation;

import java.util.Scanner;

public class MethodCreationExample001 {
    public static void main(String[] args) {
        int number1=0, number2=0;
        summing(number1,number2);
    }

    private static void summing(int number1, int number2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı girin");
        number1 = scanner.nextInt();
        System.out.println("İkinci sayıyı girin");
        number2 = scanner.nextInt();
        int result = number1+number2;
        System.out.println("Sayıların toplamı: "+result);
        summing(number1,number2);
    }
}
