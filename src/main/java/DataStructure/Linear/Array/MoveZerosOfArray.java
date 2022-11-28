package DataStructure.Linear.Array;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File DataStructure.Linear.Array.MoveZerosOfArray.java: DataStructureAndAlgorithms
 * @CreationDate 11/23/2022 2:07 PM
 */
public class MoveZerosOfArray {
    public static void main(String[] args) {
        int nums[] = {2, 0, 6, 0, 4, 7};
        nums = moveZeros(nums);

        printArray(nums);
    }

    /**
     * move the zero element to last of the array.
     * @param nums
     * @return nums
     */
    static int [] moveZeros(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if(nums[j] != 0){
                j++;
            }
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
