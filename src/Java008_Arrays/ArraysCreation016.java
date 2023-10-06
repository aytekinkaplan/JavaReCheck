package Java008_Arrays;

public class ArraysCreation016 {
      /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
      public static void main(String[] args) {
          String string = "Hello World";
          String[] strings=string.trim().split("");
          String string1="";
          for (int i = strings.length-1; i >=0; i--) {
              string1+=strings[i];
          }
          System.out.println(string1);
      }
}
