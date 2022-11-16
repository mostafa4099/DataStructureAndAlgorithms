package problem_solving.number;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Base Number");
        int base = s.nextInt();
        System.out.println("Enter Exponent Number");
        int exponent = s.nextInt();
        int power = 1;
        
        while(exponent != 0){
            power *= base;
            exponent--;
        }
        System.out.println("Result = "+power);
    }
}
