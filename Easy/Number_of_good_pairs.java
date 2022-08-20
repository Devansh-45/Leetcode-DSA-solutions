/*
    Author -: Devansh Desai
    Date -: 19-08-2022

    Problem -:  Number of Good Pairs

*/
package Easy;

import java.util.Arrays;

public class Number_of_good_pairs {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums) {
        int repeat=0;
        for (int i = 0; i < nums.length; i++) {
                for(int j=i+1;j<nums.length;j++){
                        if (nums[i]==nums[j]) {
                            repeat++;
                        }
                }
            }

        return repeat;
    }
}
