package Array;

import java.util.HashMap;

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
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;


    }

    static void printAlternative(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (i == j) {
                System.out.print(arr[i] + " ");
                return;
            } else {
                //i<j
                System.out.println(arr[i] + " ");
                i++;
                System.out.println(arr[j] + " ");
                j--;

            }
        }

    }


    // public class Solution {

    static int getMode(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = -1;
        int maxFreqKey = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyFrequency = freq.get(key);
            if (currentKeyFrequency > maxFreq) {
                maxFreq = currentKeyFrequency;
                maxFreqKey = currentKey;
            }
        }
        return maxFreqKey;
    }

    static int[] getHighestLowestFreqElement(int arr[]) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        //insert data
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
         //hashmap is ready
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyFreq = freq.get(key);
            if (currentKeyFreq > highestFreq) {
                //highest ko update  karna chahiye
                highestFreq = currentKeyFreq;
                highestNum = currentKey;
            }

        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyFreq = freq.get(key);
            if (currentKeyFreq < lowestFreq) {
                //its time to update
                lowestFreq = currentKeyFreq;
                lowestNum = key;
            }
        }
        int ans [] = {highestNum , lowestNum} ;
        return ans;

    }


        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 0, 0, 9 , 9 , 9 ,9 , 8, 0, 8, 8, 5};

            int ans = getHighestLowestFreqElement(arr);
//            int ans = getMode(arr);
//            System.out.println("Mode: " + ans);
        }
    }
//         ArrayManipulation.ReverseArray(arr);
//        rightShift(arr) ;
//        for (int a : arr) {
//            System.out.print(a + " ");

       // getMode (arr);

       // printAlternative(arr);







