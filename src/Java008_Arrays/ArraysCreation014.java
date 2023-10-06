package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation014 {
    public static void main(String[] args) {
           /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..

        int[] arr={14 , 19 , 5 , 21};
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
