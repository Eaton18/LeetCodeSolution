package problem027.removeelement;

import utilities.array.ArrayOps;

/**
 * problem link: https://leetcode.com/problems/remove-element/description/
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int len = 0;  // record the duplicated array length
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[len++] = nums[i];
            }
        }

        return len;
    }

    public enum Testcase {
        TESTCASE_1, TESTCASE_2, TESTCASE_3, TESTCASE_4
    }

    public static void main(String[] args) {

        int[] nums = null;
        int val = 0;

        int[] testcase1 = {3, 2, 2, 3};
        int val1 = 3;
        int[] testcase2 = {1};
        int val2 = 1;

        Testcase testcase = Testcase.TESTCASE_1;
        switch (testcase) {
            case TESTCASE_1:
                nums = testcase1;
                val = val1;
                break;
            case TESTCASE_2:
                nums = testcase2;
                val = val2;
                break;
            default:
                break;
        }

        ArrayOps.printArray("Original Array: ", nums);

        int len = removeElement(nums, val);

        System.out.println("Length: " + len);
        ArrayOps.printArray("Processed Array: ", nums);
    }

}
