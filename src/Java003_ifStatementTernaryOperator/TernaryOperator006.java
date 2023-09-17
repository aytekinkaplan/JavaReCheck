package Java003_ifStatementTernaryOperator;

import java.util.Scanner;

public class TernaryOperator006 {
    public static void main(String[] args) {
         /*
       TASK :
       Girilen sayi 0 dan buyuk esit ise 10 dan kucukluğunu kontrol ediniz.
       10 dan kucuk ise  "Rakam" degilse "Pozitif Sayi" ,
       Sayi 0'dan kucuk ise  "Negatif Sayi" print eden code create ediniz
        */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı girin");
        int number = scanner.nextInt();
        String result = number>=0?(number<10?"10 dan küçük, pozitif veya sıfıra eşit sayıdır":"10 dan büyük bir sayıdır"):"Negatif sayıdır";
        System.out.println(result);
    }
}
