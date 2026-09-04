package CollectionFramework;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ArrayList_collectionFrame {
        public static void main(String [] args ) {
            // List orr collection - interface

            // ArrayList  -- concrete class
           ArrayList<Integer> arr = new ArrayList <> () ;
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





    }
}
