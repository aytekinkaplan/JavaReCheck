package Java009_ArrayList;

import java.util.ArrayList;

public class ArrayListCreation005 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            integerArrayList.add(i);
        }
        System.out.println("integerArrayList = " + integerArrayList);
    }
}
