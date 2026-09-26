package Array;

public class Sort0sand1s {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        while (i > j) {
            if (nums[i] == 1 && nums[j] == 0) {
                //swap
                nums[i] = 0;
                nums[j] = 1;
            }
            if (nums[i] > nums[j]) {
                // j ko age le jana hai
                i++;
            }
            if (nums[i] < nums[j]) {
                //j ko decrement kardo
                j--;

            }
        }
        return nums;
    }
}

