/*
    Author -: Devansh Desai
    Date -: 13-08-2022

    Problem -: Remove Duplicates from Sorted Array

*/
package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Remove_duplication_from_sorted_array {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,0,1,1,1,2,2,3,3,3,4,4};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
//    public int removeDuplicates(int[] nums) {
//        int startIdx = 0;
//        int endIdx = 0;
//        while (endIdx < nums.length) {
//            int currValue = nums[endIdx];
//            // Assign first value to the currvalue
//            while (endIdx < nums.length && nums[endIdx] == currValue) {
//                // This loop will increment the value of endIdx till it find the new element position
//                endIdx++;
//            }
//            nums[startIdx++] = currValue;
//            // Add non-duplicate value to the array
//        }
//        return startIdx;
//    }
    //Optimal Solution
    public static int removeDuplicates(int[] nums) {
        int index1=1;
        int index2=1;
        int previousNum1=nums[0];
        while(index2<nums.length){
            if(previousNum1>=nums[index2]){
                 index2++;
                 // This loop will skip the duplicate elements in the array
            }
            // Now previousNum1 and nums[index1] will be same so it will first go to else statement
            else if(previousNum1<nums[index1]){
                //Now previousNum1 will be assigned to nums[index1] whose value is basically equal to
                // nums[index2] so after this it will agin check for duplication
                previousNum1=nums[index1];
                index1++;
            }
            else{
                // Here as index2 is pointing at position of non-duplicate array so the value of that will be
                // assigned to nums[index1]
                nums[index1]=nums[index2];
            }
        }
        return index1;
    }
}

