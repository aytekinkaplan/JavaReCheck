package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation013 {
        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

    // code start here
    public static void main(String[] args) {
        int[] arr = {12, 2, 5, 15, 8};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
