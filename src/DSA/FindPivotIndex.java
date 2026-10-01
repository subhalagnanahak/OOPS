package DSA;

import java.util.Scanner;

public class FindPivotIndex {
    public static int findPivotIndex(int[] nums) {
        int n = nums.length;
        //lefty sum array
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];


        // fill left sum wala array

        leftSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i];
        }
        //fill right sum wala array
        rightSum[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i];
        }
        //check for equality
        for (int i = n - 1; i >= 0; i--) {
            if (leftSum[i] == rightSum[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {1, 7, 3, 6, 5, 6};

        int result =  findPivotIndex (nums) ;
        System.out.println(result);
    }

}

