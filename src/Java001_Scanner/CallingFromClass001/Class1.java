package Java001_Scanner.CallingFromClass001;

import java.util.Scanner;

public class Class1 {

    String name = " ";
    public void nameCalling(String name){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Adınızı Girin");
        name = scanner.nextLine();
        System.out.println("Adınız: "+name);
    }

}
