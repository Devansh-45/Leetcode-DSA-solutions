/*
    Author -: Devansh Desai
    Date -: 20-08-2022

    Problem -: Minimum Number of Refueling Stops

*/
package Hard;

public class Minimum_number_of_refueling_stops {
    public static void main(String[] args) {
        int target =100;
        int start = 10;
        int[][] station = {{10,25},{20,50},{75,25}};
        System.out.println(minRefuelStops(target,start,station));
    }
    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        int counter =-1,temp=0;
        if (stations.length==0){
            target = target-startFuel;
            counter++;
        }
        else {
            for (int i = 0; i <stations.length-1 ; i++) {
                if (stations[i][1]<stations[i+1][1]){
                    stations[i][1] = (stations[i][1]*stations[i+1][1])/(stations[i+1][1]=stations[i][1]);
                    stations[i][0] = (stations[i][0]*stations[i+1][0])/(stations[i+1][0]=stations[i][0]);
                }
            }
            counter=0;
            target -=startFuel;
            for (int i = 0; i <stations.length ; i++) {
                if (i!=0){
                    stations[i][0] -= temp;
                }
                if (stations[i][0]>startFuel){
                    continue;
                }else {

                    if (target>0){
                        startFuel =0;
                        startFuel =  stations[i][1];
                        counter++;
                    }
                    else {
                        break;
                    }
                    target -= startFuel;
                }
                temp += stations[i][0];
            }
        }
        if (target>0){
            return -1;
        }
        return counter;
    }
}
