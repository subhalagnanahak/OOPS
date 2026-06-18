package oopslect1.java;

import java.util.Scanner;

public class assingment3 {
//    Assignment 3: Operators
//    Take 2 numbers from user.
//  Perform:
//    Addition
// Subtraction
//    Multiplication
// Division
//    Modulus

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 1st number : ");
        int num1 = input.nextInt();
        System.out.println("Enter the 2nd number : ");
        int num2 = input.nextInt();

        System.out.println("Addition " + (num1 + num2));
        System.out.println ("Substraction " +  (num1 - num2));
        System.out.println ("Divison"  + num1 / num2 );
        System.out.println ("Remainder " + num1 % num2);
        System.out.println ("multiplication " + num1 * num2);


    }
}
