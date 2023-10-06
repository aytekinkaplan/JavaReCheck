package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation028 {
    public static void main(String[] args) {
        String string ="AYTEKİN";
        String[] strings =string.trim().split("");
        System.out.println(Arrays.toString(strings));
        System.out.println(string.substring(0, 1));
        System.out.println(string.substring(0, 2));
        System.out.println(string.substring(0, 3));
        System.out.println(string.substring(0, 4));
        System.out.println(string.substring(0, 5));
        System.out.println(string.substring(0, 6));
        System.out.println(string.substring(0, 7));
    }
}
