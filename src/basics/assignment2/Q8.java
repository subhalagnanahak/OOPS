package basics.assignment2;

import java.util.Scanner;

public class Q8 {
    //Program to check whether a year is leap year or not.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println ("enter the year ") ;
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 ) {
            System.out.println(year + " is a leap year");

        }else {
            System.out.println(year + " is not a leap year");
        }

    }
}
