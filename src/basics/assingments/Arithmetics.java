package basics.assingments;

import java.util.Scanner;

 class Arithmetics {
    public static void main (String args []) {
         //arithmetic operations of two numbers
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        System.out.print("Enter a number: ");
        int b = input.nextInt();

        System.out.println (a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
}
