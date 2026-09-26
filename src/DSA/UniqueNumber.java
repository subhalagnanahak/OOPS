package DSA;

public class UniqueNumber {
    public int FindUniqueElement(int[] nums) {
        int xorSum = 0;
        for (int n : nums) {
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }

    public static void main(String[] args) {

        int[] nums = {4, 4, 1, 2, 1, 2 , 6};

        UniqueNumber obj = new UniqueNumber();

        int answer = obj.FindUniqueElement(nums);

        System.out.println(answer);
        }
    }
