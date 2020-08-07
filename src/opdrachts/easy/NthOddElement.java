package opdrachts.easy;

import java.util.Arrays;
import java.util.List;

public class NthOddElement {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4,1, 2, 3, 12, 5, 10, 11);
        System.out.println(getElement(list, 10));
    }

    public static Integer getElement(List<Integer> list, Integer n) {
        Integer result;
        if (n > list.size()-1)
            result =-1;
        else result = list.get(n);
        return result;}
}
