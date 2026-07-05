public static class variables {


   /* Variables in Java -
    Variables are containers to store data in memory. Each variable has a name, type and value.
    It is the basic unit of storage in a program. Java has 4 types of variables.
    */
/*  TYPES OF VARIABLE
    1) Local Variables: Declared inside a method, constructor, or block. Accessible only within that block.
    2) Instance Variables: Declared inside a class but outside any method. Each object of the class has its own copy.
    3) Static Variables: Declared with the static keyword inside a class. Shared by all objects of the class.
    4) Final Variables: Declared with final keyword. Value cannot be changed once assigned. */


      // public class variables {

    // Instance variable (belongs to each object)
    int instanceVar = 10;

    // Static variable (shared across all objects of the
    // class)
    static String staticVar = "I am static";

    public void showVariables()
    {
        // Local variable (declared inside a method)
        int localVar = 5;

        System.out.println("Instance Variable: "
                           + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args)
    {
        // Creating object
        variables obj1 = new variables();
        obj1.showVariables();

        // Accessing static variable directly using class
        // name
        System.out.println(
            "Accessing Static Variable via class: "
            + variables.staticVar);
    }
}


  /*
  Rules for variable naming -
  1) case sensetivy [age / AGE]
  2) Starting Character [a , A , _, $ ]
  3) Subsequent Character [0 to 9 , _ $]
  4) no reserved keywords [class , static etc]
  5) length [no limit , but meaningful names needed]
  6 ) Convention : camelCase, Uppper Caes for Constants etc
   */

    static void main() {

        //create //declare

        int age ;
        System.out.print("Enter age: ");
        //assign value
        age= 10;
        age = 11;
        System.out.println("The age is "+age);

        //define or intialize
        int totalMarks = 20 ;
        System.out.println("The total marks is "+totalMarks);

        //Case Sensetive
        int weight = 80 ;
        int WEIGHT = 90;
        System.out.println("The weight is "+weight);
        System.out.println("The weight is "+WEIGHT);

        //Starting letter
        int marks = 10;
        int MARKS = 20;
        int _marks = 12;

        //Subsequent Letters
        int height5 = 22;
        int height_love = 33;
        int height$12Lover = 44;
        int height_= 22;
        int height$ = 23 ;

    /* Categories of Reserved Words
    1. Active Keywords (48)
    These keywords define Java's syntax and functionality:

    Data Types: boolean, byte, char, short, int, long, float, double, void

    Control Flow: if, else, switch, case, default, for, while, do, break, continue, return

    Exception Handling: try, catch, finally, throw, throws

    OOP & Modifiers: class, interface, extends, implements, abstract, final, static, public, private, protected, native, synchronized, volatile, transient, strictfp

    Other: new, this, super, instanceof, package, import, enum, assert

    2. Unused Reserved Keywords (2)
   const - Reserved but not used (use final instead)
    goto - Reserved but not used
    3. Reserved Literals (3)
    While technically literals, these cannot be used as identifiers:

     true
    false
    null

    */
        //No Reserved Keyword
        //int class = 22

        //length
        int hellojeekaisehaiapsab = 101;
        int a = 1 ;
        int b = 2 ;
        int c = 3 ;

        //camelCase
        int myNameisLove = 51;

        //int titalMark = 100;

        //constants
        int Day_morning = 7 ;
        /*
                Summary
    Concept	Meaning
    Variable	Named memory location
    Literal	Fixed value assigned to a variable
    Static Typing	Type must be declared before use
    Integer Literal	Whole number
    Floating Literal	Decimal or exponential number
    Character Literal	Single character
    String Literal	Text
    Boolean Literal	true / false
                 */

    }


