package ProblemSolving.number;

import java.util.Scanner;

public class AllDigitsDivideNumber {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = s.nextInt();
        boolean result = allDigitsDivide(n);
        if(result){
            System.out.println("All digits are divide number");
        }else{
            System.out.println("All digits aren't divide number");
        }
    }
    
    public static boolean allDigitsDivide(int n){
        int temp = n;
        while(n>0){
            int digit = temp%10;
            if(checkDivisibility(temp, digit) == false){
                return false;
            }
            n /= 10;
        }
        return true;
    }
    
    public static boolean checkDivisibility(int n, int digit){
        return digit != 0 && n%digit == 0;
    }
}
