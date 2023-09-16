package Java001_Scanner.CallingFromClass005;

import java.util.Scanner;

public class ClassB {
    int A=0, B=0;
    public void method(int A, int B){
        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk Sayıyı girin");
        A=scanner.nextInt();
        System.out.println("İkinci Sayıyı girin");
        B=scanner.nextInt();
        summing(A,B);
    }

    private void summing(int a, int b) {
        int result = a + b;
        System.out.println("Sayıların toplam sonucu: "+result);
        subtracting(a,b);

    }

    private void subtracting(int a, int b) {
        int result = a - b;
        System.out.println("Sayıların çıkarma sonucu: "+result);
        multiplicating(a,b);
    }

    private void multiplicating(int a, int b) {
        int result = a * b;
        System.out.println("Sayıların çarpımı sonucu: "+result);
        dividing(a,b);
    }

    private void dividing(int a, int b) {
        int result = a / b;
        System.out.println("Sayıların bölümü sonucu: "+result);
        System.out.println("İşlemler başa alındı");
        method(a,b);
    }
}
