package Java001_Scanner.CallingFromClass005;

public class ClassA {
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        classB.method(classB.A, classB.B);
    }
}
