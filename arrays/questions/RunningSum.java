package arrays.questions;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int [] runningSums= runningSum(nums);

        System.out.println(Arrays.toString(runningSums));
       
    }

    private static int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        output[0]=nums[0];
        for (int i = 1; i < nums.length; i++) output[i] = output[i - 1] + nums[i];
        return  output;

    }


}
