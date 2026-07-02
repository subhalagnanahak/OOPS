package oppslec2.Notes;

public class InitializationOfStaticVariable {
    // 6. INITIALIZING A STATIC VARIABLE
// ─────────────────────────────────────────────────────────────
// Three ways to initialize A static variable:

    class StaticInitDemo {

        // WAY 1 — direct initialization (simplest)
        static int a = 5;

        // WAY 2 — static block  (use when initialization needs logic)
        static int b;
        static double result;
        // WAY 3 — static method called at declaration
        static int c = initC();

        static {
            b = 10;
            result = Math.sqrt(b);   // complex logic → belongs in static block
            System.out.println("Static block ran. b=" + b + ", sqrt=" + result);
        }

        static int initC() {
            return 42;    // any logic can go here
        }

        // IMPORTANT ORDERING RULE:
        // Static fields and static blocks run TOP → BOTTOM as written
        // So you can't use 'b' above the line where b is declared
    }
}
