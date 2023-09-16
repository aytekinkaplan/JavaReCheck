package Java002_Operators.CallingFromClass002;

public class NewClass2 {
    public static void main(String[] args) {
        NewClass1 newClass1 = new NewClass1();
        newClass1.myMethod(newClass1.aNumber);
    }
}
