package in.knowledgegate.dsa.math;

import java.util.Arrays;

/**
 * Given an array, rotate the array to the right
 * by k steps, where k is non-negative.
 *
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 *
 * Example 2:
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 *
 *
 * Constraints:
 * 1 <= nums.length <= 105
 * -231 <= nums[i] <= 231 - 1
 * 0 <= k <= 105
 */
public class RotateArray {
  public static void main(String[] args) {
    RotateArray rotateArray = new RotateArray();
    int[] nums = new int[]{1,2,3,4,5,6,7};
    System.out.print("Rotating " + Arrays.toString(nums));
    rotateArray.rotate(nums, 10);
    System.out.println(" : " + Arrays.toString(nums));
  }
  public void rotate(int[] nums, int k) {
    // Another way: int[] copyArr = nums.clone();
    int[] copyArr = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      copyArr[i] = nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      nums[(i+k)%nums.length] = copyArr[i];
    }
  }
}







