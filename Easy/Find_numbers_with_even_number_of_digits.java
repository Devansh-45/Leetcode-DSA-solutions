/*
    Author -: Devansh Desai
    Date -: 17-08-2022

    Problem -: Find Numbers with Even Number of Digits

*/
package Easy;

public class Find_numbers_with_even_number_of_digits {
    public static void main(String[] args) {
        int[] num = new int[]{555,901,482,1771};
        Find_numbers_with_even_number_of_digits obj = new Find_numbers_with_even_number_of_digits();
        System.out.println(obj.findNumbers(num));

    }
//    public static int sum=0;
//    static int digit(int arr){
//        int count =0;
//        arr /= 10;
//        count++;
//        sum += count;
//        if(arr==0){
//            return sum;
//        }
//        return digit(arr);
//    }
//    public  int findNumbers(int[] nums) {
//        int[] count= new int[nums.length];
//        int even_num=0,Garbage=0;
//        for (int i=0;i<nums.length;i++) {
//            count[i] = digit(nums[i]) - Garbage ;
//            Garbage += count[i];
//            if (count[i] % 2 == 0) {
//                even_num++;
//            }
//        }
//        return even_num;
//    }
    public int findNumbers(int[] nums) {
        int even_num=0;
        for (int num : nums) {
            if ((num > 9 && num < 100) || (num > 999 && num < 10000) || (num == 100000)) {
            even_num++;
            }
        }
        return even_num;
    }
}
