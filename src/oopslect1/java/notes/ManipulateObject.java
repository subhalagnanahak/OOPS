package oopslect1.java.notes;

public class ManipulateObject {

// ════════════════════════════════════════════════════════════════════════════
//   HOW TO MANIPULATE OBJECTS?
// ════════════════════════════════════════════════════════════════════════════

    /*
     * "Manipulating" an object means changing its STATE after creation —
     * reading or writing its fields, or calling methods that modify it.
     *
     * Ways to manipulate:
     *   1. Direct field access  →  s1.name = "NewName";
     *   2. Via methods (setter) →  s1.setName("NewName");
     *   3. Via constructor      →  new Student("Priya", 20);
     *
     * Best practice: keep fields private and expose them through methods
     * (this is ENCAPSULATION — covered in later lectures).
     */

    class ManipulateDemo {
        public static void main(String[] args) {

            Class.Student s1 = new Class.Student();
            s1.name = "Priya";
            s1.age  = 20;
            s1.gpa  = 9.1;
            s1.displayInfo();  // state before manipulation

            // manipulate — change state
            s1.name = "Priya Sharma";
            s1.gpa  = 9.4;
            s1.displayInfo();  // state after manipulation

            // null reference — object not pointing anywhere
            Class.Student s2 = null;
            // s2.displayInfo();  // NullPointerException! — s2 points to nothing
        }
    }

}
