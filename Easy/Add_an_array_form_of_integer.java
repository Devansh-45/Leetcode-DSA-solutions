/*
    Author -: Devansh Desai
    Date -: 20-08-2022

    Problem -:  Add to Array-Form of Integer

*/
package Easy;

import java.util.*;

public class Add_an_array_form_of_integer {
    public static void main(String[] args) {
        int[] num = {7};
        int k  = 993;
        System.out.println(addToArrayForm(num,k));
    }
    //Optimal Solution
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ls = new ArrayList<>();
        int len = num.length-1;
        while(len>=0 || k!=0){
            if(len>=0){
                k+=num[len--];
            }
            ls.add(k%10);
            k/=10;
        }
        Collections.reverse(ls);
        return ls;
    }
//    public static List<Integer> addToArrayForm(int[] num, int k) {
//        List<Integer> ls = new ArrayList<>();
//        int carry =0;
//            for (int i = num.length-1; i >=0 ; i--) {
//                int temp;
//                temp = k%10 + carry + num[i];
//                carry =0;
//                k/=10;
//                if (temp>9){
//                    carry = temp/10;
//                    temp-=10;
//                }
//                ls.add(temp);
//            }
//            while (k>0 || carry>0){
//                int temp = k%10 + carry;
//                carry =0;
//                if (temp>9){
//                    carry = temp/10;
//                    temp-=10;
//                }
//                ls.add(temp);
//                k/=10;
//            }
//        Collections.reverse(ls);
//        return ls;
//    }
}
