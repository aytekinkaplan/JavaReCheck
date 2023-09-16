package Java001_Scanner.CallingFromClass011;

import java.util.Scanner;

public class ClassYY {
    double edge1, edge2;
    public void calculatingHyp(double edge1, double edge2){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgenin birinci kenarını girin");
        edge1 = scanner.nextDouble();
        System.out.println("Üçgenin ikinci kenarını girin");
        edge2 = scanner.nextDouble();
        System.out.println("Aradığınız üçgenin hipotenüsü: "+Math.sqrt(edge1*edge1+edge2*edge2)+" olarak bulunmakta");
    }
}
