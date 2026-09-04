package CollectionFramework;


import java.util.*;

    public class linkedlist_Collectionframe {
        public static void main(String[] args) {

            // LinkedList implements both List and Deque interfaces
            LinkedList<Integer> list = new LinkedList<>();

            // add() - adds at the end
            list.add(10);
            list.add(20);
            list.add(30);
            System.out.println("after add: " + list);

            // add(index, element) - insert at specific position
            list.add(1, 15);
            System.out.println("after add at index 1: " + list);

            // addFirst() / addLast() - Deque methods
            list.addFirst(5);
            list.addLast(40);
            System.out.println("after addFirst/addLast: " + list);

            // offer() - adds at the end (like add, but returns boolean)
            list.offer(50);
            System.out.println("after offer: " + list);

            // offerFirst() / offerLast()
            list.offerFirst(1);
            list.offerLast(60);
            System.out.println("after offerFirst/offerLast: " + list);

            // getFirst() / getLast()
            System.out.println("getFirst: " + list.getFirst());
            System.out.println("getLast: " + list.getLast());

            // get(index)
            System.out.println("get(2): " + list.get(2));

            // peek() - retrieves head without removing (returns null if empty)
            System.out.println("peek: " + list.peek());

            // peekFirst() / peekLast()
            System.out.println("peekFirst: " + list.peekFirst());
            System.out.println("peekLast: " + list.peekLast());

            // set(index, element)
            list.set(0, 100);
            System.out.println("after set(0,100): " + list);

            // size()
            System.out.println("size: " + list.size());

            // contains()
            System.out.println("contains 30: " + list.contains(30));

            // indexOf()
            System.out.println("indexOf 30: " + list.indexOf(30));

            // remove() - removes head (first element)
            list.remove();
            System.out.println("after remove(): " + list);

            // remove(index)
            list.remove(2);
            System.out.println("after remove(index 2): " + list);

            // remove(Object)
            list.remove(Integer.valueOf(30));
            System.out.println("after remove(Object 30): " + list);

            // removeFirst() / removeLast()
            list.removeFirst();
            list.removeLast();
            System.out.println("after removeFirst/removeLast: " + list);

            // poll() - retrieves and removes head (returns null if empty)
            System.out.println("poll: " + list.poll());
            System.out.println("after poll: " + list);

            // pollFirst() / pollLast()
            System.out.println("pollFirst: " + list.pollFirst());
            System.out.println("pollLast: " + list.pollLast());
            System.out.println("after pollFirst/pollLast: " + list);

            // push() / pop() - stack operations (Deque)
            list.push(200);   // adds at head
            System.out.println("after push(200): " + list);
            System.out.println("pop: " + list.pop());  // removes head
            System.out.println("after pop: " + list);

            // addAll()
            LinkedList<Integer> list2 = new LinkedList<>();
            list2.add(500);
            list2.add(600);
            list.addAll(list2);
            System.out.println("after addAll: " + list);

            // removeAll()
            list.removeAll(list2);
            System.out.println("after removeAll: " + list);

            // iterator()
            Iterator<Integer> it = list.iterator();
            System.out.print("iterator forward: ");
            while (it.hasNext()) {
                System.out.print(it.next() + " ");
            }
            System.out.println();

            // descendingIterator() - only available in LinkedList/Deque
            Iterator<Integer> descIt = list.descendingIterator();
            System.out.print("descendingIterator: ");
            while (descIt.hasNext()) {
                System.out.print(descIt.next() + " ");
            }
            System.out.println();

            // toArray()
            Object[] arr = list.toArray();
            System.out.print("toArray: ");
            for (Object o : arr) {
                System.out.print(o + " ");
            }
            System.out.println();

            // Collections.sort()
            Collections.sort(list);
            System.out.println("after sort: " + list);

            // Collections.reverse() - descending order
            Collections.reverse(list);
            System.out.println("after reverse (descending): " + list);

            // isEmpty()
            System.out.println("isEmpty: " + list.isEmpty());

            // clone()
            LinkedList<Integer> cloned = (LinkedList<Integer>) list.clone();
            System.out.println("cloned list: " + cloned);

            // clear()
            list2.clear();
            System.out.println("list2 after clear: " + list2 + ", isEmpty: " + list2.isEmpty());


            // contains() - check if element exists
            System.out.println("contains 30: " + list.contains(30));
            System.out.println("contains 99: " + list.contains(99));

            // indexOf() - first occurrence index
            System.out.println("indexOf 20: " + list.indexOf(20));   // 1 (first 20)

            // lastIndexOf() - last occurrence index
            System.out.println("lastIndexOf 20: " + list.lastIndexOf(20));  // 3 (second 20)

            // returns -1 if element not found
            System.out.println("indexOf 99: " + list.indexOf(99));
            System.out.println("lastIndexOf 99: " + list.lastIndexOf(99));

            // clear() - removes all elements
            System.out.println("before clear: " + list + ", size: " + list.size());
            list.clear();
            System.out.println("after clear: " + list + ", size: " + list.size());
            System.out.println("isEmpty after clear: " + list.isEmpty());
        }
    }

