package Java008_Arrays;

public class ArraysCreation002 {
       /*
        String Array (Dizi) oluşturunuz.
        elemanları : Apple, Orange , Banana, Kiwi
        Array'leri tüm elemanları yazdırınız.
         */

    //Kodu aşağıya yazınız.

    public static void main(String[] args) {
        String [] fruits = new String[]{"Apple","Orange","Banana","Kiwi"};
        for (String each: fruits) {
            System.out.print(each+" ");
        }
    }
}
