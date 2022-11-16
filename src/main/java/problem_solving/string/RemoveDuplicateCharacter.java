package problem_solving.string;

import java.util.Scanner;

public class RemoveDuplicateCharacter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        char [] strArr = str.toCharArray();
        String result = "";

        for (int i = 0; i < strArr.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (strArr[i] == strArr[j]) {
                    break;
                }
            }
            if(i == j){
                result += strArr[i];
            }
        }
        System.out.println("Result = " + result);
    }
}
