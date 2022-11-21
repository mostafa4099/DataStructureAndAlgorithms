package ProblemSolving.number;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = s.nextInt();
        int originalNumber = n;
        int reverseNumber = 0;
        while(n!=0){
            int reminder = n%10;
            reverseNumber = reverseNumber*10+reminder;
            n = n/10;
        }
        if (reverseNumber == originalNumber) {
            System.out.println(originalNumber+" is a palindrome number");
        } else {
            System.out.println(originalNumber+" isn't a palindrome number");
        }
    }
}
