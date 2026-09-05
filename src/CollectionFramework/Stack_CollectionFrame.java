package CollectionFramework;
import java.util.*;

public class Stack_CollectionFrame {
    public static void main(String[] args) {

        // Stack extends Vector - LIFO (Last In First Out) data structure
        Stack<Integer> stack = new Stack<>();

        // push() - adds element to the top
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("after push: " + stack);

        // add() - Stack also inherits List's add() (adds at end, same as push for a stack)
        stack.add(40);
        System.out.println("after add: " + stack);

        // peek() - views the top element without removing it
        System.out.println("peek: " + stack.peek());
        System.out.println("stack after peek (unchanged): " + stack);

        // pop() - removes and returns the top element
        System.out.println("pop: " + stack.pop());
        System.out.println("stack after pop: " + stack);

        // search() - returns 1-based position from the top; -1 if not found
        System.out.println("search 20: " + stack.search(20));
        System.out.println("search 99: " + stack.search(99));

        // empty() - Stack-specific check (same as isEmpty())
        System.out.println("empty: " + stack.empty());

        // isEmpty() - inherited from Vector/List
        System.out.println("isEmpty: " + stack.isEmpty());

        // size()
        System.out.println("size: " + stack.size());

        // contains()
        System.out.println("contains 10: " + stack.contains(10));

        // indexOf() / lastIndexOf() - inherited from Vector
        stack.push(10); // add duplicate for demo
        System.out.println("stack now: " + stack);
        System.out.println("indexOf 10: " + stack.indexOf(10));
        System.out.println("lastIndexOf 10: " + stack.lastIndexOf(10));

        // get(index) - inherited from Vector (0 = bottom of stack)
        System.out.println("get(0): " + stack.get(0));

        // iterator() - traverses BOTTOM to TOP (not top-down like you might expect!)
        Iterator<Integer> it = stack.iterator();
        System.out.print("iterator (bottom to top): ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // toArray()
        Object[] arr = stack.toArray();
        System.out.print("toArray: ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // addAll()
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(500);
        stack2.push(600);
        stack.addAll(stack2);
        System.out.println("after addAll: " + stack);

        // removeAll()
        stack.removeAll(stack2);
        System.out.println("after removeAll: " + stack);

        // remove(Object) - removes first matching element (not necessarily the top)
        stack.remove(Integer.valueOf(10));
        System.out.println("after remove(Object 10): " + stack);

        // Collections.sort()
        Collections.sort(stack);
        System.out.println("after sort: " + stack);

        // Collections.reverse() - descending order
        Collections.reverse(stack);
        System.out.println("after reverse (descending): " + stack);

        // clone()
        Stack<Integer> cloned = (Stack<Integer>) stack.clone();
        System.out.println("cloned stack: " + cloned);

        // clear()
        stack2.clear();
        System.out.println("stack2 after clear: " + stack2 + ", isEmpty: " + stack2.isEmpty());

        // Demonstrating pop() until empty (typical stack usage pattern)
        System.out.println("\npopping all elements from stack:");
        while (!stack.isEmpty()) {
            System.out.println("popped: " + stack.pop());
        }
        System.out.println("stack finally: " + stack);
    }
}
