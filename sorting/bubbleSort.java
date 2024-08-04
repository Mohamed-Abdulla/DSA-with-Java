package sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int []nums={5,4,3,2,1};
        bubble(nums);
        System.out.println(Arrays.toString(nums));

        
    }
    
    static void bubble(int[] nums){
        boolean isSwapped;
        for (int i = 0; i < nums.length; i++) {
            isSwapped=false;
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j-1]>nums[j]){
                    //swap
                    isSwapped = swap(nums,j,j-1);
                }
            }
            if (!isSwapped) { // !false = true
                break;
            }
        }

    }

    static boolean swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
        return true;
    }
}
