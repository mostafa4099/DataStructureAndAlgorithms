package DataStructure.Linear.Array;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File DataStructure.Linear.Array.ResizeArray.java: DataStructureAndAlgorithms
 * @CreationDate 11/23/2022 2:07 PM
 */
public class ResizeArray {
    public static void main(String[] args) {
        int nums [] = {2, 0, 6, 0, 4, 7};

        printArray(nums);
        System.out.println("Size of the array: "+nums.length);

        nums = resizeArray(nums, 10);
        printArray(nums);
        System.out.println("Size of the array: "+nums.length);
    }

    /**
     * resize the given array.
     * @param nums
     * @return tempArr
     */
    static int [] resizeArray(int[] nums, int capacity) {
        int tempArr [] = new int[capacity];

        for (int i = 0; i < nums.length; i++) {
            tempArr[i] = nums[i];
        }

        return tempArr;
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
