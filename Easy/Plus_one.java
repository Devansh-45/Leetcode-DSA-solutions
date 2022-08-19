/*
    Author -: Devansh Desai
    Date -: 17-08-2022

    Problem -: Plus one

*/
package Easy;

public class Plus_one {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i=len-1;i>=0;i--){
            if(i<=len-2){
                if(digits[i+1]!=0) {
                    break;
                }
            }
            if(digits[i]==9){
                digits[i] = 0;
            }else{
                digits[i] += 1;
                if(i==0){
                    break;
                }
            }
        }
        if(digits[0]==0){
            int[] new_arr = new int[len+1];
            new_arr[0] = 1;
            System.arraycopy(digits, 0, new_arr, 1, len);
            return new_arr;
        }
        return digits;
    }
}
