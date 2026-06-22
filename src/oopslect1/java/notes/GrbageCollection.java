package oopslect1.java.notes;

public class GrbageCollection {

// ════════════════════════════════════════════════════════════════════════════
// GARBAGE COLLECTION
// ════════════════════════════════════════════════════════════════════════════

    /*
     * WHAT IS GARBAGE COLLECTION (GC)?
     * ──────────────────────────────────
     * Java has AUTOMATIC MEMORY MANAGEMENT.
     * The JVM's Garbage Collector runs in the background and
     * AUTOMATICALLY FREES heap memory from objects that are no longer
     * reachable — i.e., no variable anywhere holds a reference to them.
     *
     * You do NOT need to free memory manually (unlike C/C++).
     *
     * AN OBJECT BECOMES ELIGIBLE FOR GC WHEN:
     *   1. Its reference is set to null          →  ref = null;
     *   2. Its reference goes out of scope
     *      (e.g., end of a method / block)
     *   3. Its reference is reassigned to another object
     *   4. Island of isolation — objects reference only each other
     *      but no external reference exists to the group
     *
     * HOW GC WORKS (simplified — Generational GC):
     *   • YOUNG GENERATION (Eden + Survivor) — new objects land here first.
     *                                           Minor GC runs here frequently.
     *   • OLD (TENURED) GENERATION           — long-lived objects move here.
     *                                           Major / Full GC runs here.
     *
     * finalize():
     *   Was called just before GC collected an object.
     *   DEPRECATED in Java 9, REMOVED in Java 18.
     *   Do NOT use. Use try-with-resources instead.
     */

    class GCDemo {
        public static void main(String[] args) {

            // ── Case 1: Set to null ───────────────────────────────────────────
            Class.Student s1 = new Class.Student();
            s1.name = "Priya";
            s1 = null;
            // "Priya" Student object now unreachable → eligible for GC

            // ── Case 2: Goes out of scope ─────────────────────────────────────
            {
                Class.Student temp = new Class.Student();
                temp.name = "Arjun";
            }  // temp out of scope → "Arjun" object eligible for GC

            // ── Case 3: Reference reassigned ──────────────────────────────────
            Class.Student s2 = new Class.Student();
            s2.name = "Raj";
            s2 = new Class.Student();   // old "Raj" object now unreachable → eligible
            s2.name = "Ravi";

            /*
             * System.gc() — DO NOT USE in production
             * ─────────────────────────────────────────
             * This is just a REQUEST to the JVM to run GC.
             * The JVM may IGNORE it.
             * Calling it manually can trigger a Full GC and hurt performance.
             * Trust the JVM — it knows when to collect.
             */
            // System.gc(); // just a hint — not guaranteed
        }
    }

}
