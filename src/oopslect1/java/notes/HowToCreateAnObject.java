package oopslect1.java.notes;

public class HowToCreateAnObject {


// ════════════════════════════════════════════════════════════════════════════
//  HOW TO CREATE OBJECTS?
// ════════════════════════════════════════════════════════════════════════════

    /*
     * SYNTAX:
     *   ClassName  variableName  =  new  ClassName();
     *   ────┬────  ──────┬──────     ─┬─  ────┬────
     *       │            │            │       └── constructor call
     *       │            │            └────────── allocates memory on heap
     *       │            └─────────────────────── reference var (on stack)
     *       └──────────────────────────────────── type
     *
     * Steps that happen internally when 'new' is called:
     *   Step 1 → JVM allocates memory on the HEAP for the object's fields.
     *   Step 2 → Constructor is called to initialise those fields.
     *   Step 3 → Memory address (reference) is returned and stored
     *             in the reference variable on the STACK.
     */

    class CreateObjectsDemo {
        public static void main(String[] args) {

            // creating object 1
            Class.Student s1 = new Class.Student();
            s1.name = "Priya";
            s1.age  = 20;

            // creating object 2 — completely INDEPENDENT of s1
            Class.Student s2 = new Class.Student();
            s2.name = "Arjun";
            s2.age  = 22;

            s1.displayInfo();  // Name: Priya | Age: 20 | GPA: 0.0
            s2.displayInfo();  // Name: Arjun | Age: 22 | GPA: 0.0
        }
    }

}
