package oopslect1.java.notes;

public class CreateConstructor {

// ════════════════════════════════════════════════════════════════════════════
// CREATING CONSTRUCTORS
// ════════════════════════════════════════════════════════════════════════════

    /*
     * You create your own constructor when you want to:
     *   • Force the caller to provide values at creation time.
     *   • Run specific setup logic when an object is born.
     *
     * IntelliJ shortcut to generate constructor:
     *   Alt + Insert  →  Constructor  →  select fields
     */

    static class Person {

        String name;
        int    age;

        // Parameterised constructor
        Person(String name, int age) {
            this.name = name;  // 'this.name' = instance variable
            this.age  = age;   // 'name'      = parameter
            System.out.println("Person created: " + name);
        }

        void greet() {
            System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
        }
    }

    public class CreateConstructorDemo {
        public static void main(String[] args) {
            Person p1 = new Person("Priya", 20);
            Person p2 = new Person("Arjun", 22);
            p1.greet();
            p2.greet();
            // Person p3 = new Person(); // COMPILE ERROR — default removed once we define our own
        }
    }

}
