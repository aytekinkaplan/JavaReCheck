package Java001_Scanner.CallingFromClass003;

import java.util.Scanner;

public class ClassA {
    public void method1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("-----------------------------");
        System.out.println("Your name is "+name);
        System.out.println("-----------------------------");
    }
}
