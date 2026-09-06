package CollectionFramework.Sets;
import java.util.*;

public class HashSetBasics {

    public static void main(String[] args) {

        HashSet<Student> set3 = new HashSet<>();
        Student s1 = new Student( 1, "John Smith" );
        Student s2 = new Student( 1, "John Smith" );
        Student s3 = new Student( 1, "John Smith" ) ;

        set3.add(s1);
        set3.add(s2);
        set3.add(s3);

        System.out.println(set3);
        System.out.println("Size: " + set3.size());

/*
        // 1. Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // 2. add() - adds element, returns false if duplicate
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // duplicate, ignored
        System.out.println("After add(): " + set);

        // 3. addAll() - adds all elements from another collection
        List<String> more = Arrays.asList("Go", "Rust");
        set.addAll(more);
        System.out.println("After addAll(): " + set);

        // 4. contains() - checks if element exists
        System.out.println("Contains 'Java'? " + set.contains("Java"));

        // 5. containsAll() - checks if all elements exist
        System.out.println("Contains all [Go, Rust]? " + set.containsAll(more));

        // 6. size() - number of elements
        System.out.println("Size: " + set.size());

        // 7. isEmpty() - checks if set has no elements
        System.out.println("Is empty? " + set.isEmpty());

        // 8. remove() - removes a specific element
        set.remove("C++");
        System.out.println("After remove('C++'): " + set);

        // 9. removeAll() - removes all elements found in given collection
        set.removeAll(Arrays.asList("Go"));
        System.out.println("After removeAll([Go]): " + set);

        // 10. retainAll() - keeps only elements present in given collection
        HashSet<String> temp = new HashSet<>(set);
        temp.add("Kotlin");
        set.retainAll(Arrays.asList("Java", "Kotlin"));
        System.out.println("After retainAll([Java, Kotlin]): " + set);

        // reset set for further demo
        set = new HashSet<>(Arrays.asList("Java", "Python", "Rust"));

        // 11. iterator() - traverse elements
        System.out.print("Using iterator: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 12. forEach() - traverse using lambda
        System.out.print("Using forEach: ");
        set.forEach(item -> System.out.print(item + " "));
        System.out.println();

        // 13. stream() - convert to stream for functional operations
        long count = set.stream().filter(s -> s.length() > 4).count();
        System.out.println("Elements with length > 4: " + count);

        // 14. toArray() - convert set to array
        Object[] arr = set.toArray();
        System.out.println("As array: " + Arrays.toString(arr));

        // 15. clone() - shallow copy of the set
        HashSet<String> cloned = (HashSet<String>) set.clone();
        System.out.println("Cloned set: " + cloned);

        // 16. equals() - compares two sets for equality
        System.out.println("set equals cloned? " + set.equals(cloned));

        // 17. hashCode() - hash code of the set
        System.out.println("HashCode: " + set.hashCode());

        // 18. clear() - removes all elements
        cloned.clear();
        System.out.println("After clear(): " + cloned + " | isEmpty: " + cloned.isEmpty());

        // Note: HashSet has NO get(index) or ordering guarantee,

        // since it's backed by a HashMap internally (no duplicates, unordered).
   */
    }
}