package Java007_MethodCreation;

import java.util.Scanner;

public class MethodCreationExample004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summing = 0;
        for (int i=1; i<=3; i++){
            System.out.println(i +". sayıyı girin");
            summing+= scanner.nextInt();
        }
        System.out.println("Girdiğiniz sayıların toplamı: "+summing);
    }
}
