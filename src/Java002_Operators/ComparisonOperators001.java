package Java002_Operators;

import java.util.Scanner;

public class ComparisonOperators001 {
    public static void main(String[] args) {
        System.out.println(13==10);
        System.out.println(!(23 == 10));
        System.out.println(32 > 23);
        System.out.println(!(32 > 23));
        System.out.println(34 >= 34);
        Scanner scanner = new Scanner(System.in);
        System.out.println("İki sayı girin");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1==number2){
            System.out.println("İki sayı eşittir");
        }else {
            System.out.println("İki sayı eşit değildir");
        }
        System.out.println("İki sayı daha girin");
        int number01= scanner.nextInt();
        int number02= scanner.nextInt();

        System.out.println(number01==number2);


        String string1 = "Apple";
        String string2 = "Apple";
        System.out.println(string1==string2);
    }
}
