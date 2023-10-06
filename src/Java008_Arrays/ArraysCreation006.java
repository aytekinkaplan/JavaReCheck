package Java008_Arrays;

public class ArraysCreation006 {
    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

    //Kodu aşağıya yazınız..
    public static void main(String[] args) {
        int[] arr = {25,30,30,35,100};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
