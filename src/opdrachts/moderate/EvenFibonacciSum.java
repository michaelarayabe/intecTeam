package opdrachts.moderate;

/*
Write a method that returns the sum of all even Fibonacci numbers.
Consider all Fibonacci numbers that are less than or equal to n.
Each new element in the Fibonacci sequence is generated by adding the previous two elements.
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

 */
public class EvenFibonacciSum {

    public static void main(String[] args) {

        System.out.println(evenFibonacciSum(5));
    }

    public static Integer evenFibonacciSum(Integer n) {

        if(n == 0) return 0;
        if(n == 1) return 0;

        int x = 0;
        int y = 1;
        int z;
        int sumEven = 0;

        while (n > 0){
            z = x + y;
            y = x;
            x = z;
            if(n % 2 == 0){
                sumEven += n;
                break;
            }
            n--;
        }

        return sumEven;
    }
}
