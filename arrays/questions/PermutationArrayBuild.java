package arrays.questions;

import java.util.Arrays;

public class PermutationArrayBuild {
    public static void main(String[] args) {
        System.out.println("hello world!");
        int [] nums={0,2,1,5,3,4};
        int [] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            output[i]=nums[nums[i]];
        }

        System.out.println(Arrays.toString(output));

    }

}
