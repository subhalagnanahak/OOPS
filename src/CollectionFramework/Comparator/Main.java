package CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String [] args) {



        List<Student> students = new ArrayList<>();

        students.add(new Student(19,"vipul",69));
        students.add(new Student(21,"samaira",45));
        students.add(new Student(20,"rinna",99));
        students.add(new Student(21,"sara",90));
        students.add(new Student(21,"kijal",88));

        System.out.println(students);



//
//        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(5);
//        list.add(3);
//        list.add(4);
//
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println("collection.sort"+list);

    }
}
