package sorting.questions;

class SetMisMatch {
    public int[] findErrorNums(int[] nums) {
        return sol(nums);
    }

  public int[] sol(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] {arr[index], index+1};
            }
        }
        return new int[] {-1, -1};
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