package oppslec2.staticExample;

/* The String class represents character strings. All string literals in Java programs, such as "abc",
are implemented as instances of this class.
Strings are constant; their values cannot be changed after they are created.
String buffers support mutable strings. Because String objects are immutable they can be shared.
For example:
String str = "abc"; */


//this is  A demo to show initialization of static variables

public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once ,
    // when the first obj is created
    // i.e when the class is loaded  for the first time .


    static {
        System.out.println(" i am in static block ");
        b = a * 5;

    }

    static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }


}
