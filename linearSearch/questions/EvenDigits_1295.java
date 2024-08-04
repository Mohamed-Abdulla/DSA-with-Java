package linearSearch.questions;

public class EvenDigits_1295 {
    public static void main(String[] args) {
        int []nums={12,345,21,6,7896};
        System.out.println(search(nums));
    }

    private  static int search(int[]nums){
        int count=0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return  count;
    }

    private static boolean even(int num) {
//        int count=0;
//        while(num>0){
//            num=num/10;
//            count++;
//        }
        int count= (int)Math.log10(num)+1;
        return  count %2==0;

    }


}
