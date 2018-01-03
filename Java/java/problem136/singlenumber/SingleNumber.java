package problem136.singlenumber;

import utilities.testcase.TestCase;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * problem link: https://leetcode.com/problems/single-number/description/
 */
public class SingleNumber {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     *
     * @param nums
     * @return
     */
    public static int singleNumber_Hashset(int[] nums) {

        HashSet<Integer> hSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (hSet.contains(nums[i])) {
                hSet.remove(nums[i]);
            } else {
                hSet.add(nums[i]);
            }
        }

        Iterator it = hSet.iterator();

        return (int) it.next();
    }


    /**
     * If we take XOR of zero and some bit, it will return that bit:
     * a xor 0 = a
     * If we take XOR of two same bits, it will return 0:
     * a xor a = 0
     * a xor b xor a=(a xor a) xor b=0 xor b=b
     * So we can XOR all bits together to find the unique number.
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(1)
     *
     * @param nums
     * @return
     */
    public static int singleNumber_xor(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            nums[0] = nums[0] ^ nums[i];
        }

        return nums[0];

    }


    public static void main(String[] args) {
        int[] nums = null;

        int[] testcase1 = {1};
        int[] testcase2 = {-1};
        int[] testcase3 = {2, 2, 1};
        int[] testcase4 = {2, 1, 2, 3, 4, 3, 4};

        TestCase testcase = TestCase.TESTCASE_4;
        switch (testcase) {
            case TESTCASE_1:
                nums = testcase1;
                break;
            case TESTCASE_2:
                nums = testcase2;
                break;
            case TESTCASE_3:
                nums = testcase3;
                break;
            case TESTCASE_4:
                nums = testcase4;
                break;
            default:
                break;
        }

        int res = singleNumber_xor(nums);

        System.out.println("Single Number: " + res);
    }

}
