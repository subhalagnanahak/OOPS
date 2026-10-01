package DSA;

import java.util.ArrayList;
import java.util.List;

public class missingElementandDuplicate {

    public List<List<Integer>> findMissingAndDuplicate(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        int duplicate = -1;
        int missing = -1;

        // Marking
        for (int index = 0; index < n; index++) {

            int value = Math.abs(nums[index]);
            int position = value - 1;

            // Already negative means duplicate
            if (nums[position] < 0) {
                duplicate = value;
            } else {
                nums[position] = -nums[position];
            }
        }

        // Find missing number
        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) {
                missing = i + 1;
            }
        }

        List<Integer> duplicateList = new ArrayList<>();
        duplicateList.add(duplicate);

        List<Integer> missingList = new ArrayList<>();
        missingList.add(missing);

        ans.add(duplicateList);
        ans.add(missingList);

        return ans;
    }

    public static void main(String[] args) {

        missingElementandDuplicate finder =
                new missingElementandDuplicate();

        int[] nums = {4, 3, 2, 7, 1, 6, 5, 2};

        List<List<Integer>> ans =
                finder.findMissingAndDuplicate(nums);

        System.out.println("Duplicate: " + ans.get(0));
        System.out.println("Missing: " + ans.get(1));
    }
}