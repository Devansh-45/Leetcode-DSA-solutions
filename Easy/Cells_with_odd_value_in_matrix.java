/*
    Author -: Devansh Desai
    Date -: 23-08-2022

    Problem -: Cells with Odd Values in a Matrix

*/
package Easy;

public class Cells_with_odd_value_in_matrix {
    public static void main(String[] args) {
        int m = 2,n=3;
        int[][] index = new int[][]{{0,1},{1,1}};
        System.out.println(oddCells(m,n,index));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[] mark_row = new int[m];
        int[] mark_col = new int[n];
        int count_row=0,count_col=0;
        for (int i = 0; i < indices.length ; i++) {
            mark_row[indices[i][0]] = 1-mark_row[indices[i][0]];
            //Marking row and columns if any row occurs 2 time then it value will be gain reset to 0
            // 0 means even and 1 means odd
            mark_col[indices[i][1]] = 1-mark_col[indices[i][1]];
        }
        for (int i = 0; i < mark_row.length; i++) {
            count_row += mark_row[i];
            //counting total number of rows and columns
        }
        for (int i = 0; i <mark_col.length ; i++) {
            count_col += mark_col[i];
        }
        // formula to count odd value in matrix
        return (n-count_col)*count_row + (m-count_row) * count_col;
    }
}
