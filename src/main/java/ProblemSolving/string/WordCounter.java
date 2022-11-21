package ProblemSolving.string;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        str = str.trim();
        int ctr = 1;
        
//        ctr = str.trim().split("[\\s\n\t]+").length;
        
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t'){
                ctr++;
            }
        }
        System.out.println(ctr+" word found.");
    }
}
