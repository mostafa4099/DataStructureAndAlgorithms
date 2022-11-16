package problem_solving.recursion;

import java.util.Scanner;

public class FibonacciSeriesRecursive {
    static int firstTerm = 0, secondTerm = 1;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Series Length");
        int len = s.nextInt();
        printFib(len);
    }
    static void printFib(int len) {
        if (len > 0) {
            System.out.print(firstTerm + " ");
            int sum = firstTerm+secondTerm;
            firstTerm = secondTerm;
            secondTerm = sum;
            printFib(len-1);
        }
    }
}
