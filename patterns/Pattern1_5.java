package patterns;

public class Pattern1_5 {

    public static void main(String[] args) {
        int n=5;
//        pattern1(n);
//        pattern2(n);
//        pattern3(n);
//        pattern4(n);
          pattern5(n);
    }

    static void pattern1(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern2(int n){
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern3(int n){
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

    }
    static void pattern5(int n){
        for (int row = 0; row < 2 * n; row++) {
            int  totalColsInRow= row < n ? row: 2 * n - row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
