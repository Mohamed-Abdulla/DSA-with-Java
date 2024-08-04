package BinarySearch;

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int [] nums= {5,7,7,8,8,10};
        int target = 8;
        //we need to find first and last position of an target
        // we can find first and last individually by running 2 B.S
        // solution same as binary search, if u found potential ans, check till its final occurrence by not returning mid.
        // repeat 3rd for last occurrence
        int []ans={-1,-1};
        ans[0]= search(nums,target,true);
        ans[1]=search(nums,target,false);
        System.out.println(Arrays.toString(ans));
    }

    static int search(int[] nums,int target, boolean findStartIndex){
        int start = 0;
        int end = nums.length -1;
        int ans =-1;

        while(start <=end){
            int mid = start + (end -start)/2;

            if(target < nums[mid]){
                end =mid-1;
            } else if (target > nums[mid] ) {
                start = mid + 1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return ans;

    }
}
