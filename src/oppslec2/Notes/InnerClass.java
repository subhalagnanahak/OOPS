package oppslec2.Notes;

public class InnerClass {

// ─────────────────────────────────────────────────────────────
// 7. INNER CLASSES
// ─────────────────────────────────────────────────────────────
// A class defined INSIDE another class
// 4 types: (A) Regular inner  (b) Static nested  (c) Local  (d) Anonymous

    class Outer {

        static int staticVal = 99;
        int outerVal = 10;

        void methodWithLocalClass() {

            // (c) LOCAL INNER CLASS — defined inside A method
            // - visible only inside that method
            class Local {
                void greet() {
                    System.out.println("Hello from Local class. outerVal=" + outerVal);
                }
            }
            new Local().greet();   // create & use immediately

            // (d) ANONYMOUS CLASS — class with no name, defined & instantiated in one shot
            // - great for one-time use of an interface or abstract class
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Anonymous class running!");
                }
            };
            r.run();
        }

        // (b) STATIC NESTED CLASS
        // - does NOT need an Outer object
        // - CANNOT access outer's non-static members directly
        static class StaticNested {
            void show() {
                // System.out.println(outerVal);   // ❌ no outer object
                System.out.println("staticVal = " + staticVal); // ✅ can access static
            }
        }

        // (A) REGULAR INNER CLASS
        // - needs an Outer object to exist
        // - can access outer's non-static & static members
        class Inner {
            void show() {
                System.out.println("outerVal = " + outerVal);   // ✅ direct access
                System.out.println("staticVal = " + staticVal); // ✅
            }
        }
    }

/*  HOW TO CREATE:
    Outer o = new Outer();
    Outer.Inner  inner        = o.new Inner();       // needs outer object
    Outer.StaticNested nested = new Outer.StaticNested(); // NO outer object needed
*/

}
