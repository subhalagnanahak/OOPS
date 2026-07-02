package oopslect1.java.notes;

public class newforPrimitiveDatatype {

// ════════════════════════════════════════════════════════════════════════════
// [1:18:31]  WHY WE DON'T USE "new" FOR PRIMITIVE DATA TYPES?
// ════════════════════════════════════════════════════════════════════════════

    /*
     * Primitives are NOT objects.
     * They store their VALUE DIRECTLY on the STACK — no heap involvement.
     * Because no object is created, there is nothing for 'new' to do.
     *
     * 8 PRIMITIVE TYPES:
     * ┌──────────┬──────────┬──────────────┬──────────────────────────┐
     * │ Type     │ Size     │ Default      │ Example                  │
     * ├──────────┼──────────┼──────────────┼──────────────────────────┤
     * │ byte     │  8 bits  │ 0            │ byte b = 100;            │
     * │ short    │ 16 bits  │ 0            │ short s = 30000;         │
     * │ int      │ 32 bits  │ 0            │ int age = 25;            │
     * │ long     │ 64 bits  │ 0L           │ long pop = 8000000000L;  │
     * │ float    │ 32 bits  │ 0.0f         │ float pi = 3.14f;        │
     * │ double   │ 64 bits  │ 0.0          │ double d = 99.99;        │
     * │ char     │ 16 bits  │ '\u0000'     │ char c = 'A';            │
     * │ boolean  │  1 bit   │ false        │ boolean flag = true;     │
     * └──────────┴──────────┴──────────────┴──────────────────────────┘
     *
     * STACK  vs  HEAP:
     *   int age = 21;            → value 21 stored directly on stack
     *   Student s = new Student(); → reference on stack, object on heap
     *
     * String is A special case:
     *   String s = "Hello";          ← literal — stored in String Pool (no new)
     *   String s = new String("Hi"); ← object on heap (wasteful, avoid this)
     */

    class PrimitivesDemo {
        public static void main(String[] args) {
            byte    b = 127;
            short   s = 32000;
            int     i = 100;
            long    l = 10000000000L;   // L suffix mandatory for long > int range
            float   f = 3.14f;          // f suffix mandatory
            double  d = 9.81;
            char    c = 'J';
            boolean flag = true;

            // No 'new' used above — they are all stack-allocated values
            System.out.println("int: " + i + " | double: " + d + " | char: " + c);
        }
    }


}
