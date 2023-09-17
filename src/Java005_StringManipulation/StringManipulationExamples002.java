package Java005_StringManipulation;

public class StringManipulationExamples002 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = "hello";
        System.out.println(string1.compareTo(string2));
        System.out.println(string3.compareTo(string2));

        System.out.println("--------------------------------------");
        String string4 = "Hello";
        String string5 = "World";
        System.out.println(string4.concat(" ").concat(string5));
        System.out.println(string4.contains(string1));
        System.out.println(string3.contains(string2));
        System.out.println(string5.contains("AAAA"));

        System.out.println("--------------------------------------");

    }
}
