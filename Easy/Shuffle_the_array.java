/*
    Author -: Devansh Desai
    Date -: 18-08-2022

    Problem -: Shuffle the Array

*/
package Easy;

import java.util.Arrays;

public class Shuffle_the_array {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    //    public static int[] shuffle(int[] nums, int n) {
//        int[] ans = new int[2*n];
//        int start = 0, end = n;
//        for(int i=0;i<n*2;i++){
//            if(i%2==0){
//                ans[i] = nums[start];
//                start++;
//            }else {
//                ans[i] = nums[end];
//                end++;
//            }
//        }
//        return ans;
//    }
    //Optimal Solution
    public static int[] shuffle(int[] nums, int n) {
        int[] answer = new int[2 * n];
        for (int i = 0; i < n; i++) {
            answer[i * 2] = nums[i];
            answer[(i * 2) + 1] = nums[i + n];
        }
        return answer;
    }
}