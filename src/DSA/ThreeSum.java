package DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> output = new ArrayList<>();

        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);


                        output.add(temp);


                    }
                }
            }

        }
        return output;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create array
        int[] nums = new int[n];

        // Take array input
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create object
        ThreeSum obj = new ThreeSum();

        // Call threeSum method
        List<List<Integer>> result = obj.threeSum(nums);

        // Print output
        System.out.println("Triplets whose sum is 0:");

        System.out.println(result);

        sc.close();
    }
}