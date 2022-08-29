/*
    Author -: Devansh Desai
    Date -: 22-08-2022

    Problem -: Maximum Population Year

*/
package Easy;

import com.sun.org.glassfish.external.amx.AMX;

public class Maximum_population_year {
    public static void main(String[] args) {
        int[][] person = {{1960,1961},{1962,1970},{1980,1981},{1951,1960}};
        System.out.println(maximumPopulation(person));
    }
    public static int maximumPopulation(int[][] logs) {
        int[] mark_year = new int[101];
        // Taking an empty array that will mark the birth and death of the person
        // Array length is 102 as there is a constraint in question that the range of years will be
        // 1950<=years<=2050
        for (int i=0;i< logs.length;i++){
            mark_year[logs[i][0]-1950]++;
            mark_year[logs[i][1]-1950]--;
            // Marking birth year as 1 and death year as -1
        }
        int Max =mark_year[0]; int temp = 1950;
        for (int i = 1; i <=100 ; i++) {
            mark_year[i] += mark_year[i-1];
            // This will mark that a given x person if alive for which of the following years
            // So if a person was born in 1950 and died in 1960 then this array will mark 1 for 1950 to 1959
            // and 0 for 1960 death year ( alive in 1960 = 1960 + 1959)
            if (mark_year[i]>Max){
                Max = mark_year[i];
                temp = i + 1950;
            }
        }
        return temp;
    }
}
