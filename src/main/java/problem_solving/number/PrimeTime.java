package problem_solving.number;

import java.util.Scanner;

public class PrimeTime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = s.nextInt();
        System.out.println(primeTime(n));
    }

    private static boolean primeTime(int n) {
        int ctr = 0;
        
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                ctr++;
            }
        }
        return ctr == 0;
    }
}
