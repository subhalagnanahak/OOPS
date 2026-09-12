package Array;

public class ArrayLect2 {

    public static int[] Reverse(int[] arr) {
        //two pointer technique

        int newarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[arr.length - i - 1];

        }

        return newarr ;
    }


    static void main() {

        int[] Reverse = {1, 2, 3, 4, 5};
        System.out.println("reverse array" );

    }
}