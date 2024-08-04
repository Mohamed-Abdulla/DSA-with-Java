package arrays.questions;

import java.util.Arrays;


public class SmallerNumbersThanCurrent {

    public static void main(String[] args) {
        int []nums= {8,1,2,2,3};
        System.out.println(Arrays.toString(helper(nums)));
    }

    private static int[] helper(int[] nums) {
        int [] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]> nums[j]){
                    output[i]+=1;
                }

            }

        }
        return output;
    }
}
