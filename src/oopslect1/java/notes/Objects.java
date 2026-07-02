package oopslect1.java.notes;

/*
 * ════════════════════════════════════════════════════════════════════════════
 * 2.  OBJECTS
 * ════════════════════════════════════════════════════════════════════════════
 *
 * WHAT IS AN OBJECT?
 * ───────────────────
 * An object is A real, concrete INSTANCE of A class.
 * When you create an object:
 *   1. The JVM allocates memory on the HEAP for the object's fields.
 *   2. The constructor runs to initialize those fields.
 *   3. A REFERENCE (memory address) is returned and stored in A
 *      reference variable on the STACK.
 *
 * SYNTAX:
 *   ClassName variableName = new ClassName(arguments);
 *   ──────┬──  ────────┬──   ─┬─ ────────┬──────────
 *         │            │      │          └─ constructor call
 *         │            │      └─ allocates heap memory
 *         │            └─ reference variable (lives on the stack)
 *         └─ type of the reference
 */

public class Objects {

    /*
     * FIX 1: Student ko INNER class banao Objects ke andar,
     *        taaki ObjectDemo use kar sake.
     *
     * FIX 2: Inner class 'ObjectDemo' ko 'static' banana zaroori hai
     *        kyunki static main() method use kar raha hai.
     *        Non-static inner class ka object banana padta —
     *        static context mein directly nahi banta.
     */

    // ── Student class (inner) ────────────────────────────────────────────
    static class Student {
        String name;
        int    age;
        double gpa;

        public void displayInfo() {
            System.out.println("Name: " + name + " | Age: " + age + " | GPA: " + gpa);
        }
    }

    // ── ObjectDemo class (static inner) ─────────────────────────────────
    static class ObjectDemo {

        public static void main(String[] args) {

            Student s1 = new Student();   // object 1 on the heap
            Student s2 = new Student();   // object 2 — independent

            s1.name = "Priya";
            s1.age  = 20;
            s1.gpa  = 9.1;

            s2.name = "Arjun";
            s2.age  = 22;
            s2.gpa  = 8.7;

            s1.displayInfo();  // Name: Priya | Age: 20 | GPA: 9.1
            s2.displayInfo();  // Name: Arjun | Age: 22 | GPA: 8.7

            /*
             * Two references pointing to the SAME object:
             *
             *   Stack          Heap
             *   ──────         ────────────────────────────
             *   A  ──────────► [ Student: name="Raj", age=19 ]
             *   b  ──────────►          (same object!)
             *
             * Changing b.name ALSO changes what A.name sees,
             * because they both point to the same heap object.
             */
            Student a = new Student();
            a.name = "Raj";
            Student b = a;          // b copies the reference, not the object
            b.name = "Ravi";
            System.out.println(a.name); // prints: Ravi  (same object!)
        }
    }
}