package opdrachts.easy;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static Integer factorial(Integer n) {
        Integer facto = 1;
        for (int i = 1; i<= n; i++){
            if(i> 0)
                facto = facto* i;
        }
        return facto;
    }

}
