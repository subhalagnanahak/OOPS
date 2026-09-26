package DSA;

import java.util.HashMap;

public class FindTheFirstRepeatingElement {
    public int findFirstRepeatingElement(int [] arr){
        HashMap<Integer, Integer> freq =  new HashMap<>();
        //frequency store
        for (int num : arr) {
            freq.put(num , freq.getOrDefault(num,0)+1);

        }
        for (int i : arr) {
            if (freq.get(i)>1 ) {
                return i;
            }
        }
        //agar koi bhi freq > 1 nahi hai
        return -1;

    }

    static void main(String[] args) {
        FindTheFirstRepeatingElement f = new FindTheFirstRepeatingElement();
        int [] arr = {1,2,3,4,5,3};
       int result = f.findFirstRepeatingElement(arr);
       System.out.println(result);


    }

}
