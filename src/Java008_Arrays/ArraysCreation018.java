package Java008_Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysCreation018 {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt()%100;
        }
        System.out.println(Arrays.toString(intArray));

    }
}
