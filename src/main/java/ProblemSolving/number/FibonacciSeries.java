package ProblemSolving.number;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int firstTerm = 0, secondTerm = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Series Length");
        int len = s.nextInt();
        for (int i = 1; i <= len; i++) {
            System.out.print(firstTerm + " ");
            int sum = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = sum;
        }
    }
}
