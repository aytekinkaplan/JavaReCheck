package Java008_Arrays;

public class ArraysCreation010 {
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
            if (strings[i].contains("Apple")){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }
}
