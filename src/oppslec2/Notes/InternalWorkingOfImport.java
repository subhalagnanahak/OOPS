package oppslec2.Notes;

import java.util.ArrayList;

public class InternalWorkingOfImport {

    // ─────────────────────────────────────────────────────────────
// 8. INTERNAL WORKING OF import STATEMENT
// ─────────────────────────────────────────────────────────────
// Let's trace what happens when Java sees:
//      import java.util.ArrayList;
//
// STEP 1 — COMPILE TIME
//   Compiler sees 'ArrayList' in your code
//   It looks up the import list → finds java.util.ArrayList
//   It resolves the short name  →  replaces ArrayList with java.util.ArrayList
//   It checks the .class file exists in the classpath
//   If not found → "cannot find symbol" compile error
//
// STEP 2 — RUNTIME (ClassLoader)
//   JVM uses ClassLoader to load the class when it's first needed
//   ClassLoader searches: Bootstrap → Extension → Application classpath
//   The class bytecode is loaded into METHOD AREA of memory
//   Static members & static blocks are initialized at this point
//
// STEP 3 — NO actual code is copied
//   import is just A "nickname agreement" — it shortens your source code
//   The real class lives in the JDK/jar, not inside your file
//
// CIRCULAR IMPORTS? — Java handles it (unlike some languages)
//   A imports B, B imports A → JVM loads lazily, no infinite loop
//
// Same statement demo:
    class ImportWorkingDemo {
        void demo() {
            // Both lines do EXACTLY the same thing at runtime
            java.util.ArrayList<String> list1 = new java.util.ArrayList<>(); // fully qualified
            ArrayList<String> list2 = new ArrayList<>();                      // with import
            // 'import' just saved you from typing 'java.util.' every time
        }
    }

}
