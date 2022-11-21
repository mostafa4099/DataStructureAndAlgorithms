package ProblemSolving.number;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = s.nextInt();
        int originalNumber = n;
        int result = 0;
        while(n > 0){
            int reminder = n%10;
            result = result+(reminder*reminder*reminder);
            n = n/10;
        }
        if (result == originalNumber) {
            System.out.println(originalNumber+" is a Armstron number");
        } else {
            System.out.println(originalNumber+" isn't a Armstron number");
        }
    }
}
