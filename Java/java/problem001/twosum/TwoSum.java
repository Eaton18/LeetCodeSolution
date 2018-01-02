package problem001.twosum;

import java.util.HashMap;

/**
 * problem link: https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {

    public class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];

            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        res[0] = i;
                        res[1] = j;
                    }
                }

            }

            return res;
        }
    }


    public class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
            int[] res = new int[2];

            // nums = [2, 7, 11, 15]
            for (int i = 0; i < nums.length; i++) {
                if (hMap.containsKey(nums[i])) {
                    res[0] = hMap.get(nums[i]);
                    res[1] = i;
                    break;
                } else {
                    hMap.put(target - nums[i], i);
                }
            }

            return res;
        }
    }

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
