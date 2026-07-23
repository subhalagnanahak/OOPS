package basics.assignment2;

import java.util.Scanner;

 public class Q7 {

    //Write a program to display the eligibility of a candidate in NCC if
    // his/her height >=160 and also weight>=65.then only eligibility possible. (Using Nested if)

   //Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height ");
        double h = sc.nextDouble();
        System.out.print("Enter weight ");
        double w = sc.nextDouble();

        if (h >=160) {
            if (w >= 65) {
                System.out.println("eligible");
            } else {
                System.out.println("not eligible -  weight criteria not met");
            }
        }
            else {
                System.out.println("eligible - height criteria not met");
            }
        }



    }


