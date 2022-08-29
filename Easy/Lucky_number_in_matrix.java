/*
    Author -: Devansh Desai
    Date -: 26-08-2022

    Problem -: Lucky Numbers in a Matrix
    A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its
     column.

*/
package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lucky_number_in_matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{3,7,8},{9,11,13},{15,16,17}};
    }
        public List<Integer> luckyNumbers (int[][] matrix) {
            int numRows = matrix.length;
            int numCols = matrix[0].length;
            int[] rowMin = new int[numRows];
            int[] colMax = new int[numCols];
            Arrays.fill(rowMin, Integer.MAX_VALUE);
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    rowMin[i] = Math.min(matrix[i][j], rowMin[i]);
                    colMax[j] = Math.max(matrix[i][j], colMax[j]);
                }
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    if (rowMin[i] == colMax[j]) {
                        list.add(matrix[i][j]);
                    }
                }
            }
            return list;
        }

}
