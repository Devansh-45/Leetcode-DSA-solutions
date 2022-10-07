/*
    Author -: Devansh Desai
    Date -: 6-10-2022

    Problem -: Spiral Matrix
    Given an m x n matrix, return all elements of the matrix in spiral order.

*/
package Medium;

import java.util.ArrayList;
import java.util.List;

public class Spiral_matrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(spiralOrder(arr));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length , col = matrix[0].length;
        int temp = (row*col);
        List<Integer> Spiral_mat = new ArrayList<Integer>();
        int startRow = 0,startCol =0,Endrow = row-1,Endcol = col-1,total_element =0;
        while(total_element < temp){
            // Printing Starting row so we will increment the column and after printing the row we will increment
            // the Starting row value
            for (int i = startCol; i<=Endcol ; i++) {
                Spiral_mat.add(matrix[startRow][i]);
                total_element++;
            }
            startRow++;
            // Printing last column
            for (int i = startRow; i<=Endrow ; i++) {
                Spiral_mat.add(matrix[i][Endcol]);
                total_element++;
            }
            Endcol--;
            // Printing last row
            /* We will add an extra condition here of total element because if we remove this condition then
            it will add an extra element in a output where col are even and rows are odd when rows < col
            Only applied on mxn matrix
            The error would be that the Endcol and StartCol will both have a same value and it will go in
            below condition and print the last second traverse element again
             */
            for (int i = Endcol; total_element < temp && i>=startCol ; i--) {
                Spiral_mat.add(matrix[Endrow][i]);
                total_element++;
            }
            Endrow--;
            // Printing first col
            /* Here also we add an extra condition of total element because if both the rows and col are odd
               then it will add an extra element
               Error condition will be same as above loop
               Only applied on mxn matrix
             */
            for (int i = Endrow; total_element < temp && i>=startRow ; i--) {
                Spiral_mat.add(matrix[i][startCol]);
                total_element++;
            }
            startCol++;
        }
        return Spiral_mat;
    }
}
