package sorting.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int [] nums={4,3,2,7,8,2,3,1};

        System.out.println(findDisAppearedNumbers(nums));

    }
    private  static List<Integer> findDisAppearedNumbers(int [] nums){
        cyclic(nums);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]-1 != i){
                 list.add(i+1);
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
