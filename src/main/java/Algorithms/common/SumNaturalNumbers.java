package Algorithms.common;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File Algorithms.AnalysisAlgorithm.java: DataStructureAndAlgorithms
 * @CreationDate 11/17/2022 12:01 PM
 */
public class SumNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumUsingFormula(5));
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
