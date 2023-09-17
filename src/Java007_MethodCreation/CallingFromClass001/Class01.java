package Java007_MethodCreation.CallingFromClass001;

import java.util.Scanner;

public class Class01 {
    public void myMethod1() {
        int summing1 = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + ".sayıyı girin");
            summing1 += scanner.nextInt();

        }
        System.out.println("Girdiğiniz sayıların toplamı: " + summing1);

    }

    public void myMethod2() {
        int summing2 = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ".sayıyı girin");
            summing2 += scanner.nextInt();

        }
        System.out.println("Girdiğiniz sayıların toplamı: " + summing2);

    }
}
