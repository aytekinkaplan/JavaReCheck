package Java005_StringManipulation;

public class StringManipulationExamples001 {
    public static void main(String[] args) {
        System.out.println("Java String Sınıfı Metotları!");
        String string = "Hello";
        System.out.println(string.length());
        System.out.println(string.charAt(string.length() - 5));
        System.out.println(string.charAt(string.length() - 4));
        System.out.println(string.charAt(string.length() - 3));
        System.out.println(string.charAt(string.length() - 2));
        System.out.println(string.charAt(string.length() - 1));

        System.out.println("--------------------------------------------------");

        System.out.println(string.codePointAt(0));
        System.out.println(string.codePointAt(1));
        System.out.println(string.codePointAt(2));
        System.out.println(string.codePointAt(3));
        System.out.println(string.codePointAt(4));

        System.out.println("--------------------------------------------------");
        System.out.println(string.codePointBefore(1));
        System.out.println(string.codePointBefore(2));
        System.out.println(string.codePointBefore(3));
        System.out.println(string.codePointBefore(4));

        System.out.println("--------------------------------------------------");
        System.out.println(string.codePointCount(0, 5));
        System.out.println(string.codePointCount(0, 4));
        System.out.println(string.codePointCount(0, 3));
        System.out.println(string.codePointCount(0, 2));
    }
}
