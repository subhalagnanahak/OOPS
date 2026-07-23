package basics.assignment2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        //write a program to display the eligibility of a candidate in NCC if his/her height
        // 160 and also weight> 65 then only eligibility passible. (Use of logical operator)

        Scanner sc = new Scanner(System.in);
        System.out.println("enter height ");
                int n = sc.nextInt();
        System.out.println("enter weight ");
        int m = sc.nextInt();

        // LOGIC - eligibility check using logical AND (&&)
        if (n >= 160 && m > 65) {
            System.out.println("eligble");


        }else {
            System.out.println("not eligble");
        }

        sc.close();
    }
}
