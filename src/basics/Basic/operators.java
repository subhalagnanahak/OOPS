package basics.Basic;

public class operators {

    /* Operators in Java
Operators are symbols that perform specific operations on one or more operands (variables or values). They are used to perform calculations, comparisons, logical operations and manipulate data.

They are basically of 7 types:

Arithmetic Operators (+, -, *, /, %) –> Used to perform mathematical calculations on numeric values.
Relational Operators (==, !=, >, <, >=, <=) –> Used to compare two values and return a boolean result.
Logical Operators (&&, ||, !) –> Used to combine or reverse boolean conditions.
Assignment Operators (=, +=, -=, *=, /=, %=) –> Used to assign and update variable values.
Unary Operators (+, -, ++, --, !) –> Used to perform operations on a single operand.
Ternary Operator (condition ? value_if_true : value_if_false) –> Used as a shorthand for the if-else statement.
Bitwise Operators (&, |, ^, ~, <<, >>, >>>) –> Used to perform operations on binary bits of integer values.*/

  //  public class SimpleOperatorsDemo {
        public static void main(String[] args) {
            int a = 10, b = 3;

            // Arithmetic Operators
            System.out.println("a + b = " + (a + b));  // Addition
            System.out.println("a - b = " + (a - b));  // Subtraction

            // Relational Operator
            System.out.println("a > b ? " + (a > b));  // Greater than

            // Logical Operator
            boolean x = true, y = false;
            System.out.println("x && y = " + (x && y));  // Logical AND

            // Assignment Operator
            a += 5;  // a = a + 5
            System.out.println("a after += 5 : " + a);

            // Ternary Operator
            int max = (a > b) ? a : b;
            System.out.println("Maximum = " + max);
        }
    }

