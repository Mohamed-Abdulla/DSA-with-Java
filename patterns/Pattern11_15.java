package patterns;

public class Pattern11_15 {
    public static void main(String[] args) {
        int n =5;
//        pattern11(n);
//        pattern12(n);
//        pattern13(n);
//        pattern28(n);
//        pattern30(n);
        pattern17(n);
    }

    private static void pattern11(int n) {
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < n -(n-row); spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void pattern12(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalRowsInCols= row < n ? row: 2 * n - row - 1;
            for (int spaces = 0; spaces < n - (n-totalRowsInCols); spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n - totalRowsInCols; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
//    private static void pattern13(int n) {
//        for (int row = 0; row < n; row++) {
//            for (int spaces = 0; spaces < n-row; spaces++) {
//                System.out.print(" ");
//            }
//            for (int col = 0; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//    }
    private static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalRowsInCols= row < n ? row: 2 * n - row;
            for (int spaces = 0; spaces < (n-totalRowsInCols); spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalRowsInCols; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < (n-row); spaces++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();

        }
    }private static void pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalRowInCols= row < n ? row : 2 * n -row;

            for (int spaces = 0; spaces < (n - totalRowInCols); spaces++) {
                System.out.print(" ");
            }
            for (int col = totalRowInCols; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= totalRowInCols; col++) {
                System.out.print(col);
            }
            System.out.println();

        }
    }
}
