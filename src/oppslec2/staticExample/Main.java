package oppslec2.staticExample;

public class Main {
    static void main(String[] args) {

//        Human lagna = new Human(22, "lagna", 10000, false);
//        Human arpit = new Human(22, "arpit", 10000, false);
//
//        Human rahul = new Human(34, "rahul", 0);
//
//        System.out.println(rahul.population );
//        System.out.println(arpit.population );
//        System.out.println(lagna.population );

        Main obj = new Main();
        obj.greeting();


    }

    // this is not dependent on objects
    static void fun() {
        //      greeting(); // you cant use this because it requires an instance but the function you are
        //      using it in doses not depend on instances

        // you cannot access non static stuff without referencing their instance in a static context


        // hence , here i m referencing it
        Main obj = new Main();
        obj.greeting();


    }

    void fun2() {
        greeting();
    }

    // we know that something which is not static , belongto an object
    void greeting() {
        System.out.println("Hello World");
    }

}