package Java009_ArrayList;

import java.util.ArrayList;

public class ArrayListCreation001 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(31);
        integerArrayList.add(46);
        integerArrayList.add(79);
        integerArrayList.add(44);
        integerArrayList.add(23);
        integerArrayList.add(67);
        integerArrayList.add(89);
        integerArrayList.add(45);
        System.out.println(integerArrayList);
        System.out.println("LOOP");
        for (Integer each: integerArrayList) {
            System.out.print(each+" ");
        }
    }
}
