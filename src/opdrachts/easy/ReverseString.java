package opdrachts.easy;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("azerty"));
    }

    public static String reverse(String s) {
        char [] temp= s.toCharArray();
        String newS="";
        for (int j=(temp.length)-1; j>=0;  j--){
            newS = newS + temp[j];
        }
        return newS;
}}
