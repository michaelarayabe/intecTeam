package opdrachts.easy;

import java.util.Arrays;
import java.util.List;

public class ConvertToUpperCaseLambdas {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("quick brown fox");
        System.out.println(list);
    }

    public static List<String> upperCase(List<String> list) {

        for (String s : list){
            s = s.toUpperCase();
        }


        return list;
    }
}
