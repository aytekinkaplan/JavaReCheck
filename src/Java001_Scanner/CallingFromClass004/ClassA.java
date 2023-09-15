package Java001_Scanner.CallingFromClass004;

import java.util.Scanner;

public class ClassA {
    int A=0,B=0;

    public void enteredTWOIntegers(int A, int B){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen birinci sayıyı girin");
        A= scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı girin");
        B= scanner.nextInt();
        toplama(A,B);
    }
    private void toplama(int A,int B){
        int result = A+B;
        System.out.println("------------------------------------");
        System.out.println("Toplam sonucu: "+result);
        System.out.println("------------------------------------");
        cikarmaSonucu(A,B);
    }

    private void cikarmaSonucu(int a, int b) {
        int result = a-b;
        System.out.println("------------------------------------");
        System.out.println("Çıkarma sonucu: "+result);
        System.out.println("------------------------------------");
        carpmaSonucu(a,b);
    }

    private void carpmaSonucu(int a, int b) {
        int result = a * b;
        System.out.println("------------------------------------");
        System.out.println("Çarpma sonucu: "+result);
        System.out.println("------------------------------------");
        bolmeSonucu(a,b);
    }

    private void bolmeSonucu(int a, int b) {
        int result = a/b;
        System.out.println("------------------------------------");
        System.out.println("Bölme sonuc: "+result);
        System.out.println("------------------------------------");
    }
}
