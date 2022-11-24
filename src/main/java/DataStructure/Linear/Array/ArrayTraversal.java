package DataStructure.Linear.Array;

import java.util.Scanner;

public class ArrayTraversal {

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 1, 4};

        //traversal
        printArray(arr);
        System.out.println();
    }

    /**
     * Iterate array element and print it
     * @param arr
     */
    static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item+ " ");
        }
    }
}
