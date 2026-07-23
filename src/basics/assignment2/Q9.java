package basics.assignment2;

import java.util.Scanner;

public class Q9 {
    //9. Write a program to check whether a student is eligible for scholarship or notes per the below rules.
    //1. If math marks>=90 then eligible.
    //2. If agr>=60 then eligible.
    //3. If science & math both>=75 then eligible
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   // public static void main(String[] args) {
        System.out.print("Enter maths marks : ");
        int math = sc.nextInt();

        System.out.print("Enter science marks");
        int science = sc.nextInt();

        System.out.print("Agreggated marks ");
        int agr = sc.nextInt();

        if( math >= 90 ||  science >= 60 || (science >= 75 && math >= 75)) {
            System.out.println("eligible");

        }else {
            System.out.println(" not eligible");
        }

    }

}
