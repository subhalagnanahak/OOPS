package basics.assingments1;

import java.util.Scanner;

public class CheckEquals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number A ");
        int A = input.nextInt();

        System.out.print("Enter number B ");
        int B = input.nextInt();

        System.out.print("Enter number C ");
        int C = input.nextInt();

        if(A==B && A==C && B==C) {
            System.out.println("ALL OF THE ABOVE NUMBERS ARE EQUAL");

        }else {
                System.out.println("ALL OF THE ABOVE NUMBERS ARE NOT EQUAL");
            }

        }



    }

