package Array;

public class ArrayManipulation {
    static void ReverseArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            // swap

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // i move forward

            i++;
            //j move backward
            j--;

        }
        // now the array hasb= been reversed
        //print
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    static void rightShift(int[] arr) {
        int n = arr.length;
        int temp =  arr[n - 1];

        for (int i = n - 1 ; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }


    static void main( ) {
        int arr[] = {1, 2, 3, 4, 5};
       // ArrayManipulation.ReverseArray(arr);
     rightShift(arr) ;
         for (int a : arr) {
             System.out.print(a + " ");
         }
        }

    }

