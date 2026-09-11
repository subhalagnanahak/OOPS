import java.sql.SQLOutput;
import java.util.Scanner;

public class BitwiseOperator {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: a");
        int a = sc.nextInt();
        System.out.println("Enter a number: b");
        int b = sc.nextInt();
        System.out.println("AND");
        System.out.println(a&b);  //AND
        System.out.println("OR");
        System.out.println(a|b); //OR
        System.out.println("XOR");
        System.out.println(a^b);  //XOR
       // System.out.println(a^(a&b)); // XOR + AND
        System.out.println("NOT");
        System.out.println(~a ); //NOT
        System.out.println("NOT");
        System.out.println(~b ); //NOT
        System.out.println("Left shift ");
        System.out.println(a<<b); // LEFT SHIFT
        System.out.println("Right shift ");
        System.out.println(a>>b); //RIGHT SHIFT
        System.out.println("Unsigned Right Shift ");
        System.out.println(a>>>b); //UNSIGNED RIGHT SHIFT
    }
}
