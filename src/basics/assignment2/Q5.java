package basics.assignment2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter a number");
        int b = sc.nextInt();

        if ( a> b) {
            System.out.println(a + " is Bigger than " + b);

        }else{
            System.out.println(b + " is greater than " + a);
        }
    }
}

