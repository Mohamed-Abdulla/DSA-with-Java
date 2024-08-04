package linearSearch.questions;

public class RichestCustomerWealth_1672 {
    public static void main(String[] args) {
        int [][]accounts={
                {1,2,32},
                {3,2,1}
        };

        System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int[][]accounts){
        int maxW= Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int rowSum = 0;
            for (int anInt : ints) {
                rowSum += anInt;
            }
            if (rowSum > maxW) {
                maxW = rowSum;
            }
        }
        return maxW;
    }
}
