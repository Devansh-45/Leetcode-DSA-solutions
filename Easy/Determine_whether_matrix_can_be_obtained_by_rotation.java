/*
    Author -: Devansh Desai
    Date -: 23-08-2022

    Problem -: Determine Whether Matrix Can Be Obtained By Rotation
    To rotate a matrix by 90 degree then first of all do transpose of matrix and then exchange their first and
    last column.

*/
package Easy;

import java.util.Arrays;

public class Determine_whether_matrix_can_be_obtained_by_rotation {
    public static void main(String[] args) {
        int[][] mat = new int[][]{{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = new int[][]{{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat,target));
    }
    public static boolean findRotation(int[][] mat, int[][] target)
    {
        boolean[] c= new boolean[4];
        Arrays.fill(c,true);
        int n=mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]!=target[i][j]) c[0]=false;
                // Initially checking if the target array is same as given array
                if(mat[i][j]!=target[n-j-1][i]) c[1]=false;
                // It checks for 270 degree rotation
                if(mat[i][j]!=target[n-i-1][n-j-1]) c[2]=false;
                // it checks for 180 degree rotation
                if(mat[i][j]!=target[j][n-i-1]) c[3]=false;
                // It checks for 90 degree rotation
            }
        }
        return c[0]||c[1]||c[2]||c[3];
    }
}
