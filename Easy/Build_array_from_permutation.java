/*
    Author -: Devansh Desai
    Date -: 18-08-2022

    Problem -: Build Array from Permutation

*/
package Easy;

public class Build_array_from_permutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
