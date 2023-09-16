package Java002_Operators;

public class ArithMeticExample002 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("A"+ ++a);
        System.out.println("B"+ a);
        System.out.println("C"+ a++);
        System.out.println("D"+ a++);

        System.out.println(a);


        int b =0;
        System.out.println(++b + b++);
    }
}
