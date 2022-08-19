/*
    Author -: Devansh Desai
    Date -: 18-08-2022

    Problem -:  Concatenation of Array

*/
package Easy;

public class Concatenation_of_array {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] ans = new int[2*size];
        for(int i=0;i<size;i++){
            ans[i] = nums[i];
            ans[(size)+i] = nums[i];
        }
        return ans;
    }
}
