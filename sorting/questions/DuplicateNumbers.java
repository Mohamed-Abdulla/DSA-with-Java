package sorting.questions;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int [] nums ={3,3,1,2};
        System.out.println(findDuplicate(nums));
    }

    public static List<Integer> findDuplicate(int[] nums) {
        cyclic(nums);

        List<Integer> list= new ArrayList<>();
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]-1 != i){
                list.add(nums[i]);
            }
        }
        return list;
    }


    private static void cyclic(int [] nums){
        for (int i = 0; i < nums.length;) {
            int correct= nums[i] -1;
            if(nums[i]!= nums[correct]){
                swap(nums,i, correct);
            }else{
                i++;
            }

        }
    }

    private static  void swap(int[] nums, int first, int second){
        int temp= nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}

