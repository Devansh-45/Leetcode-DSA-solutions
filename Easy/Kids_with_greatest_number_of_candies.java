/*
    Author -: Devansh Desai
    Date -: 18-08-2022

    Problem -: Kids With the Greatest Number of Candies

*/
package Easy;

import java.util.ArrayList;
import java.util.List;

public class Kids_with_greatest_number_of_candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int Max = candies[0];
        // Using Interfaces
        List<Boolean> out = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
                if(candies[i]>Max){
                    Max = candies[i];
            }
        }
        for (int j=0;j<candies.length;j++) {
            if (candies[j]+extraCandies>Max){
                out.add(true);
            }else {
                out.add(false);
            }
        }
        return out;
    }
}
