package oopslect1;

import java.util.Arrays;

public class constructors {
    // import java.util.Arrays;

    static class Student {

        int rno;
        String name;
        float marks;
    }

    /* ------------------------------------------------------ */
    /* creating a Class */

    static class Student2 {

        int rno;
        String name;
        float marks;

        Student2() {
            this.rno = 13;
            this.name = "Dev";
            this.marks = 23.12f;
        }

        Student2(int roll, String naam, float score) {
            rno = roll;
            name = naam;
            marks = score;
        }

        void changeName(String newName) {
            name = newName;
        }

        void greeting() {
            System.out.println("Hello! My name is " + this.name);
        }
    }

    /* ------------------------------------------------------ */

    public class ConstructorNotes {

        // It basically defines what happens when your object will be created.
        // It is a special "function" that runs when you create an object, and it allocates some variables.

        public static void main(String[] args) {

            /* declaring an Object */
            Student kunal;

            /* creating an object */
            Student student1 = new Student();

            /* null values */
            Student[] students = new Student[5];
            System.out.println(Arrays.toString(students));

            Student real = new Student();

            System.out.println(real);
            System.out.println(real.name);
            System.out.println(real.rno);
            System.out.println(real.marks);

            real.rno = 13;
            real.name = "Kunal";
            real.marks = 88.58f;

            System.out.println("\nAfter assigning values:");
            System.out.println(real.rno);
            System.out.println(real.name);
            System.out.println(real.marks);

            Student2 bruh2 = new Student2();

            System.out.println("\nDefault Constructor:");
            System.out.println(bruh2.name);

            bruh2.greeting();

            bruh2.changeName("Hitarth");

            System.out.println(bruh2.name);

            Student2 vishal = new Student2(12, "VishalP", 23.4f);

            System.out.println("\nParameterized Constructor:");
            System.out.println(vishal.name);

            Student2 dawg = new Student2(143, "Doggo", 89.23f);

            System.out.println(dawg.name);
        }
    } // <-- ConstructorNotes ends here
}
