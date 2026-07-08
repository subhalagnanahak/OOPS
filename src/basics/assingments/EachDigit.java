package basics.assingments;

import java.util.Scanner;

public class EachDigit {
    //import java.util.Scanner;

   // public class LastDigit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a three digit no. ");
            int n = sc.nextInt();

            System.out.println("1st digit : " + (n/100));
            System.out.println("2nd digit : " + (n/10)%10 );
            System.out.println("3rd digit : " + (n%10));

        }
    }

