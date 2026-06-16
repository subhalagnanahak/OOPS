package oppslec2.staticExample;

public class Human {

    static long population;
    int age;
    String name;
    int salary;
    boolean married;

    Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        population += 1;

    }


    Human(int age, String name, int salary) {
        this(age, name, salary, false);

    }

    static void message() {
        System.out.println("Hello World");
        //System . out . println (this . age ) ;   // cant use this keyword over here
    }


}
