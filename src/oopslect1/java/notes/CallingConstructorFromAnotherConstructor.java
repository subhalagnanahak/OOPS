package oopslect1.java.notes;

public class CallingConstructorFromAnotherConstructor {



// ════════════════════════════════════════════════════════════════════════════
//  CALLING A CONSTRUCTOR FROM ANOTHER CONSTRUCTOR — this()
// ════════════════════════════════════════════════════════════════════════════

    /*
     * this()  →  CONSTRUCTOR CHAINING
     * ─────────────────────────────────
     * 'this(args)' lets one constructor CALL ANOTHER constructor
     * in the same class.
     *
     * WHY USE IT?
     *   Avoids duplicating initialisation logic — write it once in A
     *   "base" constructor and have others delegate to it.
     *
     * RULES:
     *   • this() MUST be the FIRST statement in the constructor body.
     *   • Cannot use both this() and super() — only one can be first.
     *   • Cannot create circular chaining (A → B → A) — infinite loop.
     */

    static class Employee {

        String name;
        int    id;
        String department;
        double salary;

        // Base constructor — does all the real work
        Employee(String name, int id, String department, double salary) {
            this.name       = name;
            this.id         = id;
            this.department = department;
            this.salary     = salary;
        }

        // Convenience: department defaults to "General"
        Employee(String name, int id) {
            this(name, id, "General", 30000.0);
            // ↑ calls base constructor — must be FIRST line
        }

        // Convenience: only name — rest get defaults
        Employee(String name) {
            this(name, 0);  // calls the constructor above
        }

        void display() {
            System.out.println(id + " | " + name + " | " + department + " | " + salary);
        }
    }

    class ConstructorChainingDemo {
        public static void main(String[] args) {
            Employee e1 = new Employee("Priya", 101, "Engineering", 75000);
            Employee e2 = new Employee("Arjun", 102);          // uses default dept & salary
            Employee e3 = new Employee("Ravi");                // uses all defaults

            e1.display(); // 101 | Priya  | Engineering | 75000.0
            e2.display(); // 102 | Arjun  | General     | 30000.0
            e3.display(); //   0 | Ravi   | General     | 30000.0
        }
    }

}
