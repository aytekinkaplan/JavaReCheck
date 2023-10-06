package Java008_Arrays;

public class ArraysCreation017 {
    public static void main(String[] args) {
         /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.

        int[] ints = {12, 14 , 21 ,23 , 10 ,4};
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum+=ints[i];
        }
        System.out.println(sum/ ints.length);
    }
}
