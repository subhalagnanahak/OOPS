package lect1assingment.java;

import java.util.Scanner;
//Take marks as input.
//Condition:
//90+ = Grade A
//80+ = Grade B
//70+ = Grade C
//60+ = Grade D
//Below 60 = Fail

public class assingment4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = input.nextInt();

        if (marks >= 90) {
            System.out.print("Grade A");
        }
            else if (marks >= 80) {
                System.out.print("Grade B"); }

                else if (marks >= 70) {
                    System.out.print("Grade C");}

                    else if (marks >= 60) {
                        System.out.print("Grade D");}

                        else
                            System.out.println("Fail");
                        }

                    }
