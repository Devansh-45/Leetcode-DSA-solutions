/*
    Author -: Devansh Desai
    Date -: 19-08-2022

    Problem -: How Many Numbers Are Smaller Than the Current Number

*/
package Easy;

import java.util.Arrays;

public class Numbers_smaller_than_current_number {
    public static void main(String[] args) {
        int[] arr = new int[]{7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
//    public static int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] ans = new int[nums.length];
//        int counter;
//        for (int i = 0; i < nums.length; i++) {
//            counter =0;
//            for (int j=0;j< nums.length;j++){
//                if(nums[i]>nums[j]){
//                    counter++;
//                }
//            }
//            ans[i] = counter;
//        }
//        return ans;
//    }
    //Optimal solutions

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cumulative = new int[102];
        for(int i=0;i<nums.length;i++) {
            cumulative[nums[i]]++;
            // This will increment the position of nums[i] in cumulative
            // nums[i] =1 cumulative[1] = cum[1]+1;
        }
        int[] res = new int[nums.length];
        for(int i=1;i<=100;i++) {
            cumulative[i] = cumulative[i] + cumulative[i-1];
            //This loop is used to determine that how many numbers are smaller than the given number
            // Now if 5 is greater than 3 numbers then here cumulative[5] = 4
            // So we will print cumulative[4] instead of 5
        }

        for(int k=0;k<nums.length;k++) {
            if(nums[k]==0) {
                res[k] = 0;
                continue;
            }
            res[k] = cumulative[nums[k]-1];
        }
        return res;
    }
}
