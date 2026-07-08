package basics.assingments;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hieght : ");
        double height = sc.nextDouble();

        System.out.println("Enter radius : ");
        double radius = sc.nextDouble();

        System.out.println(" surface area of the cylinder : " + (2 * Math.PI * radius * ( height + radius)));


    }
}