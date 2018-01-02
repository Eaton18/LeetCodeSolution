package problem035.searchinsertposition;

import utilities.array.ArrayOps;
import utilities.testcase.TestCase;

/**
 * problem link: https://leetcode.com/problems/search-insert-position/description/
 */
public class SearchInsertPosition {

    public static int searchInsertPosition(int[] nums, int target) {

        int index = 0;
        for (index = 0; index < nums.length; index++) {
            if (nums[index] >= target){
                return index;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int[] nums = null;
        int val = 0;

        /*
        * Input: [1,3,5,6], 5
        * Output: 2
        *
        * Input: [1,3,5,6], 2
        * Output: 1
        *
        * Input: [1,3,5,6], 7
        * Output: 4
        *
        * Input: [1,3,5,6], 0
        * Output: 0
        * */
        int[] testcase1 = {1, 3, 5, 6};
        int val1 = 5;
        int val2 = 2;
        int val3 = 7;
        int val4 = 0;

        TestCase testcase = TestCase.TESTCASE_4;
        switch (testcase) {
            case TESTCASE_1:
                nums = testcase1;
                val = val1;
                break;
            case TESTCASE_2:
                nums = testcase1;
                val = val2;
                break;
            case TESTCASE_3:
                nums = testcase1;
                val = val3;
                break;
            case TESTCASE_4:
                nums = testcase1;
                val = val4;
                break;
            default:
                break;
        }

        ArrayOps.printArray("Original Array: ", nums);

        int len = searchInsertPosition(nums, val);

        System.out.println("Length: " + len);
        ArrayOps.printArray("Processed Array: ", nums);
    }
}
