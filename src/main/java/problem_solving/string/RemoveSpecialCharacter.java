package problem_solving.string;

import java.util.Scanner;

public class RemoveSpecialCharacter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        String result = "";
        
        //result = str.replaceAll("[^a-zA-A0-9]", "");
        
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i))){
                result = result + str.charAt(i);
            }
        }
        System.out.println("Result = "+result);
    }
}
