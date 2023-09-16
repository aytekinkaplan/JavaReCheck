package Java002_Operators.CallingFromClass001;

import java.util.Scanner;

public class Class1 {
    int aNumber;
    public void aKindOfCalc(int aNumber){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üç basamaklı bir sayı girin");
        aNumber = scanner.nextInt();
        int result = aNumber%10+aNumber/100;
        System.out.println("Üç basamaklı sayının ilk ve son basamaklarının toplamı: "+result);
    }
}
