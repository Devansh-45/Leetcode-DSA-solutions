/*
    Author -: Devansh Desai
    Date -: 19-08-2022

    Problem -: Matrix Diagonal Sum

*/
package Easy;

import static java.lang.Math.ceil;

public class Matrix_diagonal_sum {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{5,6},{5,6}};
        System.out.println(diagonalSum(arr));
    }
    public static int diagonalSum(int[][] mat) {
        int start =1;
        int len = mat.length-1;
        if (len<1){
            return  mat[0][0];
        }
        int sum=mat[0][0]+mat[len][len]+mat[0][len]+mat[len][0];
        int end = len-1;
        while (start<=end){
            if(start==end){
                sum += mat[start][start];
            }else {
                sum += mat[start][start] + mat[end][end] +mat[start][end]+ mat[end][start];
            }
            start++;
            end--;
        }
        return sum;
        }
}
