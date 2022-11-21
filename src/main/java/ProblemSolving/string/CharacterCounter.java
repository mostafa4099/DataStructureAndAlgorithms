package ProblemSolving.string;

import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        System.out.println("Enter Countable Character");
        char ctrChar = s.next().charAt(0);
        int ctr = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ctrChar){
                ctr++;
            }
        }
        System.out.println(ctrChar+" is " + ctr+" time in the string.");
    }
}
