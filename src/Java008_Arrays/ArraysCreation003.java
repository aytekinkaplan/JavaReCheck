package Java008_Arrays;

public class ArraysCreation003 {
       /*
        String Array (Dizi) oluşturunuz.
        elemanları : Apple, Orange , Banana, Kiwi
        Array'leri tüm elemanları yazdırınız.
         */

    //Kodu aşağıya yazınız.

    public static void main(String[] args) {
        String[]fruits ={"Apple","Orange","Bana","Kiwi"};
        for (String each: fruits) {
            System.out.print(each+" ");
        }
    }
}
