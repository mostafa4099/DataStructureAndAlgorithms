package ProblemSolving.number;

import java.util.Arrays;
import java.util.Scanner;

public class NumbersDigitsInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = s.nextInt();
        int temp = n;
        int ctr = 0;
        while (n != 0) {            
            n /= 10;
            ctr++;
        }
        
        n = temp;
        int [] arr = new int [ctr];
        
        while (n != 0) {            
            int reminder = n % 10;
            arr[ctr-1] = reminder;
            ctr--;
            n /= 10;
        }
        System.out.println("Array "+Arrays.toString(arr));
    }
}
