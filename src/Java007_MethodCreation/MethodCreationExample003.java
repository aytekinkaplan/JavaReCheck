package Java007_MethodCreation;

import java.util.Scanner;

public class MethodCreationExample003 {
    public static void main(String[] args) {
        double number1=0, number2=0, number3=0;
        System.out.println("Girilen sayıların toplamlarının ortalaması: "+avgFinding(number1, number2, number3));
    }

    private static int avgFinding(double number1, double number2, double number3) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı girin");
        number1 = scanner.nextDouble();
        System.out.println("İkinci sayıyı girin");
        number2 = scanner.nextDouble();
        System.out.println("Üçüncü sayıyı girin");
        number3 = scanner.nextDouble();
        return (int) ((number1+number2+number3)/3);
    }
}
