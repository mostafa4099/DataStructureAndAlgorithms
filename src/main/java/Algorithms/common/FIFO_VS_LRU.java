package Algorithms.common;

import java.util.Arrays;

public class FIFO_VS_LRU {
    public static void main(String[] args) {
        int arr [] = {1, 3, 2, 1, 4, 5, 2, 3, 4, 5};
        int a [] = new int [3];
        int ctr=0;
        
        for (int i = 0; i < arr.length; i++) {
            if(i<3){
                    a[i] = arr[i];
                    System.out.println("Array: "+Arrays.toString(a));
            } else {
                for (int j = 0; j < a.length; j++) {
                   if(a[j]==arr[i]){
                       break;
                   } else{
                       a[j] = arr[i];
                       System.out.println("Array: "+Arrays.toString(a));
                       ctr++;
                       break;
                   }
                }
            }
        }
        System.out.println("Count: "+ctr);
    }
}
