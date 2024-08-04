package BinarySearch;

public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        int start=0;
        int end=0;

        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start,nums[i]); // in the end it will contain max value in the array
            end +=nums[i];
        }

        System.out.println(binarySearch(start,end,nums,2));
    }

    private static int binarySearch(int start, int end, int[]nums, int m){
        while(start<end){
            int mid = start+ (end -start)/2;
            //calc how many pieces i can divide with this max sum
            int sum=0;
            int pieces=1; //min no of pieces
            for (int num :nums){
                if(sum + num > mid){
                    //if sum+num is greater, that means we cannot add it in 1st sub array
                    //add this num to new subarray
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
}
                if(pieces > m){
                    start= mid+1;
                }else{
                    end= mid;
                }

        }
            return end;
    }
}
