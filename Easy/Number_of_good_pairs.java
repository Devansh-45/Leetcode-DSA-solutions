/*
    Author -: Devansh Desai
    Date -: 19-08-2022

    Problem -:  Number of Good Pairs
    Given an array of integers nums, return the number of good pairs.
    A pair (i, j) is called good if nums[i] == nums[j] and i < j.

*/
package Easy;

import java.util.Arrays;

public class Number_of_good_pairs {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
    //Optimal solution

    public static int numIdenticalPairs(int[] nums) {
        int[] arr = new int[100];
        for(int num : nums){
            arr[num-1]++;
        }
        int ans=0;
            for(int n : arr){
                ans += n*(n-1)/2;
            }
        return ans;
    }

//    public static int numIdenticalPairs(int[] nums) {
//        int repeat=0;
//        for (int i = 0; i < nums.length; i++) {
//                for(int j=i+1;j<nums.length;j++){
//                        if (nums[i]==nums[j]) {
//                            repeat++;
//                        }
//                }
//            }
//
//        return repeat;
//    }
}
