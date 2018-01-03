package problem066.plusone;

import utilities.array.ArrayOps;
import utilities.testcase.TestCase;

/**
 * problem link: https://leetcode.com/problems/plus-one/description/
 */
public class PlusOne {

    public static int[] plusOne_solution1(int[] digits) {

        int carryflag = 1;
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] == 9 && carryflag == 1) {
                digits[i] = 0;
                carryflag = 1;
            } else {
                digits[i] = digits[i] + carryflag;
                carryflag = 0;
            }
        }

        if (1 == carryflag) {
            int[] res = new int[digits.length + 1];
            res[0] = carryflag;

            for (int i = 0; i < digits.length; i++) {
                res[i + 1] = digits[i];
            }

            return res;
        }

        return digits;

    }

    public static int[] plusOne_solution2(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        // When initialize newDigits, array is initialized with all values 0,
        // so only need to mark the first array index with value 1.

        return newDigits;
    }


    public static void main(String[] args) {

        int[] digits = null;
        int[] res = null;

        int[] testcase1 = {0};  // output: {1}
        int[] testcase2 = {1, 3, 5, 6}; // output: {1,3,5,7}
        int[] testcase3 = {1, 3, 9, 9}; // output: {1,4,0,0}
        int[] testcase4 = {9, 9, 9}; // output: {1,0,0,0}
        int[] testcase5 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};  // output: {9, 8, 7, 6, 5, 4, 3, 2, 1, 1}

        TestCase testcase = TestCase.TESTCASE_4;
        switch (testcase) {
            case TESTCASE_1:
                digits = testcase1;
                break;
            case TESTCASE_2:
                digits = testcase2;
                break;
            case TESTCASE_3:
                digits = testcase3;
                break;
            case TESTCASE_4:
                digits = testcase4;
                break;
            case TESTCASE_5:
                digits = testcase5;
                break;
            default:
                break;
        }


        ArrayOps.printArray("Original digits: ", digits);
        long startTime = System.nanoTime();  //get start time

        res = plusOne_solution2(digits);

        long endTime = System.nanoTime();  //get end time
        ArrayOps.printArray("Original Array: ", res);
        System.out.println("Application running time: " + (endTime - startTime) + "ns");

    }

}

