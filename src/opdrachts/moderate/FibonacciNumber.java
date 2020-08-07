package opdrachts.moderate;

public class FibonacciNumber {

    /*
    * Write a method that returns the nth element of the Fibonacci Sequence
The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
The next number is found by adding up the two numbers before it.
Assume that indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ...

    * */
    public static void main(String[] args) {

        System.out.println(fibonacci(6));
    }

    public static Integer fibonacci(Integer n) {

        if(n == 0) return 0;
        if(n == 1) return 1;
        int x = 0;
        int y = 1;
        int z = x + y;

        while(n > 0) {
            z = x + y;
            y = x;
            x = z;
            n--;
        }

        return z;


}}
