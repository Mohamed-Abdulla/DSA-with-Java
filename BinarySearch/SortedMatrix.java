package BinarySearch;

import java.util.Arrays;

public class SortedMatrix {


    public static void main(String[] args) {
        int [][]matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 3;
        System.out.println(Arrays.toString(search(matrix,target)));
    }

    private  static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){

        while (cStart<=cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target) return new int[] {row,mid};
            if(matrix[row][mid] < target){
                cStart= mid+1;
            }else{
                cEnd = mid-1;
            }
        }
        return new int[] {-1,-1};
    }

    private static int[] search (int[][] matrix,int target){
        //for edge case if matrix is 1d

        int rows = matrix.length;
        int cols= matrix[0].length;
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if(rows ==1){
            //do simple binary search
            return binarySearch(matrix,0,0,cols-1,target);
        }

        int rowStart= 0;
        int rowEnd= rows -1;
        int cMid= cols/2;
        //run loop across rows, till 2 rows are remaining
        while(rowStart < (rowEnd-1)) {// while this is true, meaning we have 2 rows remaining
            int rMid = rowStart + (rowEnd - rowStart) / 2;

            if (matrix[rMid][cMid] == target) {
                return new int[]{rMid, cMid};
            }

            if (matrix[rMid][cMid] < target) {
                rowStart = rMid;
            } else {
                rowEnd = rMid;
            }
        }
            //now we have 2 rows
            //case 1: if target is in the column we are in 1st row
            if(matrix[rowStart][cMid]==target){
                return new int[]{rowStart,cMid};
            }
            //case 2: if target is in the column we are in 2st row
            if(matrix[rowStart+1][cMid]==target){
                return new int[]{rowStart+1,cMid};
            }
            //case3: check in 1st half
            if(target <= matrix[rowStart][cMid-1]){
                return  binarySearch(matrix,rowStart,0,cMid-1,target);
            }
            //case4: check in 2nd half
            if(target >= matrix[rowStart][cMid+1] && target<= matrix[rowStart][cols-1]) {
                return binarySearch(matrix, rowStart, cMid+1, cols - 1, target);
            }
            //case4: check in 3rd half
            if(target <= matrix[rowStart+1][cMid-1]){
                return  binarySearch(matrix,rowStart+1,0,cMid-1,target);
            }else{
                return  binarySearch(matrix, rowStart+1, cMid+1, cols-1,target);
            }
        }


}
