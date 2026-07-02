package oopslect1.java.notes;

public class ByDefaultConstructor {

// ════════════════════════════════════════════════════════════════════════════
//   BY DEFAULT CONSTRUCTOR
// ════════════════════════════════════════════════════════════════════════════

    /*
     * DEFAULT CONSTRUCTOR
     * ────────────────────
     * If you do NOT write ANY constructor in your class,
     * Java automatically provides A NO-ARGUMENT constructor:
     *
     *   ClassName() { }   ← this is what Java inserts invisibly
     *
     * It initialises fields to their DEFAULT VALUES:
     *   int / byte / short / long  → 0
     *   float / double             → 0.0
     *   boolean                    → false
     *   char                       → '\u0000'
     *   any object reference       → null
     *
     * ⚠  IMPORTANT:
     *   Once you write ANY constructor yourself, Java REMOVES the default.
     *   If you still want A no-arg constructor, you must write it manually.
     */

    static class Animal {
        // no constructor written here
        String name;
        int    age;
    }

    class DefaultConstructorDemo {
        public static void main(String[] args) {
            Animal a = new Animal(); // Java's default no-arg constructor is used
            System.out.println(a.name); // null  (default for String)
            System.out.println(a.age);  // 0     (default for int)
        }
    }

}
