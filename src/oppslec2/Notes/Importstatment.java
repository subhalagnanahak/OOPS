package oppslec2.Notes;

public class Importstatment {

    //─────────────────────────────────────────────────────────────
    // 1. IMPORT STATEMENT
// ─────────────────────────────────────────────────────────────
// - 'import' tells Java : "hey, I need something from another package"
// - Without import → you'd have to write full path every time
//   e.g.  java.util.ArrayList  instead of just  ArrayList
// - java.lang.*  is auto-imported by Java (no need to write it)
// - import only gives a name shortcut — does NOT copy the class

              import java.util.ArrayList;        // import ONE specific class
              import java.util.Scanner;
               import java.util .*;                 // wildcard → imports ALL classes in java.util
    // NOTE: wildcard is lazy but can cause name clashes
    // (avoid in big projects — prefer explicit imports)

    // static import → lets you use static members WITHOUT class name
              import static java.lang.Math.PI;   // now write PI instead of Math.PI
               import static java.lang.Math .*;    // imports ALL static members of Math
}

