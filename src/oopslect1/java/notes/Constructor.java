package oopslect1.java.notes;

public class Constructor {

// ════════════════════════════════════════════════════════════════════════════
// [0:42:20]  JAVA CONSTRUCTORS
// ════════════════════════════════════════════════════════════════════════════

    /*
     * WHAT IS A CONSTRUCTOR?
     * ───────────────────────
     * A constructor is A special block of code that runs AUTOMATICALLY
     * every time an object is created using 'new'.
     *
     * PURPOSE: to INITIALISE the object's fields to valid starting values.
     *
     * RULES:
     *   • Name must be EXACTLY the same as the class name.
     *   • NO return type — not even void.
     *   • Called automatically by 'new' — you never call it manually.
     *   • Can be overloaded (multiple constructors, different parameters).
     *
     * SYNTAX:
     *   ClassName(parameters) {
     *       // initialisation code
     *   }
     */

    static class Box {

        double length;
        double width;
        double height;

        // Constructor
        Box(double length, double width, double height) {
            this.length = length;
            this.width  = width;
            this.height = height;
            System.out.println("Box created: " + length + " x " + width + " x " + height);
        }

        double volume() {
            return length * width * height;
        }
    }

    class ConstructorDemo {
        public static void main(String[] args) {
            Box b1 = new Box(3.0, 4.0, 5.0);  // constructor called automatically
            System.out.println("Volume: " + b1.volume()); // 60.0
        }
    }


}
