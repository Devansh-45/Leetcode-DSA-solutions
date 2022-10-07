/*
    Author -: Devansh Desai
    Date -: 24-08-2022

    Problem -: Power of Three
    Given an integer n, return true if it is a power of three. Otherwise, return false.

    An integer n is a power of three, if there exists an integer x such that n == 3x.

*/
package Easy;

public class Power_of_three {
    public static void main(String[] args) {
        int n = 9;
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
