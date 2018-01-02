package problem026.removeduplicatesfromsortedarray;

import sun.security.util.Length;
import utilities.array.ArrayOps;

/**
 * problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return nums.length;
        }

        int len = 0;  // record the duplicated array length
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[len]) {
                nums[++len] = nums[i];
            }
        }

        return len + 1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 4, 5, 6};

        int len = removeDuplicates(nums);
        System.out.println("Length: " + len);
        ArrayOps.printArray("Array: ", nums);
    }

}
