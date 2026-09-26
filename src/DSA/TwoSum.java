package DSA;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        int ans [] = {} ;
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{ 9 , 7 ,8, 1 ,7, 11, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();

        int[] answer = twoSum.twoSum(nums, target);

        System.out.println(Arrays.toString(answer));
    }
}
