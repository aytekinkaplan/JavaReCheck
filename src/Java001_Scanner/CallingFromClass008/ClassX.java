package Java001_Scanner.CallingFromClass008;

import java.util.Scanner;

public class ClassX {
    /*
     * TASK ->
     *
     * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
     * ve vucut kutle endeksini bulun.
     * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
     *
     * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
     *
     * Ornek : Input : boy :180 kilo : 80
     *         Output : Vucut kutle endeksiniz : 24
     *                  Vucut kutle endeksiniz : 24.691…
     *
     *
     */

    double height = 0;
    double mass = 0;

    public void calculatingVKE(double mass,double height){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu kilogram olarak girin");
        mass = scanner.nextDouble();
        System.out.println("Boyunuzu cm olarak girin");
        height= scanner.nextDouble();
        height = height/100;
        double vke =mass/(height*height);
        System.out.println("Vücut kitle indeksi(VKI)= "+vke);
    }


}
