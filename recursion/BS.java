package recursion;

public class BS {
    public static void main(String[] args) {
        int [] arr={1,2,43,55,56,90};
        int target=43;
        // we add start and end here, because it will be passed and used in future recursive calls , so pass in args
        int start = 0;
        int end= arr.length-1;

        //lets solve binary search using recursion

        System.out.println(search(arr,target,start,end));

    }

    static int search(int[] arr,int target, int start, int end){

        //base condition
        if(start>end) return -1;

        int mid = start + (end -start)/2;

        if(arr[mid] == target) return mid;

        if(target < arr[mid]){
            return search(arr,target,start, mid-1);
        }
        return search(arr,target,mid+1, end);

    }
}
