package basics.assingments;

import java.util.Scanner;

public class CirclePerimeterArea {
   // import java.util.Scanner;

    public class Circle {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // circle AREA  formula = pie * (r*r)

            System.out.print("Enter radius: ");
            double radius = input.nextDouble();

            System.out.print("Area of Circle: " + (Math.PI * Math.pow(radius, 2)));
            System.out.println("Perimeter of Circle: " + (2 * Math.PI * radius));
        }

    }
}
