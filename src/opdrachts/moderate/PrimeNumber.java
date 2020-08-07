package opdrachts.moderate;

public class PrimeNumber {

    /*
    * A prime number is a natural number greater than 1 that has no
    * positive divisors other than 1 and itself.
    * Write a method that checks if a number is a prime number.
    * */
    public static void main(String[] args) {

        System.out.println(isPrime(11));
    }

    public static Boolean isPrime(Integer n) {

        boolean isPrime = true;

        for(int i = 2; i < n/2; i++){

            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
