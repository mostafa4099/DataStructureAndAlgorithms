package Algorithms;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Algorithms.AnalysisAlgorithm.java: DataStructureAndAlgorithms
 * @CreationDate 11/17/2022 12:01 PM
 */
public class AnalysisAlgorithm {
    public static void main(String[] args) {

        long formulaStartTime = System.currentTimeMillis();
        System.out.println("Sum Using Formula = " + sumUsingFormula(10000));
        long formulaEndTime = System.currentTimeMillis();
        System.out.println("Formula takes time = " + (formulaEndTime-formulaStartTime));

        long loopStartTime = System.currentTimeMillis();
        System.out.println("Sum Using loop = " + sumUsingLoop(10000));
        long loopEndTime = System.currentTimeMillis();
        System.out.println("Loop takes time = " + (loopEndTime-loopStartTime));
    }

    /**
     * Sum natural n numbers using math formula.
     * Takes less time.
     * Time complexity O(1)
     * @param n
     * @return sum
     */
    public static int sumUsingFormula(int n){
        return n*(n+1)/2;
    }

    /**
     * Sum natural n numbers using loop.
     * Takes more time.
     * Time complexity O(n)
     * @param n
     * @return sum
     */
    public static int sumUsingLoop(int n){
        int sum = 0;

        for(int i = 1; i<=n; i++){
            sum += i;
        }

        return sum;
    }
}
