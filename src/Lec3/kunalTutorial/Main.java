package Lec3.kunalTutorial;

public class Main {
    public static void main(String[] args) {

   //     Box box1 = new Box(4.6 , 55 ,5);
        // Box box2 = new Box(box1); // polymorphism



//        System.out.println("The box is " + box1.l + "" + box1.w + "" + box1.h);
//
//        BoxWeight box3 = new BoxWeight();
//      BoxWeight box4 = new BoxWeight(2 , 3, 4 , 5 ) ;
//
//        System.out.println(box3.h + " " + box3.weight );

        Box box5 = new BoxWeight(2,3,4,6);
        System.out.println (box5);

        //there are many variables in both parent and child classes
        // you are given acess to variable that are in that are in the ref. type i.e BoxWeight
        //hence, you should have acess to weight variable
        //this also means , that the one you are trying to  acess should be initialised
        //but here, when the obj itself
        BoxWeight  box6 = new BoxWeight(2,3,4,6);
        System.out.println (box6);


   }
}
