package Java001_Scanner.CallingFromClass016;

import java.util.Scanner;

public class Cls01 {
    char input;
    public void chars(char input){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ascii degerini gormek icin bir karakter yaziniz");
        input = scanner.next().charAt(0);
        int asciiValue = input;
        System.out.println("Girdiginiz  `" + input + "` karekterinin ascii degeri: " + asciiValue);
    }
}
