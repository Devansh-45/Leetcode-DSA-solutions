/*
    Author -: Devansh Desai
    Date -: 20-08-2022

    Problem -:  Transpose Matrix

*/
package Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Transpose_matrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(Arrays.toString(transpose(mat)));
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] trans_mat = new int[matrix[0].length][];
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                trans_mat[col][row] = matrix[row][col];
            }
        }
        return trans_mat;
    }
}
