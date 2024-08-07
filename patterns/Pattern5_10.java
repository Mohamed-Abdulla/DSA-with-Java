package patterns;

public class Pattern5_10 {
    public static void main(String[] args) {
        int n=5;
//        pattern6(n);
//        pattern7(n);
//        pattern8(n);
//        pattern9(n);

        pattern10(n);

    }

    private static void pattern6(int n) {
        for (int row = 0; row <= n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    private static void pattern7(int n) {
        for (int row = 0; row <= n; row++) {
            for (int spaces = 0; spaces < n-(n-row); spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n-row; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    private static void pattern8(int n) {
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < row * 2 -1; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    private static void pattern9(int n) {
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < n-(n-row); spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * n - row * 2 - 1 ; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    private static void pattern10(int n) {
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
