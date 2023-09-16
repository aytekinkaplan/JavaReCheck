package Java001_Scanner.CallingFromClass006;

import java.util.Scanner;

public class Class1 {
   boolean hesap;
   public void hesapVer(boolean hesap){
       Scanner scanner = new Scanner(System.in);
      System.out.println("Hesabınız var mı");
      hesap=scanner.nextBoolean();
      System.out.println(hesap);
      hesapVer(hesap);
   }
}
