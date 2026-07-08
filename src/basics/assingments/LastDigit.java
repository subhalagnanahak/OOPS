package basics.assingments;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no. ");
        int n = sc.nextInt();

        System.out.println("Last digit number is : " + n%10);


    }
}
