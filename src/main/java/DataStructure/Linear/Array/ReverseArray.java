package DataStructure.Linear.Array;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File DataStructure.Linear.Array.ReverseArray.java: DataStructureAndAlgorithms
 * @CreationDate 11/23/2022 2:07 PM
 */
public class ReverseArray {
    public static void main(String[] args) {
        int nums[] = {2, 3, 6, 1, 4, 7};

        //re-assign array with reverse array.
        nums = reverseArray(nums);

        //traversal
        printArray(nums);
        System.out.println();
    }

    /**
     * reverse the given array and return.
     * @param nums
     * @return nums
     */
    static int[] reverseArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int tempNum = nums[start];
            nums[start] = nums[end];
            nums[end] = tempNum;
            start++;
            end--;
        }

        return nums;
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
