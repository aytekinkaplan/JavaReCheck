package Java001_Scanner;

import java.util.Scanner;

public class ScannerExample002 {
    /*    Bir int oluşturun.
         Konsol'a herhangi bir sayı giriniz.
         Bu sayıyı yazdırın.   */
    public static void main(String[] args) {
        int numberYouHaveEntered = 0;
        outPutOfNumberYouHaveEntered(numberYouHaveEntered);
    }

    private static void outPutOfNumberYouHaveEntered(int numberYouHaveEntered) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Sayı Girin");
        numberYouHaveEntered = scanner.nextInt();
        System.out.println("Girdiğiniz sayı: "+numberYouHaveEntered);
    }
}
