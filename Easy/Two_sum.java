/*
    Author -: Devansh Desai
    Date -: 10-08-2022

    Problem -:

*/
package Easy;

public class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=1; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                if (nums[j]+nums[j-i] == target) {
                    return new int[]{j-i,j};
                }
            }
        }
        return null;
    }
}
