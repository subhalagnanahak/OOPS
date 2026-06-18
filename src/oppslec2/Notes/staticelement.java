package oppslec2.Notes;

public class staticelement {

// ─────────────────────────────────────────────────────────────
// 2. STATIC ELEMENT  (field, method, block, nested class)
// ─────────────────────────────────────────────────────────────
// - 'static' means → belongs to the CLASS, not to any OBJECT
// - One copy shared by ALL objects of the class
// - You can call it without creating an object  →  ClassName.method()

    class StaticDemo {

        // static field — ONE copy for the whole class
        static int objectCount = 0;

        // static block — runs ONCE when the class is loaded into memory
        // use it to initialise complex static stuff
        static {
            System.out.println("StaticDemo class loaded!");
            // objectCount = 0;  ← already set above, but you can do it here too
        }

        // non-static field — each object has its OWN copy
        String name;

        StaticDemo(String n) {
            this.name = n;
            objectCount++;   // shared counter — every new object bumps this up
        }

        // static method — no 'this', no object needed
        static void showCount() {
            System.out.println("Total objects created: " + objectCount);
        }
    }

/* USAGE (inside main or test)
   StaticDemo.showCount();        // no object needed
   StaticDemo a = new StaticDemo("Alice");
   StaticDemo b = new StaticDemo("Bob");
   StaticDemo.showCount();        // prints 2
*/


}
