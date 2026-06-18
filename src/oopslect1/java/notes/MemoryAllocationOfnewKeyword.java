package oopslect1.java.notes;

public class MemoryAllocationOfnewKeyword {



// ════════════════════════════════════════════════════════════════════════════
// [1:20:35]  MEMORY ALLOCATION OF "new" KEYWORD
// ════════════════════════════════════════════════════════════════════════════

    /*
     * WHAT EXACTLY DOES 'new' DO?
     * ────────────────────────────
     *  1. Allocates memory on the HEAP for the new object's fields.
     *  2. Calls the constructor to initialise the fields.
     *  3. Returns the REFERENCE (memory address) to the caller.
     *     That reference is stored in a variable on the STACK.
     *
     *
     *  STACK                          HEAP
     *  ─────────────────              ─────────────────────────────────────
     *  s1 → [0x1A4F] ──────────────► 0x1A4F { name:"Priya", age:20 }
     *  s2 → [0x2B8E] ──────────────► 0x2B8E { name:"Arjun", age:22 }
     *  age → 21 (value stored here, no arrow)
     *
     *
     * COPYING A REFERENCE:
     *   Student s3 = s1;
     *   Now s3 holds the same address as s1 → SAME heap object.
     *   Changing s3.name ALSO changes s1.name (they are the same object).
     *
     * NULL REFERENCE:
     *   Student s4 = null;
     *   s4 holds no address. Calling s4.anything() → NullPointerException.
     */

    class NewKeywordDemo {
        public static void main(String[] args) {
            int     age = 21;                   // stack value — no new
            Class.Student s1  = new Class.Student();        // heap object
            Class.Student s2  = new Class.Student();

            s1.name = "Priya";  s1.age = 20;
            s2.name = "Arjun";  s2.age = 22;

            Class.Student s3 = s1;            // s3 copies s1's reference
            s3.name = "Kavya";
            System.out.println(s1.name); // Kavya — same heap object modified!

            Class.Student s4 = null;
            // s4.displayInfo(); // NullPointerException — uncomment to see
        }
    }


}
