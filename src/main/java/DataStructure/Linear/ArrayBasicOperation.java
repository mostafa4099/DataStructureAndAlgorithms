package DataStructure.Linear;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasicOperation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter capacity of array");
        //declaration
        int arr[] = new int[s.nextInt()];
        //insertion
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter array element " + (i+1));
            arr[i] = s.nextInt();
        }
        //traversion
        System.out.print("Full Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //update
        System.out.println("Enter Index Position of Update Element");
        int upPos = s.nextInt();
        System.out.println("Enter Update Value");
        arr[upPos] = s.nextInt();
        System.out.println("After Update Array: " + Arrays.toString(arr));
        //searching
        System.out.println("Enter Serach Value");
        int searchElement = s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                System.out.println(searchElement + " located at " + (i + 1)+" position");
            }
        }
        //deletion
        System.out.println("Enter Deletable Index Position");
        int delPos = s.nextInt();
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i != delPos) {
                newArr[k++] = arr[i];
            }
        }
        arr = newArr;
        System.out.println("After Deletion Array: " + Arrays.toString(arr));
    }
}
