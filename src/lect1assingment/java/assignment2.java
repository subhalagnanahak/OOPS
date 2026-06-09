package lect1assingment.java;

import java.util.Scanner;

public class assinment2 {
//    Assignment 2: Input from User
//    Take input:
//    Name
//    Age
//    College

    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name of students: ");
        String name = input.nextLine();
        System.out.print("Enter age of the students: ");
        int age = input.nextInt();
        System.out.print("Enter college of the students: :");
        String college = input.nextLine();
        input.nextLine(); // consume the leftover Enter key
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("college: " + college);

    }
}
