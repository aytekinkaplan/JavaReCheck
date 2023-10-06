package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation025 {
    public static void main(String[] args) {
        int sayiArray[] = {2, 46, 31, 80, 44, 63, 27, 21, 79};
        Arrays.sort(sayiArray);
        System.out.println("Aradığınız sayı "+Arrays.binarySearch(sayiArray,2)+" bulunmakta");
        System.out.println();
        System.out.println(Arrays.binarySearch(sayiArray,46));
        System.out.println();
        System.out.println(Arrays.binarySearch(sayiArray,31));
        System.out.println();
        System.out.println(Arrays.binarySearch(sayiArray,80));
        System.out.println();
        System.out.println(Arrays.binarySearch(sayiArray,44));
        System.out.println();
        System.out.println(Arrays.binarySearch(sayiArray,63));
        System.out.println();
        System.out.println(Arrays.binarySearch(sayiArray,27));
        System.out.println();
        System.out.println(Arrays.binarySearch(sayiArray,21));
        System.out.println();
        System.out.println(Arrays.binarySearch(sayiArray,79));
        System.out.println();
    }
}
