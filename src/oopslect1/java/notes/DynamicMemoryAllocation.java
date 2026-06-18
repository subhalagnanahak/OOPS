package oopslect1.java.notes;

public class DynamicMemoryAllocation {

// ════════════════════════════════════════════════════════════════════════════
// [0:34:09]  DYNAMIC MEMORY ALLOCATION
// ════════════════════════════════════════════════════════════════════════════

    /*
     * DYNAMIC means "at RUNTIME" — memory is allocated while the program runs,
     * not at compile time.
     *
     * When you write:
     *   Student s1 = new Student();
     *
     *   • The reference variable  s1  lives on the STACK.
     *     (stack memory is fixed & managed automatically per method call)
     *
     *   • The actual Student object lives on the HEAP.
     *     (heap memory is shared, dynamic, and managed by the GC)
     *
     *
     *  STACK (per method/thread)        HEAP (shared)
     *  ──────────────────────           ──────────────────────────────────
     *  s1  [address: 0x1A4F] ────────►  0x1A4F  { name, age, gpa }
     *  s2  [address: 0x2B8E] ────────►  0x2B8E  { name, age, gpa }
     *  age [value: 21       ]           (primitives don't live here)
     *
     *
     * KEY POINT — Reference vs Value:
     *   s1 does NOT hold the Student object directly.
     *   s1 holds the MEMORY ADDRESS (reference) of the object.
     *   This is why Java is called "pass by value of reference".
     */

    class DynamicMemoryDemo {
        public static void main(String[] args) {

            int age = 21;              // primitive → value stored on STACK directly

            Class.Student s1 = new Class.Student(); // reference on STACK, object on HEAP
            s1.name = "Priya";

            // Both s1 and s2 point to the SAME object
            Class.Student s2 = s1;
            s2.name = "Ravi";

            System.out.println(s1.name); // Ravi — because s1 & s2 share same address
        }
    }
}
