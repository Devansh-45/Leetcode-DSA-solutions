/*
    Author -: Devansh Desai
    Date -: 27-08-2022

    Problem -: Maximum Subarray
    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the
    largest sum and return its sum.

*/
package Medium;

public class Maximum_subarray {
    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            currSum += num;
            // Add the array in the currsum
            if (num > currSum) {
                currSum = num;
                /* Now if after adding the array element the curSum is less than the num then the num will be
                // currSum that specifies that if you have added the first three elements of the array and they
                are negative so the currSum is -4 and if you add 3 to it will be -1 and now after applying if
                condition the currSum will be 3 so the currSum will start the adding from new array element
                called as a subarray */
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
