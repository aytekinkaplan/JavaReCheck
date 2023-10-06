package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation022 {
    public static void main(String[] args) {
        String isimArr[] = {"Yusuf", "Murat", "Ceren", "Vedat", "Suzan", "Abdi"};
        System.out.println(Arrays.toString(isimArr));
        int arrayDimension = 0;
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length() < 6) {
                arrayDimension++;
            }
        }

        String[] isimArr1 = new String[arrayDimension];
        int j = 0;
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length()<6){
                isimArr1[j]=isimArr[i];
            }
            j++;
        }

        for (int i = 0; i < isimArr1.length; i++) {
            System.out.print(isimArr1[i]+" ");
        }
    }
}
