package basics.assignment2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Write a program to check whether a no, is odd or even

        System.out.println("enter a number");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("the no. even number");
        }else{
            System.out.println("the no. odd number");
        }

    }
}
