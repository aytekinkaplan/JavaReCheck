package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation033 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 46, 79, 80, 21, 27, 44};
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,3,5,65);
        System.out.println(Arrays.toString(arr));
    }
}
