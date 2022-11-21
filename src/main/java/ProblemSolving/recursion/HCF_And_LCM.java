package ProblemSolving.recursion;

import java.util.Scanner;

public class HCF_And_LCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = s.nextInt();
        System.out.println("Enter 1st Number");
        int b = s.nextInt();
        
        int gcd = gcdCalculation(a, b);
        System.out.println("GCD = "+gcd);
        
        int multiplication = a * b;
        int lcm = multiplication/gcd;
        System.out.println("lcm = "+lcm);
        
    }

    private static int gcdCalculation(int a, int b) {
        if (b == 0) return a;
        return gcdCalculation(b, a%b);
    }
}
