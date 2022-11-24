package DataStructure.Linear.Array;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File DataStructure.Linear.Array.RemoveEvenIntegerFromArray.java: DataStructureAndAlgorithms
 * @CreationDate 11/23/2022 2:07 PM
 */
public class RemoveEvenIntegerFromArray {
    public static void main(String[] args) {
        int nums[] = {2, 3, 6, 1, 4, 7};

        //re-assign array with non-even or odd integers array.
        nums = removeEvenInteger(nums);

        //traversal
        printArray(nums);
        System.out.println();
    }

    /**
     * find out odd numbers and return them as new array to remove even numbers
     * @param nums
     * @return oddNums
     */
    static int[] removeEvenInteger(int[] nums) {
        int foundIdxCtr = 0;

        //find out number of non-even/odd integer
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                foundIdxCtr++;
            }
        }

        //declare array to store odd integers
        int[] oddNums = new int[foundIdxCtr];
        int idx = 0;

        //initialize odd integers in new array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                oddNums [idx] = nums[i];
                idx++;
            }
        }

        return oddNums;
    }

    /**
     * Iterate array element and print it
     * @param nums
     */
    static void printArray(int[] nums) {
        for (int item : nums) {
            System.out.print(item + " ");
        }
    }
}
