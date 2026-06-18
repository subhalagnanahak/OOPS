package oppslec2.Notes;

public class This_keyword {

// ─────────────────────────────────────────────────────────────
// 5. 'this' KEYWORD INSIDE STATIC
// ─────────────────────────────────────────────────────────────
// - 'this' = reference to the CURRENT OBJECT
// - static context has NO current object → 'this' doesn't exist there
// - Using 'this' inside static = COMPILE ERROR

    class ThisInStatic {

        int value = 100;

        static void staticMethod() {
            // System.out.println(this.value);  // ❌ COMPILE ERROR
            // 'this' cannot be referenced from a static context

            // Why? Because staticMethod() can be called as:
            // ThisInStatic.staticMethod()  — without any object at all!
            // So Java doesn't know what 'this' would refer to.
        }

        void instanceMethod() {
            System.out.println(this.value);   // ✅ 'this' is fine here
            // 'this' is implicitly available in every instance method
        }
    }

}
