package DataStructure.Linear.Array;

import java.util.Scanner;

public class ArraySearching {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {2, 3, 5, 1, 4};

        //searching
        System.out.println("Enter Search Value");
        int searchElement = s.nextInt();
        int foundIdx = searchArrayElement(arr, searchElement);

        if (foundIdx < 0) {
            System.out.println(searchElement + " is not found in the array");
        } else {
            System.out.println(searchElement + " located at " + foundIdx + " index position of array");
        }
    }

    /**
     * search specified value in array and return index position
     * @param arr
     * @param searchElement
     * @return foundIdx
     */
    static int searchArrayElement(int[] arr, int searchElement) {
        int foundIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                foundIdx = i;
                break;
            }
        }

        return foundIdx;
    }
}
