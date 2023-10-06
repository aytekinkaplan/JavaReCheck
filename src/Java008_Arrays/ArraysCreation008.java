package Java008_Arrays;

public class ArraysCreation008 {
         /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

    //Kodu aşağıya yazınız.

    public static void main(String[] args) {
        int[] ints = {5, 6, 8, 12, 14, 19};
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                sum1 += ints[i];
            } else if (ints[i] % 2 == 1) {
                sum2 += ints[i];
            }
        }
        System.out.print("Çift sayıların toplamı " + sum1);
        System.out.println();
        System.out.print("Tek sayıların toplamı " + sum2);


        System.out.println();

        for (int i = 0; i < ints.length; i++) {
            if (ints[i]%2==1){
                sum3-=ints[i];
            }
        }
        System.out.print("Çıkarma sonucu "+sum3);
    }


}
