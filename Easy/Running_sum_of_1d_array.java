/*
    Author -: Devansh Desai
    Date -: 17-08-2022

    Problem -: Running Sum of 1d Array

*/
package Easy;

public class Running_sum_of_1d_array {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            sums[i] = sums[i-1] + nums[i];
        }
        return sums;
    }
}
