package ProblemSolving.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOfVowels {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter String");
        String str = s.nextLine();
        int ctr = 0;
        
        List<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');
        
        for (int i = 0; i < str.length(); i++) {
            if(vowels.contains(str.charAt(i))){
                ctr++;
            }
        }
        System.out.println("Total Vowel = "+ctr);
    }
}
