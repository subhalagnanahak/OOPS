package basics.assingments;

import java.util.Scanner;

public class CheckUnaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            n++;
            System.out.println(n);
        }
    }
}
