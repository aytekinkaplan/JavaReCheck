package Java009_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCreation004 {
    public static void main(String[] args) {
        ArrayList<String>  list1 = new ArrayList<>(Collections.nCopies(4,"Kopya çekmek yasağ"));
        System.out.println(list1);


        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Almanya","Fransa","Hollanda","Danimarka","Rusya"));
        ArrayList<String> list3 = new ArrayList<>(List.of("Amerika","Brezilya","Japonya","Çin","Kore","Mısır","İtalya"));


        ArrayList<String> list4 =new ArrayList<>();
        //list4.addAll(1,list2);
        System.out.println("list4 = " + list4);

        list2.addAll(list3);
        list3.addAll(list2);


        System.out.println(list2);
        System.out.println(list3);
    }

}
