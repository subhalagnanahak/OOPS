package oppslec2.Notes;

public class StaticVariable {

// ─────────────────────────────────────────────────────────────
// 3. STATIC VARIABLE  (deep look)
// ─────────────────────────────────────────────────────────────
// - Stored in METHOD AREA (not heap) — one memory slot for the class
// - All objects READ & WRITE the same slot
// - Common uses : counters, config values, constants (static final)

    class BankAccount {

        // static final → CONSTANT  (all caps by convention)
        static final String BANK_NAME = "JavaBank";
        // static variable — shared bank interest rate for ALL accounts
        static double interestRate = 7.5;
        double balance;

        BankAccount(double bal) {
            this.balance = bal;
        }

        // change interest for every account at once
        static void updateRate(double newRate) {
            interestRate = newRate;   // one change → affects ALL objects
        }

        void showDetails() {
            // instance method CAN access static variable — no problem
            System.out.println(BANK_NAME + " | Rate: " + interestRate + " | Bal: " + balance);
        }
    }

/*  KEY POINT:
    BankAccount acc1 = new BankAccount(5000);
    BankAccount acc2 = new BankAccount(8000);
    BankAccount.updateRate(8.0);   // changes for BOTH acc1 and acc2
*/
}
