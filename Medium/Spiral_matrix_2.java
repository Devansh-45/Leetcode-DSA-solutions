/*
    Author -: Devansh Desai
    Date -: 6-10-2022

    Problem -: Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral
    order.
*/
package Medium;

import java.util.Arrays;

public class Spiral_matrix_2 {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(Arrays.toString(generateMatrix(num)));
    }
    public static int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int Startrow =0, Startcol =0, Endrow = n-1, Endcol = n-1;
        int count =1;
        while (count<=(n*n)){
            // Adding elements in first row
            for (int index = Startcol; index <=Endcol ; index++) {
                mat[Startrow][index] = count++;
            }
            Startrow++;
            // Adding in last column
            for (int index = Startrow; index <=Endrow ; index++) {
                mat[index][Endcol] = count++;
            }
            Endcol--;
            // Adding in last row
            for (int index =Endcol ; index >=Startcol ; index--) {
                mat[Endrow][index] = count++;
            }
            Endrow--;
            // Adding in first column
            for (int index = Endrow; index >=Startrow ; index--) {
                mat[index][Startcol] = count++;
            }
            Startcol++;
        }
        return mat;
    }
}
