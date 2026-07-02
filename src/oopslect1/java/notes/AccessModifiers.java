package oopslect1.java.notes;

public class AccessModifiers {
    /* Access modifiers in Java are keywords that define where A class, method, variable, or constructor can be accessed from. They enforce encapsulation and control visibility in A program.

Java has four access modifiers:

• public
Accessible from anywhere in the program.

• protected
Accessible within the same package and in subclasses (even in different packages).

• default (no keyword)
Accessible only within the same package.

• private
Accessible only within the same class.

Example:

     */

    public int a = 10;       // accessible everywhere
    protected int b = 20;    // accessible in package + subclasses
    int c = 30;              // default: accessible only in same package
    private int d = 40;      // accessible only within this class

    public void showValues() {
        // All variables accessible here because it's the same class
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
// This code is complete and runnable; it demonstrates all four access levels.


