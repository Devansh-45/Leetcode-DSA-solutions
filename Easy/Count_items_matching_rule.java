/*
    Author -: Devansh Desai
    Date -: 19-08-2022

    Problem -: Count Items Matching a Rule
    You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and
    name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue

*/
package Easy;

import java.util.ArrayList;
import java.util.List;

public class Count_items_matching_rule {
    public static void main(String[] args) {
        String[][] arr = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}} ;
        String rulekey = "color",rulevalue="silver";
//        System.out.println(countMatches(arr,rulekey,rulevalue));
    }
    //Optimal Solution
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx=-1,ans=0;
        if(ruleKey.equals("color")){
            idx=1;
        }
        else if(ruleKey.equals("type")){
            idx=0;
        }
        else{
            idx=2;
        }
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(idx).equals(ruleValue)){
                ans++;
            }
        }
        return ans;

    }
//    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        String[][] arr = items.stream()
//    .map(l -> l.stream().toArray(String[]::new))
//    .toArray(String[][]::new);
//        int count =0;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j < arr[i].length ; j++) {
//                if (ruleKey.equals("type")){
//                    if (ruleValue.equals(arr[i][1])){
//                        count +=1;
//                    }
//                }
//               else if (ruleKey.equals("color")){
//                    if (ruleValue.equals(arr[i][2])){
//                        count +=1;
//                    }
//                }else {
//                    if (ruleValue.equals(arr[i][3])){
//                        count +=1;
//                    }
//                }
//            }
//        }
//        return count;
//    }
}
