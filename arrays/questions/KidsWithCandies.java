package arrays.questions;

import java.util.Arrays;

public class KidsWithCandies {
    public static void main(String[] args) {
        int []arr={12,1,12};
        int extras=10;
        int maximum= max(arr);
        System.out.println(Arrays.toString(helper(arr, maximum, extras)));

    }

    private static boolean[] helper(int[] arr, int maximum,int extras) {
        boolean[] output =new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            //add extra candy to each
            arr[i]=arr[i]+extras;
            output[i]= arr[i]>= maximum;

        }
        return  output;
    }

    private static int max(int[] arr){
        int max= arr[0];
        for (int j : arr)
            if (j > max) {
                max = j;
            }
        return  max;
    }



}
