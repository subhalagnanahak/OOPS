package CollectionFramework.Sets;
import java.util.Set;
import java.util.HashSet;

public class HashSetBasics {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<> ();
        Set<Integer> set2 = new HashSet<> ();
        set1.add(30);
        set1.add(10);
        set1.add(20);
        set1.add(40);

        set2.add(30);
        set2.add(10);
        set2.add(20);
        set2.add(40);
    }
}
