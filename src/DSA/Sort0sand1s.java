package DSA;

public class Sort0sand1s {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (nums[i] == 0) {
                i++;
            } else if (nums[j] == 1) {
                j--;
            } else {
                nums[i] = 0;
                nums[j] = 1;
                i++;
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Sort0sand1s sol = new Sort0sand1s();
        int[] nums = {0, 1, 0, 1, 1, 1 , 1 ,1 , 0, 1};
        int[] result = sol.sortArray(nums);
        System.out.println(java.util.Arrays.toString(result));
    }
}