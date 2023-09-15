package Java001_Scanner;

import java.util.Scanner;

public class ScannerExample001 {
    public static void main(String[] args) {
         /*    Bir String oluşturun.
          Konsol'a isminizi girin.
          İsminizi yazdırın.  */
        String yourName=null;
        enteringYourName(yourName);
    }

    private static void enteringYourName(String yourName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen İsminizi Girin");
        yourName = scanner.nextLine();
        System.out.println("Adınız: " + yourName);
    }
}
