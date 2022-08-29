/*
    Author -: Devansh Desai
    Date -: 24-08-2022

    Problem -: Power of Three

*/
package Easy;

public class Power_of_three {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerOfThree(n));
    }
    public static boolean isPowerOfThree(int n) {
        int left = 0;
        int right = n / 3;
        while (left <= right) {
            int mid = (left + right) / 2;
            double powValue = Math.pow(3, mid);
            if (powValue == n) {
                return true;
            }
            if (powValue > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

}
