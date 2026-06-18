package oopslect1.java;

import java.util.Scanner;

public class assinment5 {
    static void main(String[] args) {
//        Assignment 5: Largest Number
//        Take 3 numbers.
//                Find largest using if-else.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        System.out.println("Enter number");
        int num2 = sc.nextInt();
        System.out.println("Enter number");
        int num3 = sc.nextInt();

            if (num1 >= num2 && num1 >= num3) {
                System.out.println("Largest Number = " + num1);
            }
            else if (num2 >= num1 && num2 >= num3) {
                System.out.println("Largest Number = " + num2);
            }
            else {
                System.out.println("Largest Number = " + num3);
            }

        }
    }
