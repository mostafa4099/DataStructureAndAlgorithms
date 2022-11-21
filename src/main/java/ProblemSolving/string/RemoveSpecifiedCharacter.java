package ProblemSolving.string;

import java.util.Scanner;

public class RemoveSpecifiedCharacter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        System.out.println("Enter Removable Character");
        char spChar = s.next().charAt(0);
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != spChar){
                result += str.charAt(i);
            }
        }
        System.out.println("Result = " + result);
    }
}
