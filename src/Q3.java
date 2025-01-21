import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number:");
        int n = scanner.nextInt();

        int fibonacciNumber = fibonacci(n);
        System.out.println("The " + n + "th number in the Fibonacci sequence is: " + fibonacciNumber);
scanner.close();
    }
    public static int fibonacci(int n){
        if (n <= 0){
            return 0 ;
        } else if (n == 1){
            return 1 ;
        }
        int a = 1 ;
        int b = 1 ;
        int fib= 0 ;

        for (int i = 2; i < n; i++ ){
            fib = a+b;
            a = b;
            b = fib;
        }
        return fib;
    }
}
