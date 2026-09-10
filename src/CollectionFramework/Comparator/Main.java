package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String [] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);

        System.out.println(list);

        Collections.sort(list);
        System.out.println("collection.sort"+list);

    }
}
