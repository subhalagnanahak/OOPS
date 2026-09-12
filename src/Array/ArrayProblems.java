package Array;

public class ArrayProblems {
//    static double getAvg(int[] arr) {
//        double sum = 0;
//        for (int i : arr) {
//            sum += i;
//
//        }
//
//        int size = arr.length;
//        double avg = sum / size;
//        return avg;
//
//    }

    // multiply each element by 10
    // Method that takes an array and returns a new array with each element multiplied by 10
//    static int[] multiplyBy10(int[] arr) {
//        int size = arr.length;              // get the number of elements in the input array
//        int newArray[] = new int[size];     // create a new empty array of the same size
//
//        for (int i = 0; i < size; i++) {    // loop through each index from 0 to size-1
//            int element = arr[i];           // get the element at current index i from original array
//            int newElement = element * 10;  // multiply that element by 10
//            newArray[i] = newElement;       // store the new value at the same index in newArray
//        }

    // RETURN UPDATED ARRAY
    //  return newArray;
    // send the completed new array back to the caller

    //linear search
//    static boolean findTarget(int arr[], int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return true;
//            }
//        }
//
//        return false;
//    }

    // Find the maximum elemnt in array

//    public static int getMax(int[] arr) {
//        int maxi = arr[0];              // start by assuming the first element is the max
//
//        for (int i : arr) {            // for-each loop: i takes each value in arr, one by one
//            if (i > maxi) {             // if current value is bigger than current max
//                maxi = i;               // update max
//            }
//        }
//
//        return maxi;                    // send back the largest value found
//
//
//    }

    public static int [] getPosNegSum(int[] arr) {
        int PosSum = 0;
        int NegSum = 0;

        int i;
        for (i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0) {
                // if the element is > 0 its postitive

                PosSum += arr[i];


            } else {
                // if the element is < 0 which is negetive
                NegSum += arr[i];
            }



        }
        int ans[] = {PosSum, NegSum};
        return ans;

        //Return Sum of -ve and +ve number
    }

    public static void main(String[] args) {   // program's entry point (added 'public' — required for it to run)
       int[] arr = {2, -4, 10, -3};
       int ans [] =  getPosNegSum(arr);
       System.out.println("positive Sum  " + ans [0]);
       System.out.println("negative Sum  " + ans [1]);



//        int result = getMax(arr );
//        System.out.println(result);


        // original array of numbers
//         boolean result = findTarget(arr, 4);
//         System.out.println(result);
//        int ans[] = multiplyBy10(arr);          // call the method, store the resulting array in ans
//
//        System.out.println("printing ans");     // print a label before showing results
//
//        for (int i : ans) {                     // for-each loop: i takes each value in ans, one by one
//            System.out.print(i + " ");          // print each value followed by a space


//            System.out.println(getAvg(arr));
//            System.out.println(newArray);
    }
}
