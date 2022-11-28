package ProblemSolving.string;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string value");
        String str = s.nextLine();

        boolean isPalindrome = checkPalindromeUsingWhileLoop(str);

        if (isPalindrome) {
            System.out.println(str+" is Palindrome");
        } else{
            System.out.println(str+" isn't Palindrome");
        }
    }

    /**
     * find out the reverse string of given string and check both are same or not.
     * @param str
     * @return
     */
    private static boolean checkPalindromeUsingForLoop(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equalsIgnoreCase(reverse);
    }

    /**
     * check given string palindrome or not using comparing first part with last part.
     * @param str
     * @return
     */
    private static boolean checkPalindromeUsingWhileLoop(String str) {
        char [] charArr = str.toLowerCase().toCharArray();
        int start = 0;
        int end = charArr.length - 1;

        while (start < end) {
            if(charArr[start] != charArr[end]){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
