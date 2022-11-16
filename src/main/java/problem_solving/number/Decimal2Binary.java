package problem_solving.number;

import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Decimal Number");
        int decimal = s.nextInt();
        String binary = "";
        while (decimal > 0) {            
            int a = decimal%2;
            binary = a+binary;
            decimal /= 2;
        }
        System.out.println("Binary = "+binary);
    }
}
