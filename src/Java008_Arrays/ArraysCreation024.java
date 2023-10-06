package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation024 {
    public static void main(String[] args) {
        // array'de eleman varlığı  kontrolu

        int sayiArray[] = {2, 46, 31, 80, 44, 63, 27, 21, 79};

        System.out.println(Arrays.binarySearch(sayiArray, 2));
        System.out.println();
        System.out.println(Arrays.binarySearch(sayiArray, 79));
        System.out.println();
        System.out.println(Arrays.binarySearch(sayiArray, 23));
        System.out.println();
        System.out.println(Arrays.binarySearch(sayiArray, 24));
    }
}
