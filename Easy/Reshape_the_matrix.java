/*
    Author -: Devansh Desai
    Date -: 29-08-2022

    Problem -: Reshape the Matrix
    You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of
     columns of the wanted reshaped matrix.
*/
package Easy;

import java.util.Arrays;

public class Reshape_the_matrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2},{3,4}};
        int r =1;
        int c =4;
        System.out.println(Arrays.toString(matrixReshape(arr,r,c)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        int row_count =0,col_count=0;
        int total_element = row*col;
        int[][] reshape_mat = new int[r][c];
        if (total_element!= r*c){
            // Checking if the given array can be converted to desired shape
            return mat;
        }else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j <col ; j++) {
                    reshape_mat[row_count][col_count] = mat[i][j];
                    // Assigning values in reshape_mat
                    col_count++;
                    if (col_count>c-1){
                        // if the size of col_count increases than the total length then it will increase the row_count
                        // and reinitialize the col_count
                        row_count++;
                        col_count =0;
                    }
                }
            }
        }
        return reshape_mat;
    }
}