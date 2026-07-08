package basics.assingments;

import java.util.Scanner;

public class Greatest {
    public static void main (String[] args) {

    //WAP cheack the greatest number
    Scanner sc = new Scanner(System.in);

    System.out.println ("Enter no. A : " );
    int  a = sc.nextInt();

    System.out.println ("Enter no. B : " );
    int b = sc.nextInt();

        System.out.println ("Enter no. C : " );
        int c = sc.nextInt();

        if(a>=b && a>=c) {
            System.out.println("A is greater than B and C");
        }else if(b>=a && b>=c) {
            System.out.println("B is greater than A and C");
        }else if (c>=a && a>=b) {
            System.out.println("C is greater than A and B");
        }



}
}