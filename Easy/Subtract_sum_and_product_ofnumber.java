/*
    Author -: Devansh Desai
    Date -: 15-08-2022

    Problem -: Subtract the Product and Sum of Digits of an Integer

*/
package Easy;

public class Subtract_sum_and_product_ofnumber {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int copy = n;
        while (copy > 0) {
            sum += copy % 10;
            copy /= 10;
        }
        int prod = 1;
        copy = n;
        while (copy > 0) {
            prod *= copy % 10;
            copy /= 10;
        }
        return prod - sum;
    }
}
