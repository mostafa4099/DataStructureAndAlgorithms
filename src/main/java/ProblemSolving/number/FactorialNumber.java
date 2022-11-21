package ProblemSolving.number;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        int fact= 1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) fact *=i;
        System.out.println("The factorial number is "+fact);
    }
}
