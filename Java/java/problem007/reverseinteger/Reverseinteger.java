package problem007.reverseinteger;

/*
*  problem link: https://leetcode.com/problems/reverse-integer/description/
*/

public class Reverseinteger {

    public class Solution {
        public int reverse(int x) {

            long res = 0;
            while (x != 0) {
                res = res * 10 + x % 10;
                x = x / 10;
            }
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
                return 0;

            return (int) res;
        }

    }

    public static void main(String[] args) {
        int testCase1 = 123;
        int testCase2 = -123;
        int testCase3 = 120;
        int testCase4 = -1230;

        Reverseinteger reverseinteger = new Reverseinteger();

        Reverseinteger.Solution rs = reverseinteger.new Solution();

        int res1 = rs.reverse(testCase1);
        int res2 = rs.reverse(testCase2);
        int res3 = rs.reverse(testCase3);
        int res4 = rs.reverse(testCase4);

        System.out.println("Testcase: " + testCase1 + "\t Res: " + res1);
        System.out.println("Testcase: " + testCase2 + "\t Res: " + res2);
        System.out.println("Testcase: " + testCase3 + "\t Res: " + res3);
        System.out.println("Testcase: " + testCase4 + "\t Res: " + res4);

    }

}



