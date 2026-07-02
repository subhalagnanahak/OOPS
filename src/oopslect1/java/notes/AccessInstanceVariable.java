package oopslect1.java.notes;

public class AccessInstanceVariable {


// ════════════════════════════════════════════════════════════════════════════
//  HOW TO ACCESS INSTANCE VARIABLES?
// ════════════════════════════════════════════════════════════════════════════

    /*
     * Instance variables (fields) are accessed using the DOT OPERATOR  ( . )
     * on an object reference.
     *
     *   objectReference.fieldName
     *   objectReference.methodName()
     *
     * You CANNOT access instance variables without an object —
     * they don't exist until an object is created.
     *
     * Example:
     *   Student s1 = new Student();
     *   s1.name = "Priya";       ← accessing field
     *   s1.displayInfo();        ← calling method
     */

    class AccessDemo {
        public static void main(String[] args) {

            Class.Student s1 = new Class.Student();

            // accessing (writing) instance variables via dot operator
            s1.name = "Priya";
            s1.age  = 20;
            s1.gpa  = 9.1;

            // accessing (reading) instance variables
            System.out.println(s1.name);  // Priya
            System.out.println(s1.age);   // 20

            // calling A method on the object
            s1.displayInfo();  // Name: Priya | Age: 20 | GPA: 9.1
        }
    }

}
