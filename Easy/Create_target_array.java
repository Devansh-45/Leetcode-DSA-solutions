/*
    Author -: Devansh Desai
    Date -: 19-08-2022

    Problem -: Create Target Array in the Given Order
    Given two arrays of integers nums and index. Your task is to create target array under the following rules:

    Initially target array is empty.
    From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
    Repeat the previous step until there are no elements to read in nums and index.
*/
package Easy;

import javax.script.ScriptEngine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Create_target_array {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,3,4};
        int[] index = new int[]{0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(arr,index)));

    }
//    public static int[] createTargetArray(int[] nums, int[] index) {
//        int[] target = new int[nums.length];
//        int[] mark_index = new int[102];
//        int temp;
//        for (int i = 0; i < index.length; i++) {
//                while (mark_index[index[i]]!= 0){
//                    temp = mark_index[i+1];
//                    mark_index[i+1] = mark_index[i];
//                }
//            mark_index[index[i]]=nums[i];
//        }
//        for (int i = 0; i < 102 ; i++) {
//            while (mark_index[i]>1){
//                mark_index[i+1] +=1;
//                mark_index[i] -=1;
//            }
//        }
//
//    }
public static int[] createTargetArray(int[] nums, int[] index) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
        list.add(index[i], nums[i]);
    // Index first element should always start with 0 because in list you cannot add element at desired
    // position if list is empty.
    }
    int[] ans = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
        ans[i] = list.get(i);
        //If the list 1st Element has value 2 and if we want to insert the element at 1 again then
        // It will add new element at 1st position and shift all the elements by 1 in list
    }
    return ans;
}
}
