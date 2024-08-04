package basics;

import java.util.Scanner;

public class First_java_program {
    public static void main(String[] args) {
//        oddEven();
//        greeting();
//        simpleInterest();
//        calculator();
        palindrome();
    }


    //1. Write a program to print whether a number is even or odd, also take
    //input from the user.
   private static void oddEven(){
        System.out.println("Enter the number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number % 2 ==0){
            System.out.println("Its even!");
        }else{
            System.out.println("Its odd!");
        }
        input.close();
    }

    // 2. Take name as input and print a greeting message for that particular name.

    private static void greeting(){
        System.out.println("Enter your name:");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Howdy!" + name);
    }

    //3. Write a program to input principal, time, and rate (P, T, R) from the user and
    //find Simple Interest.

    private static void simpleInterest(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();

        double simpleInterest = (principal * time * rate) / 100;
        System.out.println("Simple Interest is: " + simpleInterest);

        scanner.close();
    }
    //4. Take in two numbers and an operator (+, -, *, /) and calculate the value.
    //(Use if conditions)

    private static void calculator(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else {
            System.out.println("Invalid operator!");
            scanner.close();
            return;
        }

        System.out.println("The result is: " + result);

        scanner.close();
    }
    private static void palindrome(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        boolean isPalindrome = true;

        for (int i = 0; i < input.length()/2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) System.out.println("its palindrome");
        else System.out.println("its not");

        scanner.close();
    }
}
