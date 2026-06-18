package oopslect1.java.notes;

public class Properties {

// ════════════════════════════════════════════════════════════════════════════
//   PROPERTIES OF AN OBJECT
// ════════════════════════════════════════════════════════════════════════════

    /*
     * Every object has 3 properties:
     *
     *  1. STATE
     *     ───────
     *     The data / values stored in the object's fields at a given moment.
     *     e.g. name = "Priya", age = 20, gpa = 9.1
     *
     *  2. BEHAVIOUR
     *     ──────────
     *     What the object can DO — defined by its methods.
     *     e.g. displayInfo(), deposit(), withdraw()
     *
     *  3. IDENTITY
     *     ─────────
     *     A unique identifier that the JVM assigns to each object internally
     *     (its memory address / reference).
     *     Two objects of the same class are still distinct — they have
     *     different identities even if their state is identical.
     */


// ════════════════════════════════════════════════════════════════════════════
//  The Student class we will use throughout these notes
// ════════════════════════════════════════════════════════════════════════════

    class Student {

        // ── instance variables (state) ───────────────────────────────────────
        String name;
        int    age;
        double gpa;

        // ── behaviour ────────────────────────────────────────────────────────
        void displayInfo() {
            System.out.println("Name: " + name + " | Age: " + age + " | GPA: " + gpa);
        }
    }


}
