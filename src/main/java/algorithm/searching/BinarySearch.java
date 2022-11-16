package algorithm.searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {45, 58, 12, 48, 52, 65, 98};
        int target = 98;
        
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        
        int searchIndx = bSearch(arr, target);
        
        if (searchIndx == -1) {
            System.out.println("Search Element Not Found");
        } else{
            System.out.println(target+" is the "+(searchIndx+1)+" Element of the Sorted Array.");
        }
    }

    private static int bSearch(int[] arr, int target) {
       int low = 0, high = arr.length - 1, mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid]<target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
