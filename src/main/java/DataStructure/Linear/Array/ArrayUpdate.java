package DataStructure.Linear.Array;

import java.util.Scanner;

public class ArrayUpdate {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 1, 4};

        //update
        arr = updateArray(arr);
        System.out.println("After Update Array: ");
        printArray(arr);
        System.out.println();
    }

    /**
     * update array element with specified position
     * @param arr
     * @return arr
     */
    static int[] updateArray(int[] arr) {
        System.out.println("Enter Index Position of Update Element");
        int upPos = s.nextInt();
        System.out.println("Enter Update Value");
        arr[upPos] = s.nextInt();
        return arr;
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
