package problem_solving.string;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string value");
        String str = s.nextLine();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(str+" = "+reverse);

        if (str.equals(reverse)) {
            System.out.println(str+" is Palindrome");
        } else{
            System.out.println(str+" isn't Palindrome");
        }
    }
}
