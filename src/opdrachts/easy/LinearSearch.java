package opdrachts.easy;

public class LinearSearch {

    public static void main(String[] args) {

        Integer[] list = {2, 7, 5, 3};

        System.out.println(search(3, list));
    }

    public static int search(Integer n, Integer[] list) {
        int search = -1;
        for(int i =0; i < list.length ; i++){
            if (list [i].equals(n)){
                search = i;
                break;}
        }
        return search;
}}
