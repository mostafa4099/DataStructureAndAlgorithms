package ProblemSolving.number;

import java.util.Scanner;

public class ConditionalSum {
    public static void main(String[] args) {
        int sum=0, ctr=0;
        Scanner s = new Scanner(System.in);
        for (int i = 0;; i++) {
            System.out.println("Enter input Element "+(i+1));
            int n=s.nextInt();
            if (n>0) {
                sum += n;
            } else {
                break;
            }
            ctr++;
        }
        System.out.println(sum+" is summation of first "+ctr+" input number");
    }
}
