/*
    Author -: Devansh Desai
    Date -: 12-08-2022

    Problem -: Check Palindrome

*/
package Easy;

public class Palindrome_number {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversedNum = 0;
        int xCopy = x;
        while (x > 0) {

            reversedNum = reversedNum * 10 + x % 10;
            x /= 10;
        }
        return reversedNum == xCopy;
    }
}
