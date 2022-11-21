package ProblemSolving.recursion;

public class SumArrayElementsRecursive {
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 5, 6};
        int sum = recurSum(arr, arr.length);
        System.out.println("Summation of Array Elements is "+sum);
    }
    
    public static int recurSum(int arr[], int len) 
    { 
        if (len <= 1) {
            return len;
        }
        return arr[len-1] + recurSum(arr, len - 1); 
    } 
}
