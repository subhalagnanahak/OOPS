package oppslec2.staticExample;

// static public class Inner  ... // wrong / error  outside class cant be static
class test { // inner class can be static


    String name;

    public test(String name) {
        this.name = name;

    }

    static void main(String[] args) {

        test a = new test("ankush ");
        test b = new test("babloo");

        System.out.println(a.name);
        System.out.println(b.name);
    }

    public class InnerClass {


//
//   static  class test { // inner class can be static
//
//
//
//         String name ;
//         public test(String name) {
//             this.name = name;
//
//         }

    }
}
