package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation019 {
    public static void main(String[] args) {
        String isimArr[] = {"Yusuf", "Murat", "Ceren", "Vedat", "Suzan", "Abdi"};
        System.out.println(Arrays.stream(isimArr).count());
        System.out.println(isimArr.length);

        System.out.println(isimArr[isimArr.length - 1]);
        System.out.println(isimArr[isimArr.length - 2]);
        System.out.println(isimArr[isimArr.length - 3]);
        System.out.println(isimArr[isimArr.length - 4]);
        System.out.println(isimArr[isimArr.length - 5]);
        System.out.println(isimArr[isimArr.length - 6]);

        System.out.println("İKİNCİ KISIM");
        for (int i = 0; i < isimArr.length; i++) {
            System.out.println(isimArr[i]);
        }
    }
}
