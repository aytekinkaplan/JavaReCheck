package Java001_Scanner.CallingFromClass002;

import java.util.Scanner;

public class Class1 {
    private String name;



    public Class1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        this.name = scanner.nextLine();
        System.out.println("Your name is "+name);
    }

    @Override
    public String toString() {
        return "name='" + name+ "'";
    }
}
