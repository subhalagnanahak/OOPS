package basics.assignment2;

import java.util.Scanner;

//6. Write a program to check the no if it is greater than 90
// then add two & display the result otherwise add five & display the result.

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        if (a > 90) {
            System.out.println("The number is greater than 90 , hence we add two " + (a + 2));
        } else {
            System.out.println("the no. is not greater then 90 , therefore we add 5 = " + (a + 5));

        }
    }
}