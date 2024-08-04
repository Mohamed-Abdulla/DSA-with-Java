package BinarySearch;

public class Main {

    public static void main(String[] args) {
        int [] arr={2,6,7,9,11,13,15};
        int [] arr1={15,14,12,9,7,4,2};
        int target=7;
        System.out.println(search(arr, target));
        System.out.println(orderAgnosticSearch(arr1, target));
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
        return  -1;
    }
    static int orderAgnosticSearch(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return  -1;
    }

}
