package sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int []nums={3,4,2,1,5};
        //cyclic sort algo
        // check a element and put it in right index
        // NOTE: when u see pattern as 0 to n range, use cyclic sort
        //we can sort this in a single parse
        //so worst case is o(n)
        cyclic(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void cyclic(int[] nums) {
//        int i =0;

//        while (i< nums.length){
//            int correct=  nums[i]-1;
//
//            if(nums[i] != nums[correct]){ // 3 != 2
//                swap(nums, i , correct);
//            }else{
//                i++;
//            }
//        }
        for (int i = 0; i < nums.length;) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;

    }
}
