/*
    Author -: Devansh Desai
    Date -: 14-08-2022

    Problem -: Find square root without any in-built exponent function or operator

*/
package Easy;

public class Sqrtx {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 2;
        int right = x / 2;
        while (left <= right) {
            int mid = (left + right) / 2;
            long square = ((long) mid) * mid;
            if (square > x) {
                right = mid - 1;
            } else if (square < x) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}
