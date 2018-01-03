package problem118.pascaltriangle;

import utilities.testcase.TestCase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * problem link: https://leetcode.com/problems/pascals-triangle/description/
 */
public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> lstPascalTriangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> lstRowArr = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    lstRowArr.add(1);
                } else {
                    List<Integer> tmpPascalTriangle = lstPascalTriangle.get(i - 1);
                    lstRowArr.add(tmpPascalTriangle.get(j - 1) + tmpPascalTriangle.get(j));
                }
            }

            lstPascalTriangle.add(lstRowArr);
        }

        return lstPascalTriangle;
    }


    public static void main(String[] args) {

        int numRows = 0;

        int testcase1 = 5;
        int testcase2 = 10;
        int testcase3 = 18;

        TestCase testcase = TestCase.TESTCASE_2;
        switch (testcase) {
            case TESTCASE_1:
                numRows = testcase1;
                break;
            case TESTCASE_2:
                numRows = testcase2;
                break;
            case TESTCASE_3:
                numRows = testcase3;
                break;
            default:
                break;
        }

        List<List<Integer>> lstPascalTriangle = generate(numRows);

        Iterator<List<Integer>> itPascalTriangle = lstPascalTriangle.iterator();
        while (itPascalTriangle.hasNext()) {
            List<Integer> itPascalRow = itPascalTriangle.next();
            Iterator<Integer> it = itPascalRow.iterator();
            while (it.hasNext()) {
                System.out.print(it.next());
            }
            System.out.println();
        }
    }

}
