package opdrachts.easy;

import java.util.Arrays;
import java.util.List;

public class AverageValueLambdas {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(average(list));
    }

    public static Double average(List<Integer> list) {
        double sum = 0;
        for (Integer i: list){
            sum = sum + i;
        }
        double average = sum/list.size();
        return average;
    }
}
