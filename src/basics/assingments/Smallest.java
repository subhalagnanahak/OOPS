package basics.assingments;

import java.util.Scanner;

public class Smallest {

    public static void main(String[] args) {

        // WAP check the smallest number
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. A : ");
        int a = sc.nextInt();

        System.out.println("Enter no. B : ");
        int b = sc.nextInt();

        System.out.println("Enter no. C : ");
        int c = sc.nextInt();

        if (a <= b && a <= c) {
            System.out.println("A is smaller than B and C");
        } else if (b <= a && b <= c) {
            System.out.println("B is smaller than A and C");
        } else {
            System.out.println("C is smaller than A and B");
        }
    }
}