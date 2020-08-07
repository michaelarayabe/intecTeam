package opdrachts.easy;

public class SumMultiplesThreeAndFive {

    public static void main(String[] args) {
        System.out.println(sum(6));
    }

    public static Integer sum(Integer n) {
        Integer sum = 0;
        for (int i= 1; i<=n; i++){
            if ( (i%3 ==0) || (i%5 ==0))
                sum = sum + i;
        }
        return sum;
    }
}
