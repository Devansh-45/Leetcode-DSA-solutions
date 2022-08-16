/*
    Author -: Devansh Desai
    Date -: 11-08-2022

    Problem -: Remove desired Element

*/
package Easy;

public class Remove_element {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
