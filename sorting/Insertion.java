package sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int []nums={1,-2,3};

        //insertion sort algorithm
        // sort each part
        //for eg: sort 0 to 1, then 0 to 2, ... 0 to n
        //things to note: we don't need to run till n-1, run only for n-2, because when j reaches last, i became out of bound
        //start j at i+1;

        insertion(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertion(int [] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(nums[j-1]>nums[j]){
                    swap(nums, j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;

    }
}
