package CollectionFramework;
import java.util.*;

import static javax.swing.UIManager.get;


public class ArrayList_collectionFrame {
        public static void main(String [] args ) {
            // List orr collection - interface

            // ArrayList  -- concrete class
          // ArrayList<Integer> arr = new ArrayList <> () ;
            //or
            List <Integer> list = new ArrayList<> () ;
            // or
            // parent root element
            Collection<Integer> collection = new ArrayList<> () ;

            // add
            list.add(10) ;
            list.add(20) ;
            list.add(30) ;
            System.out.println(list) ;
            list.add(40);
            System.out.println(list) ;

            // remove
            list.remove(0);
            System.out.println(list) ;

            // addAll
            List<Integer> list2 = new ArrayList<> () ;
            list2.add(101) ;
            list2.add(102) ;
            list2.add(20)  ;

            list.addAll(list2) ;
            System.out.println(list) ;

            list.removeAll(list2) ;
            System.out.println(list) ;

            // size
            System.out.println(list.size()) ;

            System.out.println("printing list" + list) ;
            list2.clear();
            System.out.println(list2.size()) ;

            // itrator() - traverse trough the array and access the element in the collection

            Iterator<Integer> iterator = list.iterator() ;
             while (iterator.hasNext()) {
                 System.out.println("element :" +iterator.next()) ;
             }
                List<Integer> list3 = new ArrayList<> () ;
             list3.add(11) ;
             list3.add(12) ;
             list3.add(13) ;
             System.out.println (list3.get(1) ) ;
             System.out.println ("before set :" + list3) ;
             list3.set(0 ,110);
             System.out.println ("after set :"+ list3) ;

             // toArray
            list3.toArray() ;
            Object[] arr = list3.toArray() ;
            for (Object obj : arr) {
                System.out.println(obj) ;
            }
            //contains
            System.out.println (list3.contains(110) ) ;


         list.add(60) ;
         System.out.println ("printing entire list" + list);
         //sort() arraylist
            Collections.sort(list) ;
            System.out.println ("printing entire list" + list);

            // descending order
            Collections.reverse(list);
            System.out.println ("printing entire list in descending order " + list);

            //clone in arraylist
            List<Integer> newlist = new ArrayList<>(list);
            System.out.println("print new clone list :" + newlist);

            //ensureCapacity
            ArrayList<Integer> marks = new ArrayList<>() ;
            marks.ensureCapacity(100);





    }
}
