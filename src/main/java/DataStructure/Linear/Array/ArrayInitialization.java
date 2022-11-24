package DataStructure.Linear.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInitialization {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter capacity of array");

        // array declaration.
        // capacity is mandatory in array declaration.
        int arr[] = new int[s.nextInt()];

        //insertion
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter array element " + (i + 1));
            arr[i] = s.nextInt();
        }

        System.out.println("Full Array: "+ Arrays.toString(arr));
    }
}
