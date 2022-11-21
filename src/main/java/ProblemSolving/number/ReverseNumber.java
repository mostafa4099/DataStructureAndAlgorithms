package ProblemSolving.number;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String [] args){
        int revNum =0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = s.nextInt();
        while(n!=0){
            int reminder = n%10;
            revNum = revNum*10+reminder;
            n = n/10;
        }
        System.out.println("The reverse number is "+revNum);
    }
}
