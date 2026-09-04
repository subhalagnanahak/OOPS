package Polymorphism;

//import static jdk.internal.org.jline.utils.Colors.s;

public class Main {
    public static void main(String[] args) {
//        calculator c = new calculator() ;
//        System.out.println (c.add( 2 , 3 ));
        // runtime polymorphism
        Circle c = new Circle();
        //c.draw();
         doDrawingStuff(c);

        Rectangle r = new Rectangle ();
      //  r.draw();

    }
    public static void doDrawingStuff(Shape s ) {    // dynamic method
        s.draw() ;


    }
}


