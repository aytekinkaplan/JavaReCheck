package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation032 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 46, 79, 80, 21, 27, 44};
        int arr1[] = Arrays.copyOfRange(arr,2,5);
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1,34);
        System.out.println(Arrays.toString(arr1));
    }
}
