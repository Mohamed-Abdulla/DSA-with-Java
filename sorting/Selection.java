package sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int []nums={5,4,3,2,1};

        //selection sort algorithm
        // find max or min element in array , and put it in right place
        //if max, put it in last else first


        //find maxIndex, swap it with last index

        for (int i = 0; i < nums.length; i++) {
            int last= nums.length - i-1;
            int max = findMaxIndex(nums,0,last);
            swap(nums, max,last);
        }

        System.out.println(Arrays.toString(nums));


    }

    static int findMaxIndex(int[] nums, int start,int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;

    }
}
