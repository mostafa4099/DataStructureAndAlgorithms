package Algorithms.searching;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {45, 58, 12, 48, 52, 65, 98};
        int item = 98, i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println(item + " is located at " + i
                        + " index position of the array.");
                break;
            }
        }
        if (i == arr.length) {
            System.out.println(item + " doesn't exist in the array.");
        }
    }
}
