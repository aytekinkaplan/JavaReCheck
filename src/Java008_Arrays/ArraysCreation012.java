package Java008_Arrays;

public class ArraysCreation012 {
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
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].contains("Apple")){
                    System.out.println(true);
                }
            }
        }
    }
}
