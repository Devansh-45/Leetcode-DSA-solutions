/*
    Author -: Devansh Desai
    Date -: 22-08-2022

    Problem -: Find N Unique Integers Sum up to Zero
    To add unique integers in array and also the sum of element of array should be zero

*/
package Easy;

import java.util.Arrays;

public class Find_n_unique_integers_sum_upto_0 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int[] ans = new int[n];
        int len = n/2;
        for (int i = 0; i < len ; i++) {
            ans[i] = i+1;
            ans[len+i] = -(i+1);
            // We will add Symmetric element in array so both will be unique and both will cancel out each other
        }
        if (n%2!=0){
            // If the array is not odd then by suing above method all the elements of the array will be filled except
            // the last one so we initialize the last element as zero
            ans[n-1] = 0;
        }
        return ans;
    }
}
