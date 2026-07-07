package basics.Basic;

public class ControlStatement {
    /* Decision Making (Control Statements) in Java
       Decision-making (or control statements) are used to execute different blocks of code based on certain conditions. They allow a Java program to choose a path of execution depending on whether a condition is true or false.

      if: Executes a block if a condition is true.
      if-else: Chooses between two blocks based on a condition.
      if-else if-else: Tests multiple conditions sequentially.
      switch: Selects one block from multiple options based on a variable’s value. */


        public static void main(String[] args) {
            int number = 10;

            // if statement
            if (number > 0) {
                System.out.println("The number is positive.");
            }

            // if-else statement
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }

            // if-else-if ladder
            if (number < 0) {
                System.out.println("The number is negative.");
            } else if (number == 0) {
                System.out.println("The number is zero.");
            } else {
                System.out.println("The number is positive.");
            }

            // switch statement
            int day = 3;
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                default:
                    System.out.println("Other day");
            }
        }
    }

