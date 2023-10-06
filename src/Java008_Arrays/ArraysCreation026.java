package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation026 {
    public static void main(String[] args) {
        String str = "javaCAN'lara selam olsun. en kısa zamanda bolcana offer sonrası TUZLABALIK :)";
        String[] strings = str.trim().split(" ");
        System.out.println(Arrays.toString(strings));

        String[] strings1 = str.trim().split("");
        System.out.println(Arrays.toString(strings1));
        System.out.println(strings1.length);

    }
}
