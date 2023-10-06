package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation029 {
    public static void main(String[] args) {
        String string ="AYTEKİN";
        String[] strings =string.trim().split("");
        System.out.println(Arrays.toString(strings));
        System.out.println(string.substring(0, 1));
        System.out.println(string.substring(1, 2));
        System.out.println(string.substring(2, 3));
        System.out.println(string.substring(3, 4));
        System.out.println(string.substring(4, 5));
        System.out.println(string.substring(5, 6));
        System.out.println(string.substring(6, 7));
    }

}
