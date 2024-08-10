package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8
        System.out.println(fib(6));
    }


    static int fib(int n){
        //base condition
        if(n<2) return n;

        //body of the function
        return fib(n-1)+fib(n-2); //recurrence relation



    }
}
