package algorithm.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int len = s.nextInt();
        int arr [] = new int [len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random()*1000);
        }
        System.out.println("Random Array: "+Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
