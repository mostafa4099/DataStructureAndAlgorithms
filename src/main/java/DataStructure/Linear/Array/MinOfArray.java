package DataStructure.Linear.Array;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File DataStructure.Linear.Array.MinOfArray.java: DataStructureAndAlgorithms
 * @CreationDate 11/23/2022 2:07 PM
 */
public class MinOfArray {
    public static void main(String[] args) {
        int nums[] = {2, 3, 6, 1, 4, 7};
        System.out.println(findMinValue(nums));
    }

    /**
     * find the minimum integer of given array
     * @param nums
     * @return minVal
     */
    static int findMinValue(int[] nums) {
        int minVal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minVal) {
                minVal = nums[i];
            }
        }

        return minVal;
    }
}
