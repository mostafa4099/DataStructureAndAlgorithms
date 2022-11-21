package ProblemSolving.number;

import javax.swing.*;

public class SquareCalc {
    public static void main(String[] args) {
        String  numAsString = JOptionPane.showInputDialog("Enter Number");
        int num = Integer.parseInt(numAsString);
        int result=0;
        
//        for (int i = 0; i < num; i++) {
//            for (int j = 0; j < num; j++) {
//                result = result+1;
//            }
//        }
        
        for (int i = 0; i < num; i++) {
            result = num*num;
        }
        
//        result = (int) Math.pow(num, 2);
        
        System.out.println(result+" is square value for "+num);
    }
}
