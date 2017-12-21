package problem007.reverseinteger;

/*
* https://leetcode.com/problems/reverse-integer/description/
*/

public class Reverseinteger {

    public class Solution1 {
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

}



