/*
    Author -: Devansh Desai
    Date -: 8-09-2022

    Problem -: Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the
    value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.


*/
package Medium;

public class Reverse_integer {
    public static void main(String[] args) {
        int num = 1534236469;
        System.out.println(reverse(num));
    }
    // Using Wrapper class
    public static int reverse(int num) {

        int ans=0,rem=0;

        while(num!=0){
            rem=num%10;
            //i am not sure about this check condition

            ans=ans*10+rem;
            if(ans > Integer.MAX_VALUE/10 || ans< Integer.MIN_VALUE/10){
                return 0;
            }
            //if i place the check condition here ,it doesnt work why
            num=num/10;
        }
        return ans;
    }
//    public static int reverse(int x) {
//       int ans =0,temp=0;
//       if(x<0){
//           temp=1;
//           x = -(x);
//           // Converting value of x to positive
//       }
//       while (x>0){
//           int rem = x%10;
//           int mid_ans;
//           mid_ans = ans*10 + rem;
//           if ((mid_ans-rem)/10 != ans){
//               return 0;
//               // this will check the mid answer obtained is in the range of signed 32 bit
//           }
//           ans = mid_ans;
//           x /=10;
//       }
//       if (temp==1){
//           ans = -ans;
//           // If x was negative then ans will also be negative
//       }
//       return ans;
//    }
}
