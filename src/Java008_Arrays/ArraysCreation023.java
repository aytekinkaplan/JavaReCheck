package Java008_Arrays;

import java.util.Arrays;

public class ArraysCreation023 {
    public static void main(String[] args) {
        String[] strings={"Ali","Murat","Fadıl","Tahsin","Murtaza"};
        int dimension = 0, j = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length()<6){
                dimension++;
            }
        }
        String[] strings1 = new String[dimension];
        for (int i = 0; i < dimension; i++) {
            if (strings[i].length()<6){
                strings1[j]=strings[i];
            }
            j++;
        }
        System.out.println(strings1.length);
        System.out.println(Arrays.toString(strings1));
    }
}
