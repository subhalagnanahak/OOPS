package basics.Array;

public class Sum {                              // CLASS: declares a public class named Sum
    //        (file must be saved as Sum.java)

    public static void main(String[] args) {      // METHOD: entry point of the program
        //   public → accessible from anywhere
        //   static → runs without creating an object
        //   void   → returns nothing
        //   String[] args → command-line arguments (unused here)

        int sum = 0;                              // VARIABLE: stores running total, starts at 0

        int arr[] = { 2, 4, 6, 8, 10 };           // ARRAY: declares int array, initialized with 5 values
        //   arr[0]=2, arr[1]=4, arr[2]=6, arr[3]=8, arr[4]=10

        for (int i = 0; i < arr.length; i++) {    // LOOP: iterates from i=0 to i=4 (arr.length = 5)
            //   i < arr.length → stops before going out of bounds
            //   i++ → increments i after each iteration

            sum += arr[i];                        // OPERATION: sum = sum + arr[i]
            //   adds current element to running total

        }                                          // end of for loop

        System.out.println("Sum = " + sum);       // OUTPUT: prints text + value of sum
        //   println adds a newline after printing
    }                                              // end of main method
}                                                  // end of class