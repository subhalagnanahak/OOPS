package oopslect1.java.notes;

public class ConstructorOverloading {

// ════════════════════════════════════════════════════════════════════════════
//   CONSTRUCTOR OVERLOADING
// ════════════════════════════════════════════════════════════════════════════

    /*
     * CONSTRUCTOR OVERLOADING
     * ────────────────────────
     * Having multiple constructors in the SAME class with
     * DIFFERENT parameter lists (different number or types of parameters).
     *
     * Java decides which constructor to call based on the arguments
     * you pass at the time of object creation — this is called
     * COMPILE-TIME POLYMORPHISM / METHOD OVERLOADING.
     *
     * Useful when:
     *   • Sometimes you have all the data, sometimes only partial data.
     *   • You want to provide convenient shortcuts.
     */

    static class StudentOL {  // OL = Overloaded

        String name;
        int    age;
        double gpa;

        // Constructor 1 — no args (all defaults)
        StudentOL() {
            this.name = "Unknown";
            this.age  = 0;
            this.gpa  = 0.0;
        }

        // Constructor 2 — name only
        StudentOL(String name) {
            this.name = name;
            this.age  = 0;
            this.gpa  = 0.0;
        }

        // Constructor 3 — all fields
        StudentOL(String name, int age, double gpa) {
            this.name = name;
            this.age  = age;
            this.gpa  = gpa;
        }

        void display() {
            System.out.println(name + " | " + age + " | " + gpa);
        }
    }

    class OverloadingDemo {
        public static void main(String[] args) {
            StudentOL s1 = new StudentOL();                    // Constructor 1
            StudentOL s2 = new StudentOL("Priya");             // Constructor 2
            StudentOL s3 = new StudentOL("Arjun", 22, 8.9);   // Constructor 3

            s1.display(); // Unknown | 0 | 0.0
            s2.display(); // Priya   | 0 | 0.0
            s3.display(); // Arjun   | 22 | 8.9
        }
    }
}
