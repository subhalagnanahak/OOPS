package CollectionFramework;
import java.util.*;

public class Queue_CollectionFrame {
    public static void main (String [] args ) {
        // Queue is an interface - FIFO (First In First Out)
        // Commonly implemented using LinkedList or ArrayDeque
        Queue<Integer> queue = new LinkedList<>();

        // add() - inserts element, throws exception if capacity restricted queue is full
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("after add: " + queue);

        // offer() - inserts element, returns false instead of throwing exception if full
        queue.offer(40);
        System.out.println("after offer: " + queue);

        // peek() - retrieves head without removing, returns null if empty
        System.out.println("peek: " + queue.peek());
        System.out.println("queue after peek (unchanged): " + queue);

        // element() - retrieves head without removing, throws exception if empty
        System.out.println("element: " + queue.element());

        // poll() - retrieves and removes head, returns null if empty
        System.out.println("poll: " + queue.poll());
        System.out.println("queue after poll: " + queue);

        // remove() - retrieves and removes head, throws exception if empty
        System.out.println("remove: " + queue.remove());
        System.out.println("queue after remove: " + queue);

        // size()
        System.out.println("size: " + queue.size());

        // contains()
        System.out.println("contains 30: " + queue.contains(30));

        // isEmpty()
        System.out.println("isEmpty: " + queue.isEmpty());

        // iterator() - order is NOT guaranteed to be FIFO for all Queue implementations,
        // but for LinkedList it traverses head to tail
        queue.add(50);
        queue.add(60);
        System.out.println("queue now: " + queue);
        Iterator<Integer> it = queue.iterator();
        System.out.print("iterator: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // addAll()
        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(500);
        queue2.add(600);
        queue.addAll(queue2);
        System.out.println("after addAll: " + queue);

        // removeAll()
        queue.removeAll(queue2);
        System.out.println("after removeAll: " + queue);

        // toArray()
        Object[] arr = queue.toArray();
        System.out.print("toArray: ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();

        // clear()
        queue2.clear();
        System.out.println("queue2 after clear: " + queue2 + ", isEmpty: " + queue2.isEmpty());

        // -------- PriorityQueue demo (another Queue implementation) --------

        Queue<Integer> pq= new PriorityQueue<>((a,b) -> b - a); // maxHeap -> high value = high priority
        System.out.println("\n--- PriorityQueue ---");
        //Queue<Integer> pq = new PriorityQueue<>();  // default behaviour in integer -> low value = high priority
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);
        System.out.println(" pq priority poll : " + pq.poll());
        System.out.println("pq: " + pq);
        System.out.println("pq priority poll :"+ pq.poll()); //2nd time
        System.out.println("PriorityQueue (internal order, not sorted print): " + pq);
        System.out.println("peek (smallest element): " + pq.peek());
        while (!pq.isEmpty()) {
            System.out.println("poll: " + pq.poll());  // always returns smallest first
        }

        // -------- Deque as a Queue (ArrayDeque) --------
        System.out.println("\n--- ArrayDeque as Queue ---");
        Queue<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        System.out.println("ArrayDeque: " + deque);
        System.out.println("poll: " + deque.poll());
        System.out.println("after poll: " + deque);
    }
}