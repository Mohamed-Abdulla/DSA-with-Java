package BinarySearch;

public class Ceiling {

    public static void main(String[] args) {
        int [] arr={2,6,8,9,11,13,15};
        int target=14;
        System.out.println(search(arr, target));
    }

    static int search(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return arr[start];
    }

}
