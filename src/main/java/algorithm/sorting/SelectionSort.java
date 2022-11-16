package algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr [] = {12,45,21,98,74,6,56};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("Sorted array: "+Arrays.toString(arr));
    }
}
