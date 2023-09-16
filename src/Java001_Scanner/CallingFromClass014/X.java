package Java001_Scanner.CallingFromClass014;

import java.util.Scanner;

public class X {
    double a, b ,c;
    public void aKindOfCalculation(double a, double b, double c){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı girin");
        a = scanner.nextDouble();
        System.out.println("İkinci sayıyı girin");
        b = scanner.nextDouble();
        System.out.println("Üçüncü sayıyı girin");
        c = scanner.nextDouble();
        double result = (a*a-b*b)/(3*c);
        System.out.println("Verilen sayıların işlem sonucu: "+result);
    }
}
