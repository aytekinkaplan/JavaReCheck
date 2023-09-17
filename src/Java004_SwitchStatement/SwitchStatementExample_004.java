package Java004_SwitchStatement;

import java.util.Scanner;

public class SwitchStatementExample_004 {
    public static void main(String[] args) {
        int number = 0;
        int bakiye = 1000;
        atmMethod(number,bakiye);

    }

    private static void atmMethod(int number, int bakiye) {

        System.out.println("**********************************************");
        System.out.println("          $$$JavaBANK ATM YE HOŞ GELDİNİZ$$$         ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************************************");
        System.out.println("********ATM DE YAPMAK İSTEDİĞİNİZ İŞLEM NUMARASINI GİRİN********");
        System.out.println("BAKİYE ÖĞRENME İŞLEMİ İÇİN 1");
        System.out.println("PARA YATIRMA İŞLEMİ İÇİN 2");
        System.out.println("PARA ÇEKME İŞLEMİ İÇİN 3");
        System.out.println("ÇIKIŞ İŞLEMİ İÇİN 4");
        System.out.println("********ATM DE YAPMAK İSTEDİĞİNİZ İŞLEM NUMARASINI GİRİN********");
        number = scanner.nextInt();
        switch (number) {

            case 1:
                System.out.println("BAKİYENİZDE: " + bakiye + " TL BULUNMAKTA");
                atmMethod(number,bakiye);
                break;
            case 2:
                System.out.println("YATIRACAĞINIZ MİKTARI GİRİN");
                int input = scanner.nextInt();
                bakiye += input;
                System.out.println("BAKİYENİZDE: " + bakiye + " TL BULUNMAKTA");
                atmMethod(number,bakiye);
                break;
            case 3:
                System.out.println("ÇEKMEYİ DÜŞÜNDÜĞÜNÜZ MİKTARI GİRİN");
                int withDrawnAmount = scanner.nextInt();
               if (bakiye>=withDrawnAmount){
                   bakiye-=withDrawnAmount;
                   System.out.println(bakiye+" TL BAKİYENİZ KALMIŞTIR");
               }else {
                   System.out.println("BU PARA MİKTARINI ÇEKEMEZSİNİZ");
               }
                atmMethod(number,bakiye);
                break;
            case 4:
                System.out.println("ÇIKIŞ İŞLEMİ BAŞARILI");
                break;
            default:
                System.out.println("LÜTFEN VERİLEN 1-2-3-4 SEÇENEKLERİNİ KULLANIN");
                atmMethod(number,bakiye);


        }

    }
}
