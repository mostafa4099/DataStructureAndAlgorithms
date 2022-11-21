package ProblemSolving.number;

import java.util.Scanner;

public class DigitsCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = s.nextInt();
        int ctr = 0;
        while (n != 0) {            
            n /= 10;
            ctr++;
        }
        System.out.println(ctr+ " digits");
    }
}
