package Java007_MethodCreation;

import java.util.Scanner;

public class MethodCreationExample005 {
    public static void main(String[] args) {
        int summing = 0;
        summingMethod(summing);
    }

    private static void summingMethod(int summing) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <=3 ; i++) {
            System.out.println(i+". sayıyı girin");
            summing+= scanner.nextInt();
        }
        System.out.println("Girilen Üç sayının toplamı: "+summing);
    }
}
