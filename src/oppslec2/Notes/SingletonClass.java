package oppslec2.Notes;

public class SingletonClass {

// ─────────────────────────────────────────────────────────────
// 9. SINGLETON CLASS
// ─────────────────────────────────────────────────────────────
// GOAL: Ensure ONLY ONE object of this class ever exists
// Use case: DB connection, Logger, Config manager
//
// RECIPE:
//   1. private constructor  → block outside 'new'
//   2. private static instance field  → hold the one object
//   3. public static getInstance()  → return that one object

    // ENUM SINGLETON — simplest & safest (Josh Bloch's recommendation)
    enum EnumSingleton {
        INSTANCE;   // Java guarantees only one INSTANCE

        public void doSomething() {
            System.out.println("Enum Singleton at work!");
        }
    }

    static class Singleton {

        // 2. hold the ONE instance (lazy — created only when asked)
        private static Singleton instance = null;

        // 1. private constructor — nobody outside can do 'new Singleton()'
        private Singleton() {
            System.out.println("Singleton object created!");
        }

        // 3. the only door in — static so no object needed to call it
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();   // first call → create
            }
            return instance;                  // every call → return same object
        }

        public void showHashCode() {
            System.out.println("HashCode: " + this.hashCode());
            // If singleton works, hashCode is SAME every time you call getInstance()
        }
    }

    // THREAD-SAFE SINGLETON (real world — multiple threads)
    static class ThreadSafeSingleton {

        private static volatile ThreadSafeSingleton instance = null;
        // 'volatile' → ensures visibility across threads (no caching)

        private ThreadSafeSingleton() {
        }

        // Double-checked locking — efficient & thread-safe
        public static ThreadSafeSingleton getInstance() {
            if (instance == null) {                      // check 1 (no lock, fast)
                synchronized (ThreadSafeSingleton.class) { // lock only when needed
                    if (instance == null) {               // check 2 (inside lock)
                        instance = new ThreadSafeSingleton();
                    }
                }
            }
            return instance;
        }
    }
/* Usage:
   EnumSingleton.INSTANCE.doSomething();
*/

}
