/*
    Author -: Devansh Desai
    Date -: 18-08-2022

    Problem -: Richest Customer Wealth

*/
package Easy;

public class Richest_customer_wealth {
    public int maximumWealth(int[][] accounts) {
        int[] sums = new int[accounts.length];
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){

            for(int j=0;j<accounts[i].length;j++){
                sums[i] += accounts[i][j];
            }
            if(sums[i]>Max){
                Max = sums[i];
            }
        }
        return Max;
    }
}
