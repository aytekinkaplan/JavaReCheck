package Java008_Arrays;

public class ArraysCreation021 {
    public static void main(String[] args) {
        String isimArr[] = {"Yusuf", "Murat", "Ceren", "Vedat", "Suzan", "Abdi"};
        int j = 0;
        String newArray[] = new String[0];
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length()>5){
                newArray[j]=isimArr[i];
            }
            j++;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
