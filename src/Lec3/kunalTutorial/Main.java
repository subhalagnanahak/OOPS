package Lec3.kunalTutorial;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box(4.6 , 55 ,5);
      Box box2 = new Box(box1); // polymorphism


        System.out.println("The box is " + box1.l + "" + box1.w + "" + box1.h);
//
//        BoxWeight box3 = new BoxWeight();
//      BoxWeight box4 = new BoxWeight(2 , 3, 4 , 5 ) ;
//
//        System.out.println(box3.h + " " + box3.weight );

   }
}
