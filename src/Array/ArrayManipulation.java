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

    static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        ArrayManipulation.ReverseArray(arr);


    }
}
