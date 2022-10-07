/*
    Author -: Devansh Desai
    Date -: 19-08-2022

    Problem -: Find the Highest Altitude
    You are given an integer array gain of length n where gain[i] is the net gain in altitude between points
    i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
    Input: gain = [-5,1,5,0,-7]
    Output: 1
    Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
*/
package Easy;

public class Finding_highest_altitude {
    public static void main(String[] args) {
        int[] gain = new int[]{-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int Max = 0;
        if (gain[0]>Max){
            Max = gain[0];
        }
        for (int i = 1; i <gain.length ; i++) {
            gain[i] = gain[i-1]+gain[i];
            if (gain[i]>Max){
                Max = gain[i];
            }
        }
        return Max;
    }
}
