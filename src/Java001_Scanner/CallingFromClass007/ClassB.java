package Java001_Scanner.CallingFromClass007;

public class ClassB {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.scoreCalculating(classA.midTermGrade, classA.finalGrade, classA.projectGrade);
    }
}
