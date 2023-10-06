package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation031 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 46, 79, 80, 21, 27, 44};
        int arr1[] = Arrays.copyOf(arr,0);System.out.println(Arrays.toString(arr1));
        int arr2[] = Arrays.copyOf(arr,1);System.out.println(Arrays.toString(arr2));
        int arr3[] = Arrays.copyOf(arr,2);System.out.println(Arrays.toString(arr3));
        int arr4[] = Arrays.copyOf(arr,3);System.out.println(Arrays.toString(arr4));
        int arr5[] = Arrays.copyOf(arr,4);System.out.println(Arrays.toString(arr5));
        int arr6[] = Arrays.copyOf(arr,5);System.out.println(Arrays.toString(arr6));
        int arr7[] = Arrays.copyOf(arr,6);System.out.println(Arrays.toString(arr7));
        int arr8[] = Arrays.copyOf(arr,7);System.out.println(Arrays.toString(arr8));
        int arr9[] = Arrays.copyOf(arr,8);System.out.println(Arrays.toString(arr9));

    }
}
