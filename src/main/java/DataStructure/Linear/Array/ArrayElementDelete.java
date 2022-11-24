package DataStructure.Linear.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementDelete {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {2, 3, 5, 1, 4};

        //deletion
        System.out.println("Enter Deletable Index Position");
        int delPos = s.nextInt();
        arr = deleteArrayElement(arr, delPos);
        System.out.println("After Deletion Array: "+ Arrays.toString(arr));
    }

    /**
     * delete array element with specified index position
     * @param arr
     * @param delPos
     * @return newArr
     */
    static int [] deleteArrayElement(int[] arr, int delPos) {
        int[] newArr = new int[arr.length - 1];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != delPos) {
                newArr[k] = arr[i];
                k++;
            }
        }

        return newArr;
    }
}
