package opdrachts.moderate;

public class PalindromeCheck {

    /*
    * A palindrome is a word which reads the same backward or forward. 'abcba' is a palindrome.
Write a method that detects if a string is a palindrome.
Tip: Use word.charAt(i) to get the character at position i.
    *
    * */
    public static void main(String[] args) {

        System.out.println(isPalindrome("fabcbaf"));
    }

    public static boolean isPalindrome(String word) {

        boolean isPalindrome = false;

        for(int i = 0; i < word.length() - 1; i++){
            if(word.charAt(0) == word.charAt(word.length()-1)){
                isPalindrome = true;
            }
        }
        return isPalindrome;
    }
}
