/*
    Author -: Devansh Desai
    Date -: 18-08-2022

    Problem -: Kids With the Greatest Number of Candies
    There are n kids with candies. You are given an integer array candies, where each candies[i] represents the
     number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that
     you have.

    Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the
    extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

    Note that multiple kids can have the greatest number of candies.
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
                    //Finding kid with highest number of candies initially without adding the ExtraCandies
            }
        }
        for (int j=0;j<candies.length;j++) {
            if (candies[j]+extraCandies>Max){
                // Now after adding the extra Candies if the kid has equal or more number of candies than the
                //initial one then we will add true in the list
                out.add(true);
            }else {
                out.add(false);
            }
        }
        return out;
    }
}
