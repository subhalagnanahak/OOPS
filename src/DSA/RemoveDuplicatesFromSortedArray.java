package DSA;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        int i = 0;
        int j = 0;
        int n = nums.length ;

        while(j < n) {
            if (nums[i] == nums[j]) {
                j++;

            }else {
                //if no mtch
                i++;
                nums[i] = nums[j];
                j++ ;
            }
        }
        return i+1 ;

    }
    public static void main(String[] args) {

        RemoveDuplicatesFromSortedArray obj =
                new RemoveDuplicatesFromSortedArray();

        int[] nums = {1, 1, 2, 2, 3};

        int k = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.println("Array: " + Arrays.toString(Arrays.copyOf(nums, k)));
    }

    }
