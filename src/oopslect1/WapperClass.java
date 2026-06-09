package oopslect1;

public class WapperClass {
//FINAL CLASS---

//    final is a keyword using which you can prevent your content to be modified.
//    final variables have to be initialized on declaration.
//    It only guarantees "no change" when the instance variables are of primitive data type and not reference data type.
//    If a reference data type has a final modifier attached to it then the value of that instance variable will never change, i.e. the reference to the object will never change. It will always refer to the same object but the value of that object can still be modified / changed.
//    This happens because this immutability that you can't change the value is only holding true for primitive data type.
//    What if the object itself is final

//    final constructors.Student kunal = new constructors.Student();
//    kunal.name ="new name" // this is possible despite the presence of the "final" keyword.
//// this happens because the kunal here is an object and not a primitive data type.
//// so here, we are allowed to change the values but we are NOT allowed to reassign the "kunal" reference variable. Therefore :
//    kunal =new
//
//    Student("new object"); // this is NOT allowed
//
//    package com.hitarth.oop;

    /// /
//import java.util.Arrays;

    //public class Main {
    static void main(String[] args) {
        Integer num = 45; // now this num is an object and it's not a primitive
        // This num object comes with it's own functions. Type "num." and you'll be shown a list of all the performable functions.

        //num.toString()  //  num.byteValue() // and so on

        swap(num);
        System.out.println(num); // → 45
        // even tho num is an object it still wasn't swapped
        // This happens because Integer class is a final class
        // Final is a keyword using which you can prevent your content to be modified, a constant I should say.

        // for e.g.
        final int increase = 2; // now this integer cannot be modified
        // increase++; // → error
    }

    static void swap(Integer a) {
        a = 23;
    }
}



