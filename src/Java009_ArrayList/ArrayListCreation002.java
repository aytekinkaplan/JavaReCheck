package Java009_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCreation002 {
    public static void main(String[] args) {
        ArrayList<String> countrList = new ArrayList<>(Arrays.asList("Almanya", "Küba", "Amerika", "İngiltere", "Polonya", "Fransa"));
        System.out.println(countrList);

        System.out.println("LOOP");

        for (int i = 0; i < countrList.size(); i++) {
            System.out.print(countrList.get(i)+" ");
        }
        System.out.println();
        System.out.println("NEW STYLE");
        System.out.println(countrList.get(countrList.size() - 1));
        System.out.println(countrList.get(countrList.size() - 2));
        System.out.println(countrList.get(countrList.size() - 3));
        System.out.println(countrList.get(countrList.size() - 4));
        System.out.println(countrList.get(countrList.size() - 5));
        System.out.println(countrList.get(countrList.size() - 6));
    }
}
