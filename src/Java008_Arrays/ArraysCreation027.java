package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation027 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 46, 79, 80, 21, 27, 44};
        int arr2[] = {21, 27, 46, 79, 44, 2, 1, 80};

        System.out.println(Arrays.equals(arr1, arr2));
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
        String string = Arrays.toString(arr1);
        System.out.println(string);


        System.out.println(string.substring(0, 1));
        System.out.println(string.substring(0, 2));
        System.out.println(string.substring(0, 3));
        System.out.println(string.substring(0, 4));
        System.out.println(string.substring(0, 5));
    }
}
