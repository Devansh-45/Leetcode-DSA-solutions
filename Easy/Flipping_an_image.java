/*
    Author -: Devansh Desai
    Date -: 19-08-2022

    Problem -: Flipping an Image
    Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting
    image.

    To flip an image horizontally means that each row of the image is reversed.

    For example, flipping [1,1,0] horizontally results in [0,1,1].
    To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

    For example, inverting [0,1,1] results in [1,0,0].

*/
package Easy;

public class Flipping_an_image {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(flipAndInvertImage(image));

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int start;
        for (int i = 0; i < image.length; i++) {
            start =0;
            int end=image[i].length-1;
            while(start<=end){
                int temp = image[i][start];
                image[i][start] = image[i][end] == 1?0 :1;
                image[i][end] = temp == 1?0 :1;
                start++;
                end--;
            }
        }
        return image;
    }
    //public int[][] flipAndInvertImage(int[][] image) {
    //
    //
    //        for(int i = 0;i < image.length;i++){
    //
    //            int start = 0;
    //            int end = image[i].length-1;
    //            while(start <= end){
    //                if(image[i][start] == image[i][end]){
    //                    image[i][start] = 1 - image[i][start];
    //                    image[i][end] =  image[i][start];
    //                }
    //                    start++;
    //                    end--;
    //                }
    //
    //        }
    //        return image;
    //    }
}
