package opdrachts.moderate;

/*
* Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
For numbers which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number.
* */


public class FizBuzz {
    public static void main(String[] args) {

        System.out.println(fizzBuzz(11));
    }

    public static String fizzBuzz(Integer i){

        String placeHolder = "";

        if(i % 3 == 0){
            placeHolder = placeHolder + "Fizz";
        }
        if(i % 5 == 0){
            placeHolder = placeHolder + "Buzz";
        } else{
            return i.toString();
        }


        return placeHolder;
    }
}
