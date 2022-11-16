package problem_solving.recursion;

import java.util.Scanner;

public class SumNaturalNumbersRecursive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Natural Number");
        int n = s.nextInt();
        int sum = recurSum(n);
        System.out.println("Summation = "+sum);
    }
    
    public static int recurSum(int n) 
    { 
        if (n <= 1) {
            return n;
        }
        return n + recurSum(n - 1); 
    } 
}
