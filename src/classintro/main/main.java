package classintro.main;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class main {


    // DUMB WAY OF CODING

    public void main(String[] args) {
        //store 5 roll nos.
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];


        // just declaring
//        Student kunal;
//        kunal = new Student();



        // data of 5 students : { roll no, name , marks }
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        //    ------------

     // Student moti = new Student ( 13 , "moti", 100 );
//
//        moti.rno = 13;
//        moti.name = "moti";
//        moti.mark = 100f;

        Student moti = new Student(15, "moti", 85.4f);
        Student rahul = new Student(18, "Rahul Rana", 90.3f);


        System.out.println (moti.rno);
        System.out.println (moti.name);
        System.out.println (moti .mark);
 // --------------------------------------
    }
}

// advance way of coding with class and constructor...........
// CLASS
//create class
//for each and every single student
 class Student {
    String name;
    int rno;
    float mark;


    //-------------------------------------------------
//    void greeting() {
//        System.out.println("Hello , my name is " + this.name);
//
//           }

    //-------------------------------------------------

    // we need a way to add the values of the above
    // properties object by object
    // we need word to access every ---- object
    // CONSTRUCTOR

    Student(int rno, String name, float mark) {

        this.rno = rno;
        this.name = name;
        this.mark = mark;


    }


    }

