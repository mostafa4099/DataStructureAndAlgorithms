package problem_solving.number;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = s.nextInt();
        int ctr = 0;
        
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                ctr++;
            }
        }
        
        if(ctr == 0){
            System.out.println(n+" is a prime number.");
        } else{
            System.out.println(n+" isn't a prime number.");
        }
    }
}
