package oopslect1.java.notes;

public class ThisKeyword {


// ════════════════════════════════════════════════════════════════════════════
//  "this" KEYWORD
// ════════════════════════════════════════════════════════════════════════════

    /*
     * WHAT IS 'this'?
     * ────────────────
     * 'this' is a reference to the CURRENT OBJECT —
     * the object on which the method/constructor is currently executing.
     *
     * WHY DO WE NEED IT?
     * ───────────────────
     * When a parameter has the SAME NAME as an instance variable,
     * the parameter SHADOWS (hides) the instance variable inside that method.
     *
     *   void setName(String name) {
     *       name = name;        // ❌ WRONG — assigning parameter to itself!
     *                           //    instance variable never gets set.
     *   }
     *
     *   void setName(String name) {
     *       this.name = name;   // ✅ CORRECT
     *       //  ↑              ↑
     *       //  instance var    parameter
     *   }
     *
     * USES OF 'this':
     *   1. Distinguish instance variable from parameter (shown above).
     *   2. Pass the current object as an argument: someMethod(this)
     *   3. Call another constructor: this(args)  ← covered next section
     */

    static class Circle {

        double radius;
        String color;

        Circle(double radius, String color) {
            this.radius = radius;  // this.radius = instance var | radius = param
            this.color  = color;
        }

        double area() {
            return Math.PI * this.radius * this.radius; // 'this.' optional here — no shadowing
        }

        void printDetails() {
            System.out.println("Radius: " + this.radius + " | Color: " + this.color
                    + " | Area: " + area());
        }
    }

    class ThisKeywordDemo {
        public static void main(String[] args) {
            Circle c1 = new Circle(5.0, "Red");
            Circle c2 = new Circle(3.0, "Blue");
            c1.printDetails();
            c2.printDetails();
        }
    }


}
