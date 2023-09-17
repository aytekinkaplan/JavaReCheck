package Java004_SwitchStatement;

import java.util.Scanner;

public class SwitchStatementExample_005 {
    public static void main(String[] args) {
        String day =" ";
        detectTheDay(day);
    }

    private static void detectTheDay(String day) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gün ismini girin");
        day = scanner.nextLine().toLowerCase();
        switch (day){
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Haftaiçine ait bir gündür");
                detectTheDay(day);
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Haftasonuna ait bir gündür");
                detectTheDay(day);
                break;
            default:
                System.out.println("Adam gibi isim gir");
                detectTheDay(day);
        }
    }
}
