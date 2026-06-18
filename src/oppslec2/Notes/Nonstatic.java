package oppslec2.Notes;

public class Nonstatic {
    // ─────────────────────────────────────────────────────────────
// 4. NON-STATIC MEMBER INSIDE A STATIC CONTEXT
// ─────────────────────────────────────────────────────────────
// - Static method has NO 'this' → it doesn't know which object to use
// - So you CANNOT directly access a non-static member in a static method
// - Solution → create an object INSIDE the static method

    static class NonStaticInStatic {

        static int y = 20;   // static field
        int x = 10;          // non-static field

        static void staticMethod() {

            // System.out.println(x);   // ❌ COMPILE ERROR — no object, so no 'x'
            System.out.println(y);      // ✅ fine — y belongs to class

            // SOLUTION : make an object inside the static method
            NonStaticInStatic obj = new NonStaticInStatic();
            System.out.println(obj.x);  // ✅ now we have an object, so we can access x
        }

        void instanceMethod() {
            // instance method CAN access both — it always has 'this'
            System.out.println(x);   // ✅
            System.out.println(y);   // ✅
        }
    }
}
