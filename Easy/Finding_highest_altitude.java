/*
    Author -: Devansh Desai
    Date -: 19-08-2022

    Problem -: Find the Highest Altitude

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
