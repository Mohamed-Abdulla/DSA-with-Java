package BinarySearch;

public class RowColMatrix {
    public static void main(String[] args) {
        int [][] matrix = {
//                {1,3,5,7},{10,11,16,20},{23,30,34,60}
                {1},{3}
        };

        int target =3;

        System.out.println(search(matrix,target));

    }
    private static boolean search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols - 1;
        while (row < rows && col >= 0){
            if(matrix[row][col]==target){
                return true;
            }
            if(matrix[row][col] > target ){
                    col--;
            }else{
                row++;
            }
        }
        return false;
    }
}
