/*
    Author -: Devansh Desai
    Date -: 16-08-2022

    Problem -: Given an integer array nums, find three numbers whose product is maximum and return the maximum
        product.

*/
package Easy;

import java.util.Arrays;

public class Maximum_of_three_products {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int right = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int left = nums[0] * nums[1] * nums[2];
        int mixed = nums[0] * nums[1] * nums[n - 1];
        return Math.max(right, Math.max(left, mixed));
    }
}
