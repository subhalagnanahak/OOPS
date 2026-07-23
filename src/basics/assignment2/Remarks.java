package basics.assignment2;

import java.util.Scanner;

public class Remarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int n = sc.nextInt();

        String remarks;


        if (n >= 60) {
            System.out.println("A");


    } else if (n >= 50 ) {
            System.out.println("B");
        }else if (n >= 40 ) {
            System.out.println("C");


        }else if (n >= 30 ) {
            System.out.println("D");

        }else{
            System.out.println("Fail");
        }

    }
}
