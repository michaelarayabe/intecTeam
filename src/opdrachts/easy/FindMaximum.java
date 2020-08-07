package opdrachts.easy;

public class FindMaximum {

    public static void main(String[] args) {

        Integer[] caseOne = {2, 6, 122, 8, 12, 88};
        System.out.println(maximum(caseOne));
    }

    public static Integer maximum(Integer[] list) {
        Integer max = list[0];
        for (int i =1; i < list.length ; i++){
            if (list[i]> max)
                max = list[i];
        }
        return max;
}}
