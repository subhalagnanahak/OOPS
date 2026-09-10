package CollectionFramework.Comparator;

import CollectionFramework.Comparable.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main (String [] args) {


        List<Student> students = new ArrayList<>();

        students.add(new Student(19, "vipul", 69));
        students.add(new Student(21, "samaira", 45));
        students.add(new Student(20, "rinna", 99));
        students.add(new Student(21, "sara", 90));
        students.add(new Student(21, "kinjal", 88));

        System.out.println(students);

        Collections.sort(students,new WeightComparator() );
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.weight - o2.weight;
//            }
//        });
        System.out.println(students);
    }
}
