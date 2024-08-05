package sorting.questions;

public class DuplicateNumber {
    public static void main(String[] args) {
        int [] nums ={3,3,3,3};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        cyclic(nums);

        int ans=-1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]-1 != i){
                ans= nums[i];
                return ans;
            }
        }
        return ans;
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

