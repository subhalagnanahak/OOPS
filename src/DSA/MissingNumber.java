package DSA;

 class MissingNumber {
    public int missingNumber(int[] nums) {
        int xorSum = 0;
        //xor with all the array elements
        for (int n: nums) {
            xorSum = xorSum ^ n;

        }
        //xor with all the elemsnt in the range
        int n = nums.length ;
        for (int i =0 ; i<= n ; i++) {
            xorSum = xorSum ^ i;
        }
        //ans ajaega
        return xorSum;
    }

     public static void main(String[] args) {

         int[] nums = {3, 0, 7, 1};

         MissingNumber obj = new MissingNumber();

         int answer = obj.missingNumber(nums);

         System.out.println("Missing number: " + answer);
     }
 }

