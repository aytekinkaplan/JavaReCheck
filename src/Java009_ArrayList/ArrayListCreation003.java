package Java009_ArrayList;

import java.util.ArrayList;

public class ArrayListCreation003 {
    public static void main(String[] args) {
     ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 17; i++) {
            integerArrayList.add(i);
        }
        for (int i = 0; i < integerArrayList.size()-1; i++) {
            System.out.print(integerArrayList.get(i)+" ");
        }

    }
}
