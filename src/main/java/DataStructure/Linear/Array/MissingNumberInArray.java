package DataStructure.Linear.Array;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File DataStructure.Linear.Array.MissingNumberInArray.java: DataStructureAndAlgorithms
 * @CreationDate 11/23/2022 2:07 PM
 */
public class MissingNumberInArray {

    public static void main(String[] args) {
        int nums [] = {2,1,3,5,6,8,7};
        System.out.println(findMissingNumber(nums));
    }

    /**
     * find the missing number of array of n natural numbers.
     * @param nums
     * @return sum
     */
    static int findMissingNumber(int[] nums) {
        int n = nums.length+1;
        int sum = n*(n+1)/2; //sum of n natural numbers

        // subtract array elements from n natural number
        for(int num : nums){
            sum = sum - num;
        }

        // return final output of sum which is the missing number
        return sum;
    }
}
