package Java008_Arrays;

public class ArraysCreation001 {
       /*
        String Array (Dizi) oluşturunuz.
        elemanları : Apple, Orange , Banana, Kiwi
        Array'leri tüm elemanları yazdırınız.
         */

    //Kodu aşağıya yazınız.
    public static void main(String[] args) {
        String [] fruits = new String[4];
        fruits[0] = "Apple";
        fruits[1] = "Orange";
        fruits[2] = "Banana";
        fruits[3] = "Kiwi";

        for (String each: fruits) {
            System.out.println(each);
        }
    }
}
