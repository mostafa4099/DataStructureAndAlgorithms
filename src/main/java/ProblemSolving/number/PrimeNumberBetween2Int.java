package ProblemSolving.number;

import java.util.Scanner;

public class PrimeNumberBetween2Int {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Starting Number");
        int start = s.nextInt();
        System.out.println("Enter Ending Number");
        int end = s.nextInt();
        
        for (int i = start; i <= end; i++) {
            if(primeNumberChecking(i)){
                System.out.println(i+" ");
            }
        }
    }

    private static boolean primeNumberChecking(int n) {
        int ctr = 0;
        
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                ctr++;
            }
        }
        return ctr == 0;
    }
}
