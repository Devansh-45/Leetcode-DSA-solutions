/*
    Author -: Devansh Desai
    Date -: 13-08-2022

    Problem -: Remove Duplicates from Sorted Array

*/
package Easy;

public class Remove_duplication_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int startIdx = 0;
        int endIdx = 0;
        while (endIdx < nums.length) {
            int currValue = nums[endIdx];
            while (endIdx < nums.length && nums[endIdx] == currValue) {
                endIdx++;
            }
            nums[startIdx++] = currValue;
        }
        return startIdx;
    }
}
}
