package com.leetcode.problem001.twosum;

/**
 * Created by yitgeng on 11/15/2017.
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum twosum = new TwoSum();

        TwoSum.Solution1 solution1 = twosum.new Solution1();
        TwoSum.Solution2 solution2 = twosum.new Solution2();

        int[] res1 = solution1.twoSum(nums, target);
        int[] res2 = solution1.twoSum(nums, target);

        System.out.println(res1[0] + "\t" + res1[1]);
        System.out.println(res2[0] + "\t" + res2[1]);
    }
}
