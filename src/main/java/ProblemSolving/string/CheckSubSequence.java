package ProblemSolving.string;

import java.util.Scanner;

public class CheckSubSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your First String");
        String str1 = s.nextLine();
        System.out.println("Enter Your Second String");
        String str2 = s.nextLine();
        
        boolean status = isSubSequence(str1, str2);
        if (status) {
            System.out.println(str1+ " is Sub Sequence of "+str2);
        } else {
            System.out.println(str1+ " isn't Sub Sequence of "+str2);
        }
    }

    static boolean isSubSequence(String str1, String str2) {
        int i =0, j =0;
        
        if(str1.length() > str2.length()) return false;
        if(str1.length() == 0) return true;
        
        while(j < str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                ++i;
            }
            j++;
            
            if(str1.length() == i){
                
                return true;
            }
        }
        return false;
    }
}
