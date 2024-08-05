package sorting.questions;

public class MissingPositive {
    public static void main(String[] args) {
        int [] nums={1,2,0};

        // leetCode hard:
        // unsorted array, return smallest missing positive
        //algo:
        // since, its asks positive, we can ignore negatives
        //also missing positive can be found at last,so ignore last element also
        // hint: O(n), sort -> so cyclic sort can apply, also missing number pattern


    }

    public static int firstMissingPositive(int[] arr) {
        cyclicSort(arr);

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return arr.length + 1;
    }


    private static void cyclicSort(int[] nums){
        for (int i = 0; i < nums.length;) {
            int correct= nums[i] -1;

            if(nums[i]>0 && nums[i] < nums.length && nums[i] != nums[correct]){
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

