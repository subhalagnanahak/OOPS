package Array;

public class ArrayProblems {

    // Find the average of array elements
    static double getAvg(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    // Multiply each element of array by 10
    static int[] multiplyBy10(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i] * 10;
        }
        return newArray;
    }

    // Search for an element in an Array (Linear Search)
    static boolean findTarget(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Find the maximum element in an array
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    // Return Sum of +ve and -ve numbers
    public static int[] getPosNegSum(int[] arr) {
        int posSum = 0;
        int negSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posSum += arr[i];
            } else {
                negSum += arr[i];
            }
        }
        return new int[]{posSum, negSum};
    }

    // Count the number of Zeroes and Ones
    public static int[] countZeroesAndOnes(int[] arr) {
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else if (arr[i] == 1) {
                oneCount++;
            }
        }

        return new int[]{zeroCount, oneCount};
    }

    // Find first Unsorted Element in Array
    public static int findFirstUnsorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {   // current element smaller than previous = array broke order here
                return arr[i];
            }
        }
        return -1;   // -1 means the whole array is already sorted
    }

    public static void main(String[] args) {
        int[] arr = {2, -4, 10, -3};

        // Pos/Neg sum
        int[] posNeg = getPosNegSum(arr);
        System.out.println("Positive Sum: " + posNeg[0]);
        System.out.println("Negative Sum: " + posNeg[1]);

        // Zero/One count
        int[] zeroOne = {1, 0, 1, 1, 0, 0, 1};
        int[] countResult = countZeroesAndOnes(zeroOne);
        System.out.println("Zero count: " + countResult[0]);
        System.out.println("One count: " + countResult[1]);

        // First unsorted element
        int[] unsortedArr = {1, 3, 5, 2, 8};
        int firstUnsorted = findFirstUnsorted(unsortedArr);
        System.out.println("First unsorted element: " + firstUnsorted);
    }
}