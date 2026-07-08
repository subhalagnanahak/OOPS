package basics.assingments;

import java.util.Scanner;

public class ChangeTheNo {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n += 5;   // n = n + 5
        System.out.println(n);

        n -= 2;   // n = n - 2
        System.out.println(n);

        n *= 3;   // n = n * 3
        System.out.println(n);

        n /= 4;   // n = n / 4
        System.out.println(n);

        n %= 3;   // n = n % 3
        System.out.println(n);
    }
}