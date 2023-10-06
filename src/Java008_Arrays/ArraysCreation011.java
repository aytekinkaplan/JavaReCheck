package Java008_Arrays;

public class ArraysCreation011 {
          /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

    //Kodu aşağıya yazınız..
    public static void main(String[] args) {
        String[] strings = {"Apple" , "Orange" , "Banana" , "Pineapple"};
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i].contains("Apple"));
        }
    }

}
