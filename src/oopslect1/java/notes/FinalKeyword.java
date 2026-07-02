package oopslect1.java.notes;

public class FinalKeyword {

// ════════════════════════════════════════════════════════════════════════════
// "final" KEYWORD
// ════════════════════════════════════════════════════════════════════════════

    /*
     * 'final' restricts change.  Can be applied to:
     *   (A) Variable → value cannot change after first assignment (constant)
     *   (b) Method   → cannot be overridden in A subclass
     *   (c) Class    → cannot be extended (subclassed)
     */

    // ── (A) final VARIABLE ───────────────────────────────────────────────────
    class Constants {

        /*
         * Convention: ALL_CAPS_WITH_UNDERSCORES for constants.
         * 'static final' = shared by all instances (class-level constant).
         */
        static final double PI           = 3.14159265358979;
        static final int    MAX_STUDENTS = 60;

        public static void main(String[] args) {
            System.out.println(PI);
            System.out.println(MAX_STUDENTS);

            // PI = 3.0;  // COMPILE ERROR: cannot assign A value to final variable
        }
    }

    // ── (b) final METHOD ─────────────────────────────────────────────────────
    class Shape {
        /*
         * Subclass CANNOT override this method.
         * Use when the behaviour must stay consistent for correctness/security.
         */
        final void draw() {
            System.out.println("Drawing shape...");
        }
    }

    class Square extends Shape {
        // void draw() { }  // COMPILE ERROR: draw() is final in Shape
    }

    // ── (c) final CLASS ──────────────────────────────────────────────────────
    /*
     * Cannot create A subclass of A final class.
     * Java's  String, Integer, Double  are all final classes.
     */
    static final class Singleton {
        static final Singleton INSTANCE = new Singleton();
        private Singleton() { }
    }

// class ExtendSingleton extends Singleton { }  // COMPILE ERROR


}
