package ProblemSolving.recursion;

import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = s.nextInt();
        System.out.println("The factorial number is "+factrorial(n));
    }
    static int factrorial(int n){
        if (n==0) {
            return 1;
        } else {
            return n*factrorial(n-1);
        }
    }
}
