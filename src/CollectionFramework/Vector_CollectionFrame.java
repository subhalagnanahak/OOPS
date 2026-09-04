package CollectionFramework;
import java.util.*;

public class Vector_CollectionFrame {
    public static void main(String[] args) {

        // Vector implements List - legacy class, synchronized (thread-safe)
        Vector<Integer> vector = new Vector<>();

        // add() - modern List method
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("after add: " + vector);

        // addElement() - legacy Vector-specific method (same as add)
        vector.addElement(40);
        System.out.println("after addElement: " + vector);

        // add(index, element)
        vector.add(1, 15);
        System.out.println("after add at index 1: " + vector);

        // insertElementAt() - legacy version of add(index, element)
        vector.insertElementAt(99, 0);
        System.out.println("after insertElementAt: " + vector);

        // get(index)
        System.out.println("get(2): " + vector.get(2));

        // elementAt() - legacy version of get()
        System.out.println("elementAt(2): " + vector.elementAt(2));

        // firstElement() / lastElement() - legacy methods
        System.out.println("firstElement: " + vector.firstElement());
        System.out.println("lastElement: " + vector.lastElement());

        // set(index, element)
        vector.set(0, 100);
        System.out.println("after set(0,100): " + vector);

        // setElementAt() - legacy version of set()
        vector.setElementAt(200, 1);
        System.out.println("after setElementAt: " + vector);

        // size()
        System.out.println("size: " + vector.size());

        // capacity() - Vector-specific, shows internal array capacity
        System.out.println("capacity: " + vector.capacity());

        // contains()
        System.out.println("contains 30: " + vector.contains(30));

        // indexOf()
        System.out.println("indexOf 30: " + vector.indexOf(30));

        // lastIndexOf()
        vector.add(30); // add duplicate for demo
        System.out.println("vector now: " + vector);
        System.out.println("lastIndexOf 30: " + vector.lastIndexOf(30));

        // iterator() - traverse the vector
        Iterator<Integer> it = vector.iterator();
        System.out.print("iterator: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // elements() - legacy enumeration-based traversal
        Enumeration<Integer> e = vector.elements();
        System.out.print("elements(): ");
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();

        // remove(index)
        vector.remove(0);
        System.out.println("after remove(index 0): " + vector);

        // remove(Object)
        vector.remove(Integer.valueOf(30));
        System.out.println("after remove(Object 30): " + vector);

        // removeElement() - legacy version of remove(Object)
        vector.removeElement(200);
        System.out.println("after removeElement(200): " + vector);

        // removeElementAt() - legacy version of remove(index)
        vector.removeElementAt(0);
        System.out.println("after removeElementAt(0): " + vector);

        // addAll()
        Vector<Integer> vector2 = new Vector<>();
        vector2.add(500);
        vector2.add(600);
        vector.addAll(vector2);
        System.out.println("after addAll: " + vector);

        // removeAll()
        vector.removeAll(vector2);
        System.out.println("after removeAll: " + vector);

        // toArray()
        Object[] arr = vector.toArray();
        System.out.print("toArray: ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // Collections.sort()
        Collections.sort(vector);
        System.out.println("after sort: " + vector);

        // Collections.reverse() - descending order
        Collections.reverse(vector);
        System.out.println("after reverse (descending): " + vector);

        // isEmpty()
        System.out.println("isEmpty: " + vector.isEmpty());

        // clone()
        Vector<Integer> cloned = (Vector<Integer>) vector.clone();
        System.out.println("cloned vector: " + cloned);

        // clear()
        vector2.clear();
        System.out.println("vector2 after clear: " + vector2 + ", isEmpty: " + vector2.isEmpty());
    }
}