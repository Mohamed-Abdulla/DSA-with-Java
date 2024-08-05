package sorting.questions;

public class MissingNumber {
    public static void main(String[] args) {
        int []nums={3,0,1};
        //find missing number
        //question gives its range 0 to n, so we can use cyclic sort
        //once its sorted, we can return index of element which is missing

       int missingNumber= findMissingNumber(nums);

        System.out.println(missingNumber);

    }

    private static int findMissingNumber(int[] nums) {
        cyclicSort(nums);

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != i){
                return i;
            }

        }
        return nums.length;


    }

    private static void cyclicSort(int[] nums){
        for (int i = 0; i < nums.length;) {
            int correct= nums[i]; // we didn't use n-1, because its 0 to n, therefore element == index

            if(nums[i] < nums.length && nums[i] != nums[correct]){ // we ignore max value means that
                // it's index is out of bound, so it will come at last when others came in right place
                swap(nums,i,correct);
            }else{
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
