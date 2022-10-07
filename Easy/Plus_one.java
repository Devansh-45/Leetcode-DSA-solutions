/*
    Author -: Devansh Desai
    Date -: 17-08-2022

    Problem -: Plus one
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit
     of the integer. The digits are ordered from most significant to least significant in left-to-right order.
     The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.
*/
package Easy;

import java.util.Arrays;

public class Plus_one {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {

        int len = digits.length;
        for(int i=len-1;i>=0;i--){
            if(i<=len-2){
                // This is used to check weather we need to add further or not
                // So now if after adding 1 to last digit or any specific digit the result becomes 0 so we have
                // a carry and we need to add 1 further to 1 digit before it
                if(digits[i+1]!=0) {
                    // now if the digit after the given digit is not zero then break the loop we have the
                    // answer or else continue further
                    break;
                }
            }
            if(digits[i]==9){
                digits[i] = 0;
                // if digit is 9 then we make it 0 then add 1 to last second digit
            }else{
                digits[i] += 1;
                // If the digit is not 9 then we normally add 1 in it
                if(i==0){
                    break;
                }
            }
        }
        if(digits[0]==0){
            // If the array was 999 then we need to add one extra bit starting with 1 so we make use to another
            // array whose first digit we define as 1
            int[] new_arr = new int[len+1];
            new_arr[0] = 1;
            System.arraycopy(digits, 0, new_arr, 1, len);
            return new_arr;
        }
        return digits;
    }
}
