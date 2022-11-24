package DataStructure.Linear.Array;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File DataStructure.Linear.Array.SecondMaxOfArray.java: DataStructureAndAlgorithms
 * @CreationDate 11/23/2022 2:07 PM
 */
public class SecondMaxOfArray {
    public static void main(String[] args) {
        int nums[] = {2, 3, 7, 6, 1, 4, 6, 7};
        System.out.println(find2ndMaxValue(nums));
    }

    /**
     * find the second maximum integer of given array
     *
     * @param nums
     * @return secondMaxVal
     */
    static int find2ndMaxValue(int[] nums) {
        int maxVal = Integer.MIN_VALUE;
        int secondMaxVal = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxVal) {
                secondMaxVal = maxVal;
                maxVal = nums[i];
            } else if (nums[i] > secondMaxVal && nums[i] != maxVal) {
                secondMaxVal = nums[i];
            }
        }

        return secondMaxVal;
    }
}
