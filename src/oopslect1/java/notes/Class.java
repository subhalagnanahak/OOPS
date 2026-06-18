package oopslect1.java.notes;

public class Class {

// ════════════════════════════════════════════════════════════════════════════
// 1.  CLASS
// ════════════════════════════════════════════════════════════════════════════

    /*
     * WHAT IS A CLASS?
     * ─────────────────
     * A class is a BLUEPRINT / TEMPLATE that describes:
     *   • What data an object will hold  → fields (instance variables)
     *   • What an object can do          → methods
     *
     * No memory is allocated just by defining a class.
     * Memory is only allocated when you create an OBJECT from the class.
     *
     * SYNTAX:
     *   [access_modifier] class ClassName {
     *       // fields
     *       // constructors
     *       // methods
     *   }
     *
     * RULES:
     *   • The filename MUST match the public class name  →  Student.java
     *   • Class names use PascalCase  →  MyClass, BankAccount, StudentRecord
     */

    public static class Student {

        // ── Fields (instance variables) ──────────────────────────────────────────
        String name;    // every Student object will have its own 'name'
        int    age;     // every Student object will have its own 'age'
        double gpa;

        // ── Method ───────────────────────────────────────────────────────────────
        public void displayInfo() {
            System.out.println("Name: " + name + " | Age: " + age + " | GPA: " + gpa);
        }
    }
}
