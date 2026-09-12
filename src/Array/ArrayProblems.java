package Array;

public class ArrayProblems {

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

    public static int [] Count0and1(int [] array) {
        int zero = 0;
        int one = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zero++;
            } else if (array[i] == 1) {
                one++;
            }
        }
        int  result[]  = {zero, one} ;
        return result ;
    }





    public static void main(String[] args) {   // program's entry point (added 'public' — required for it to run)
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

        int [] arr =  {0,1,0,1,0 , 0 ,1};
        int ans [] = Count0and1(arr);
        System.out.println("Zero Count =" + ans[0]);
        System.out.println("One Count =" + ans[1]);

    }
}