package ProblemSolving.number;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scanner.nextInt();
        if (num%2==0) {
            System.out.println(num+" is a Even number.");
        } else {
            System.out.println(num+" is a Odd number.");
        }
    }
}
