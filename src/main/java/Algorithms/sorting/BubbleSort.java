package Algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int len = s.nextInt();
        int arr [] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random()*1000);
        }
        System.out.println("Random Array: "+Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
