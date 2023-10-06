package Java008_Arrays;

public class ArraysCreation020 {
    //Task-> isimArray de 5 karakterden fazla olan elemanı print eden code create ediniz
    public static void main(String[] args) {
        String isimArr[] = {"Yusuf", "Murat", "Ceren", "Vedat", "Suzan", "Abdi"};
        String isimArr1[];
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length()<6){
                System.out.println(isimArr[i]);

            }
        }
    }
}
