package problem_solving.number;

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Natural Number");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= 6; i++) {
            sum = sum + i;
        }
        //sum = n * (n+1)/2;
        System.out.println("Summation = "+sum);
    }
}
