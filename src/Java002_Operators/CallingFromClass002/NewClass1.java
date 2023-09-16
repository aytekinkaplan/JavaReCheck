package Java002_Operators.CallingFromClass002;

import java.util.Scanner;

public class NewClass1 {
    int aNumber;
    public void myMethod(int aNumber){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üç basamaklı bir sayı girin");
        aNumber = scanner.nextInt();
        int result1 = aNumber/100;
        int result2 = (aNumber%100)/10;
        int result3 = aNumber%10;
        System.out.println("Girdiğiniz sayının yüzler basamağında "+result1);
        System.out.println("Girdiğiniz sayının onlar basamağında "+result2);
        System.out.println("Girdiğiniz sayının birler basamağında "+result3);
        System.out.println("Vardır");
        myMethod(aNumber);
    }
}
