/*
    Author -: Devansh Desai
    Date -: 11-08-2022

    Problem -: Remove desired Element

*/
package Easy;

public class Remove_element {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,1,2,1,3};
        int val = 1;
        System.out.println(removeElement(arr,val));
    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // if we find the target element then we will replace the target element with the last element
                // and so on we will do further until all the target element gets removed and we get our array
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
